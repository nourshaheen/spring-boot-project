package com.shopping.base.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
public class BaseEntity <ID extends Number> {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ID id;
	
	private Integer statusCode;
	
	@Column(updatable = false)
	private LocalDate createdDate;

	@Column(updatable = false)
	private String createdUser;

	private LocalDate modifiedDate;

	private String modifiedUser; 

}
