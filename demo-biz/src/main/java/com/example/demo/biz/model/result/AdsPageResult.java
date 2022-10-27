package com.example.demo.biz.model.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author tangsh
 * @date 2022/10/27
 */
@Data
@ApiModel(description = "广告信息")
public class AdsPageResult {

    @ApiModelProperty(value = "广告标题", example = "")
    private String title;

    @ApiModelProperty(value = "广告描述", example = "")
    private String des;

    @ApiModelProperty(value = "广告图片地址", example = "")
    private String img;

    @ApiModelProperty(value = "广告内容", example = "")
    private String content;
}
