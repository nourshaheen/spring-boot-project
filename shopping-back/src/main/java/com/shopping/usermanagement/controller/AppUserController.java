package com.shopping.usermanagement.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.usermanagement.dto.AppUserDto;
import com.shopping.usermanagement.mapper.AppUserMapper;
import com.shopping.usermanagement.service.AppUserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class AppUserController {

	private final AppUserService appUserService;
	private final AppUserMapper appUserMapper;

	@GetMapping("")
	public ResponseEntity<?> findAll() {
		List<AppUserDto> dtos = appUserMapper.map(appUserService.findAll());
		return ResponseEntity.ok(dtos);
	}

}
