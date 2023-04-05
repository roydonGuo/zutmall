package com.roydon.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.roydon.common.utils.PageUtils;
import com.roydon.common.utils.Query;

import com.roydon.product.dao.CategoryDao;
import com.roydon.product.entity.CategoryEntity;
import com.roydon.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // 1.查出所有数据
        List<CategoryEntity> categoryEntityList = baseMapper.selectList(null);

        // 2.组装树形结构
        List<CategoryEntity> categoryEntityParent = categoryEntityList.stream().filter(c -> {
            return c.getParentCid() == 0;
        }).map(c -> {
            c.setChildren(getChildren(c, categoryEntityList));
            return c;
        }).sorted((c1, c2) -> {
            return c1.getSort() - c2.getSort();
        }).collect(Collectors.toList());

        return categoryEntityList;
    }

    private List<CategoryEntity> getChildren(CategoryEntity parent, List<CategoryEntity> list) {
        List<CategoryEntity> children = list.stream().filter(c -> {
            return c.getParentCid() == parent.getCatId();
        }).map(c -> {
            // 递归
            c.setChildren(getChildren(c, list));
            return c;
        }).sorted((c1, c2) -> {
            return c1.getSort() - c2.getSort();
        }).collect(Collectors.toList());
        return children;
    }

}