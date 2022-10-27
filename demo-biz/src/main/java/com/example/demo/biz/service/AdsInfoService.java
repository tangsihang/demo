package com.example.demo.biz.service;

import com.example.demo.biz.model.param.AdsPageParam;
import com.example.demo.common.model.PageDTO;
import com.example.demo.dao.entity.AdsInfoEntity;

import java.util.List;

/**
 * @author tangsh
 * @date 2022/10/27
 */

public interface AdsInfoService {

    List<AdsInfoEntity> list();

    PageDTO<AdsInfoEntity> page(AdsPageParam param);
}
