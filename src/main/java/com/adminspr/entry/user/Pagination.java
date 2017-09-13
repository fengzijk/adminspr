package com.adminspr.entry.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Pagination<T>{
	private List<T> list;
	private long total;


	
	
}
