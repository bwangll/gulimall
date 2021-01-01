package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author bwang
 * @email bwang@gmail.com
 * @date 2020-12-29 20:46:00
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
