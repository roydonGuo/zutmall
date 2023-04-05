package com.roydon.product;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.roydon.product.service.BrandService;
import com.roydon.product.entity.BrandEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = ZutmallProductApplication.class)
@RunWith(SpringRunner.class)
public class ZutmallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    public void testSave() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("huawei");
//        brandEntity.setSort(1);
//        brandService.save(brandEntity);
        LambdaQueryWrapper<BrandEntity> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(BrandEntity::getBrandId,1L);
        List<BrandEntity> brandEntities = brandService.list(lambdaQueryWrapper);
        brandEntities.forEach(System.out::println);
    }

}
