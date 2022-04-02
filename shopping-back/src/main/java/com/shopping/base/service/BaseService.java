package com.shopping.base.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.MappedSuperclass;

import org.springframework.beans.factory.annotation.Autowired;

import com.shopping.base.repositoty.BaseRepository;

@MappedSuperclass
public abstract class BaseService<T, ID extends Number> {

	@Autowired
	private BaseRepository<T, ID> baseRepository;

	/**
	 * 
	 * @return
	 */
	public List<T> findAll() {
		return baseRepository.findAll();
	}

	/**
	 * @param id
	 * @return
	 */
	public T findById(ID id) {
		return baseRepository.findById(id).orElse(null);
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public T getOne(ID id) {
		return baseRepository.getById(id);
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Optional<T> getById(ID id) {
		return baseRepository.findById(id);
	}

	/**
	 * @param entity
	 * @return
	 */
	public T insert(T entity) {
		return baseRepository.save(entity);

	}

	/**
	 * @param entity
	 * @return
	 */
	public T persist(T entity) {
		return baseRepository.saveAndFlush(entity);

	}

	/**
	 *
	 */
	public T update(T entity) {
		return baseRepository.save(entity);
	}

	/**
	 * @param id
	 * @return
	 */
	public void deleteById(ID id) {
		baseRepository.deleteById(id);
	}

	/**
	 * @param ids
	 */
	public void deleteAll(List<ID> ids) {
		ids.forEach(id -> {
			baseRepository.deleteById(id);
		});
	}

}
