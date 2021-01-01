package com.atguigu.gulimall.product;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;

/**
 * @author bwang
 * @version 1.0
 * @Description TODO
 * @date 2020/12/27 21:11
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Test {

    @Autowired
    private BrandService brandService;

    @org.junit.Test
    public void test() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为1");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

    @org.junit.Test
    public void test1() {
        brandService.removeById(1L);
    }
}
