package com.adminspr.entry.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Setter
@Getter
@ToString
public class PtUser {
	public static int ENABLE_YES=1;//活跃状态
	public static int ENABLE_NO=0;//非活跃状态
	public static int ENABLE_DISABLE=-1;//禁用状态
	
	public static int ACCOUNTTYPE_PERSONAL=1;//个人
	public static int ACCOUNTTYPE_ENTERPRISE=2;//企业
	public static int ACCOUNTTYPE_GOVERNMENT=3;//政府
	public static int ACCOUNTTYPE_NOTSET=-1;//政府
	
    private String id;

    private String name;

    private String password;

    private Integer enable;
    
    private String emailAdd;

    private Date createTime;

    private Date updateTime;

    private Date lastLoginTime;
    
    private String validateCode;
    
    private Date lastActivateTime;
    
    private String phoneNum;
    
    private String salt;
    
    private Integer source;
    
    private String username;

    private Integer usertype;
    
    private Integer accountType;

}