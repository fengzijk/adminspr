package com.adminspr.entry.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



import java.util.Date;
@Setter
@Getter
@ToString
public class SysGroup  {


    private Integer id;
    private String name;
    private String description ;
    private Date createTime ;
    private Date updateTime ;
    private String sysId;
    private int defaultGroup;

    private String deskSystem;

    private Integer checked;

}
