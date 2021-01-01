package com.atguigu.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author bwang
 * 想要远程调用别的服务
 *  1、引入oprnfeign
 *  2、编写一个接口，告诉spring cloud这个接口需要调用远程服务
 *    声明接口的每一个方法都是调用远程服务的哪一个请求
 *  3、开启远程调用功能
 */
@SpringBootApplication
@EnableFeignClients(basePackages = "com.atguigu.gulimall.member.feign")
@EnableDiscoveryClient
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
