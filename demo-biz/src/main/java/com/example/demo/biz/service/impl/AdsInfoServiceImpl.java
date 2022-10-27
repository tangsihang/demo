package com.example.demo.biz.service.impl;

import com.example.demo.biz.service.AdsInfoService;
import com.example.demo.dao.entity.AdsInfoEntity;
import com.example.demo.dao.repository.AdsInfoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AdsInfoServiceImpl implements AdsInfoService {

    @Autowired
    private AdsInfoRepository adsInfoRepository;

    @Override
    public List<AdsInfoEntity> list(){
       return adsInfoRepository.list();
    }
}
