package com.adminspr.entry.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

@Getter
@Setter
@ToString
public class SecurityUser extends SysUser implements UserDetails {

  public SecurityUser(SysUser user){
    if(user != null){
      this.setId(user.getId());
      this.setEmail(user.getEmail());
      this.setName(user.getName());
      this.setPassword(user.getPassword());
      this.setDob(user.getDob());
      this.setSysRoles(user.getSysRoles());
    }
  }


  public Collection<? extends GrantedAuthority> getAuthorities() {

    Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
    Set<SysRole> sysRoles =this.getSysRoles();
    if(sysRoles != null){
      for (SysRole role : sysRoles) {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.getName());
        authorities.add(authority);
      }
    }
    return authorities;
  }


  public String getUsername() {
    return super.getEmail();
  }


  public boolean isAccountNonExpired() {
    return true;
  }


  public boolean isAccountNonLocked() {
    return true;
  }


  public boolean isCredentialsNonExpired() {
    return true;
  }


  public boolean isEnabled() {
    return true;
  }
}
