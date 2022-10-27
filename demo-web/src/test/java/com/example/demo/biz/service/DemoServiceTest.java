package com.example.demo.biz.service;

import com.alibaba.fastjson.JSON;
import com.example.demo.dao.entity.AdsInfoEntity;
import com.example.demo.web.WebApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author linjian
 * @date 2019/1/28
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {WebApplication.class})
public class DemoServiceTest {

    @Autowired
    private AdsInfoService adsInfoService;

    @Test
    public void test_query_ads_list() {
        List<AdsInfoEntity> entityList = adsInfoService.list();
        log.info("{}", JSON.toJSONString(entityList));
    }

}