package com.roydon.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.roydon.common.utils.PageUtils;
import com.roydon.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author roydon
 * @email 3133010060@qq.com
 * @date 2023-04-05 16:20:06
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

