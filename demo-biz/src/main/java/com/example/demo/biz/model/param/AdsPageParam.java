package com.example.demo.biz.model.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author tangsh
 * @date 2022/10/27
 */
@Data
@ApiModel(description = "广告查询-分页参数")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdsPageParam {

    @NotNull(message = "起始页不能为空")
    @ApiModelProperty(value = "起始页", example = "0", required = true)
    private Integer pageNo;

    @NotNull(message = "分页大小不能为空")
    @ApiModelProperty(value = "分页大小", example = "20", required = true)
    private Integer pageSize;
}
