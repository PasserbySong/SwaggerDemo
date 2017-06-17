package com.example.demo.controller;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2017/6/6.
 */
@ApiModel(value = "User", description = "用户对象")
public class User {

    private String name;
    private Integer age;
    private Integer sex;
    private String remark;

    @ApiModelProperty(value = "姓名",allowableValues = "xxx")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ApiModelProperty(value = "年龄",allowableValues = "22")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @ApiModelProperty(value = "性别",allowableValues = "0",notes = "性别notes")
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @ApiModelProperty(value = "个性签名",allowableValues = "hahahaha")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
