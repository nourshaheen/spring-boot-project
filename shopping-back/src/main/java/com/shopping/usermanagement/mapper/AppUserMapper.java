package com.shopping.usermanagement.mapper;

import org.mapstruct.Mapper;

import com.shopping.base.mapper.BaseMapper;
import com.shopping.usermanagement.dto.AppUserDto;
import com.shopping.usermanagement.entity.AppUser;

@Mapper(componentModel = "spring")
public interface AppUserMapper extends BaseMapper<AppUser, AppUserDto>{
	
//	@Override
//	@Mapping(source = "" , target = "")
//	AppUserDto map(AppUser t);

}
