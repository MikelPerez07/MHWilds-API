package com.mpm.models.services;

import java.util.List;

public interface IMotionValueService<T> extends IGeneralService<T> {

	List<T> findByWeaponType(String weaponType);
}
