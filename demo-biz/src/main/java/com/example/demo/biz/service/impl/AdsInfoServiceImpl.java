package com.example.demo.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.biz.model.param.AdsPageParam;
import com.example.demo.biz.service.AdsInfoService;
import com.example.demo.biz.utils.PageUtils;
import com.example.demo.common.model.PageDTO;
import com.example.demo.dao.entity.AdsInfoEntity;
import com.example.demo.dao.repository.AdsInfoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tangsh
 * @date 2022/10/27
 */

@Service
@Slf4j
public class AdsInfoServiceImpl implements AdsInfoService {

    @Autowired
    private AdsInfoRepository adsInfoRepository;

    @Override
    public List<AdsInfoEntity> list() {
        return adsInfoRepository.list();
    }

    @Override
    public PageDTO<AdsInfoEntity> page(AdsPageParam param) {
        int pageNo = param.getPageNo();
        int pageSize = param.getPageSize();
        IPage<AdsInfoEntity> page = new Page<>(pageNo, pageSize);
        LambdaQueryWrapper<AdsInfoEntity> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(AdsInfoEntity::getStatus, "ON");
        IPage<AdsInfoEntity> record = adsInfoRepository.page(page, queryWrapper);
        return PageUtils.copy(record);
    }
}
