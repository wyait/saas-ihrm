package com.pyy.ihrm.domain.system.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * ---------------------------
 * 模糊查询条件VO
 * ---------------------------
 * 作者：  pyy
 * 时间：  2019-11-13 10:35:07
 * 版本：  v1.0
 * ---------------------------
 */
@Data
@ApiModel(value = "RoleQueryConditionVO",description = "角色类")
public class RoleQueryConditionVO {

    @ApiModelProperty("名称")
    private String name;

}