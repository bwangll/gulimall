package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author bwang
 * @email bwang@gmail.com
 * @date 2020-12-27 17:11:47
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
