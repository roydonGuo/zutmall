package com.roydon.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.roydon.common.utils.PageUtils;
import com.roydon.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author roydon
 * @email 3133010060@qq.com
 * @date 2023-04-05 16:20:06
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

