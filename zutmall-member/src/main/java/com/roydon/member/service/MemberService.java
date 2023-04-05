package com.roydon.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.roydon.common.utils.PageUtils;
import com.roydon.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author roydon
 * @email 3133010060@qq.com
 * @date 2023-04-05 17:43:26
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

