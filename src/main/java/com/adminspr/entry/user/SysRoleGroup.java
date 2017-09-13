package com.adminspr.entry.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@ToString
public class SysRoleGroup  {
    private Integer id;

    private Integer sysRoleId;

    private Integer sysGroupId;
}
