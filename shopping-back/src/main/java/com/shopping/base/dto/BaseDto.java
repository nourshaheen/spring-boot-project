package com.shopping.base.dto;

import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
public class BaseDto<ID extends Number> {

	private ID id;
	
	private Integer statusCode;

}
