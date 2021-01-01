package com.atguigu.gulimall.order.dao;

import org.apache.ibatis.annotations.Mapper;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 订单
 * 
 * @author bwang
 * @email bwang@gmail.com
 * @date 2020-12-27 22:46:08
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
