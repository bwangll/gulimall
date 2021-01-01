package com.atguigu.gulimall.member.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.atguigu.common.utils.R;

/**
 * @author bwang
 */
@FeignClient("gulimall-coupon/")
public interface CouponFeignService {

    @GetMapping("/coupon/coupon/member/list")
    R memberCoupons();
}
