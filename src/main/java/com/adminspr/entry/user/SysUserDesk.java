package com.adminspr.entry.user;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
public class SysUserDesk {

  private Integer id;
  private String fid;
  private String name;
  private String email;
  private Date dob;
  private Integer sysId;//系统id
  private String status;

  private Set<SysRole> sysRoles = new HashSet<>(0);

  public SysUserDesk(){}

  public SysUserDesk(String name, String email, String password, Date dob, Set<SysRole> sysRoles){
    this.name = name;
    this.email = email;
    this.dob = dob;
    this.sysRoles = sysRoles;
  }

  public SysUserDesk(Integer id , String name, String email, String password, Date dob, Set<SysRole> sysRoles){
    this.id = id;
    this.name = name;
    this.email = email;
    this.dob = dob;
    this.sysRoles = sysRoles;
  }


}
