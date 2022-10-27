
package com.example.demo.web.controller;

import com.example.demo.biz.model.param.AdsPageParam;
import com.example.demo.biz.service.AdsInfoService;
import com.example.demo.common.annotation.ApiRequest;
import com.example.demo.common.entity.Result;
import com.example.demo.common.model.PageDTO;
import com.example.demo.dao.entity.AdsInfoEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tangsh
 * @date 2022/10/27
 */
@Api(tags = "广告模块")
@RestController
@RequestMapping("/front")
public class AdsInfoController {

    @Autowired
    private AdsInfoService adsInfoService;

    @PostMapping("/v1/ads/page")
    @ApiOperation("广告查询-分页")
    @ApiRequest
    public Result<PageDTO<AdsInfoEntity>> page(@RequestBody @Validated AdsPageParam param) {
        PageDTO<AdsInfoEntity> pageResult = adsInfoService.page(param);
        return Result.Success(pageResult);
    }
}
