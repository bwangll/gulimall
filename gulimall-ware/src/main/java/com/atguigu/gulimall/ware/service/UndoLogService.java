package com.atguigu.gulimall.ware.service;

import java.util.Map;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.ware.entity.UndoLogEntity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 
 *
 * @author bwang
 * @email bwang@gmail.com
 * @date 2020-12-29 20:46:00
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

