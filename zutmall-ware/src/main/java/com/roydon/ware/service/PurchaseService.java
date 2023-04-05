package com.roydon.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.roydon.common.utils.PageUtils;
import com.roydon.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author roydon
 * @email 3133010060@qq.com
 * @date 2023-04-05 18:17:19
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

