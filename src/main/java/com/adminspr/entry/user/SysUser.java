package com.adminspr.entry.user;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@ToString
public class SysUser {


  private String id;
  private String name;
  private String email;
  private String password;
  private Date dob;
  private Integer sysId;//系统id
  private String status;
  private String deskSystem;
  private Set<SysRole> sysRoles = new HashSet<SysRole>(0);

  public SysUser(){}

  public SysUser(String name,String email,String password,Date dob,Set<SysRole> sysRoles){
    this.name = name;
    this.email = email;
    this.password = password;
    this.dob = dob;
    this.sysRoles = sysRoles;
  }

  public SysUser(String id ,String name,String email,String password,Date dob,Set<SysRole> sysRoles){
    this.id = id;
    this.name = name;
    this.email = email;
    this.password = password;
    this.dob = dob;
    this.sysRoles = sysRoles;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Date getDob() {
    return dob;
  }

  public void setDob(Date dob) {
    this.dob = dob;
  }

  public Set<SysRole> getSysRoles() {
    return sysRoles;
  }

  public Integer getSysId() {
    return sysId;
  }

  public void setSysId(Integer sysId) {
    this.sysId = sysId;
  }

  public void setSysRoles(Set<SysRole> sysRoles) {
    this.sysRoles = sysRoles;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
  public String getDeskSystem() {
    return deskSystem;
  }

  public void setDeskSystem(String deskSystem) {
    this.deskSystem = deskSystem;
  }
}
