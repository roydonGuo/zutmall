package com.roydon.order.dao;

import com.roydon.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author roydon
 * @email 3133010060@qq.com
 * @date 2023-04-05 18:10:56
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
