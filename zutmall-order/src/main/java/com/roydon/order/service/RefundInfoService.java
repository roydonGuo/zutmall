package com.roydon.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.roydon.common.utils.PageUtils;
import com.roydon.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author roydon
 * @email 3133010060@qq.com
 * @date 2023-04-05 18:10:56
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

