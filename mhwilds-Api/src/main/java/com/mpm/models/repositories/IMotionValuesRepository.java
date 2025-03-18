package com.mpm.models.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mpm.entities.MotionValue;

public interface IMotionValuesRepository extends CrudRepository<MotionValue, Long>{
	
	//Hibernate will take care of perfoming the querys to the BBDD
	List<MotionValue> findByWeaponType(String weaponType); //search by type
	MotionValue findByName(String motionName); //search by motion name

}
