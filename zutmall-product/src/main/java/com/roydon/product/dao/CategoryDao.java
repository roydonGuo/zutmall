package com.roydon.product.dao;

import com.roydon.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author roydon
 * @email 3133010060@qq.com
 * @date 2023-04-05 16:20:06
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
