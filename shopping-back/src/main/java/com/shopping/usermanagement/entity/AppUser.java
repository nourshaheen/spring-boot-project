package com.shopping.usermanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.shopping.base.entity.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "sec_users")
public class AppUser extends BaseEntity<Long> {
	
	private String firstName ;
	
	private String lastName;

}
