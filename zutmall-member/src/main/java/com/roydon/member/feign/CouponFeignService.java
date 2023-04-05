package com.roydon.member.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("zutmall-coupon")
public interface CouponFeignService {

    

}