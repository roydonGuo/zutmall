package com.roydon.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.roydon.common.utils.PageUtils;
import com.roydon.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author roydon
 * @email 3133010060@qq.com
 * @date 2023-04-05 16:20:06
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

