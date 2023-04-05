package com.roydon.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.roydon.common.utils.PageUtils;
import com.roydon.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author roydon
 * @email 3133010060@qq.com
 * @date 2023-04-05 18:17:19
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

