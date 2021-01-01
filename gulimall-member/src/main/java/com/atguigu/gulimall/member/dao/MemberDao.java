package com.atguigu.gulimall.member.dao;

import org.apache.ibatis.annotations.Mapper;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 会员
 * 
 * @author bwang
 * @email bwang@gmail.com
 * @date 2020-12-27 22:36:01
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
