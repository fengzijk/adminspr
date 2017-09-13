package com.adminspr.entry.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.util.Date;

@Setter
@Getter
@ToString
public class SysRole {

	private Integer id;
	private String name;
	private String status;
	private Date createTime;
	private Date updateTime;
	private String description;
	private Integer sysId; // 系统id
	private String deskSystem;

	private Integer reSourceId;

	private Integer checked;
}
