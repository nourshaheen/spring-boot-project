package com.shopping.base.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@NoRepositoryBean
public interface BaseRepository<T, ID extends Number> extends JpaRepository<T, ID> {
	
	
	@Modifying
    @Transactional
    @Query("update #{#entityName} t SET t.statusCode = :statusCode WHERE t.id = :id")
    void updateStatus(@Param("id") Long id, @Param("statusCode") Integer statusCode);

}
