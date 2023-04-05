package com.roydon.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.roydon.common.utils.PageUtils;
import com.roydon.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author roydon
 * @email 3133010060@qq.com
 * @date 2023-04-05 18:17:20
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

