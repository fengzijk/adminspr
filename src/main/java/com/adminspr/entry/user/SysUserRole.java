package com.adminspr.entry.user;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SysUserRole {

	private Integer id;

    private String sysUserId;

    private Integer roleId;


}