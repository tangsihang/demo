package com.example.demo.biz.service;

import com.alibaba.fastjson.JSON;
import com.example.demo.biz.model.param.AdsPageParam;
import com.example.demo.common.model.PageDTO;
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
 * @author tangsh
 * @date 2022/10/27
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

    @Test
    public void test_query_ads_page() {
        int pageNo = 0;
        int pageSize = 10;
        AdsPageParam param = AdsPageParam.builder().pageNo(pageNo).pageSize(pageSize).build();
        PageDTO<AdsInfoEntity> pageDTO = adsInfoService.page(param);
        log.info("{}", JSON.toJSONString(pageDTO));
    }

}