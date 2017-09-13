package com.adminspr.entry.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@ToString
public class SysResource{

	private Integer id;

    @JsonProperty(value = "pId")
    private Integer pId;

    private String code;

    private String name;

    private String url;

    private String resource;

    private String description;

    private String status;

    private Date createTime;

    private Date updateTime;

    private String type;

    private Integer sysId;//系统id

    private boolean checked;

    private boolean nocheck;

    private List<SysResource> children;
    private String deskSystem;

}