package com.shopping.base.mapper;

import java.util.List;
import java.util.Set;

import org.mapstruct.MappingTarget;

public interface BaseMapper <T, DTO> {
	
	
	/**
	 * 
	 * @param t
	 * @return
	 */
	DTO map (T t);
	/**
	 * 
	 * @param dto
	 * @return
	 */
	T unMap (DTO dto);
	/**
	 * 
	 * @param t
	 * @param dto
	 */
	T unMap (@MappingTarget T t , DTO dto);
	/**
	 * 
	 * @param t
	 * @return
	 */
	List<DTO> map (List<T> t);
	
	/**
	 * 
	 * @param t
	 * @return
	 */
	Set<DTO> map (Set<T> t);
	/**
	 * 
	 * @param dto
	 * @return
	 */
	List<T> unMap (List<DTO> dto);

}
