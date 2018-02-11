package com.transen.tsrelease;

import com.transen.tsrelease.model.TbProduct;
import com.transen.tsrelease.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author luoyun
 * @ClassName: IntelliJ IDEA
 * @Description: 操作类型
 * @date 2018/2/11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
public class TbProductServiceTest {

    @Autowired
    ProductService productService;

    @Test
    public void selectProTree(){
        TbProduct tbProduct=productService.selectProParent();
        TbProduct tbProduct1=productService.selectProTree(tbProduct);
        System.out.println(tbProduct1.getName());
    }
}
