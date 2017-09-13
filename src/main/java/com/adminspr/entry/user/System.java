package com.adminspr.entry.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
public class System {


    private Integer id;
    private String sysName;
    private String sysDescription ;
    private Date createTime ;
    private Date updateTime ;
    private String currentSys;
    private String deskSystem;
    private String url;
}
