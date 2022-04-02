package com.shopping.usermanagement.repository;

import org.springframework.stereotype.Repository;

import com.shopping.base.repositoty.BaseRepository;
import com.shopping.usermanagement.entity.AppUser;

@Repository
public interface AppUserRepository extends BaseRepository<AppUser, Long> {

}
