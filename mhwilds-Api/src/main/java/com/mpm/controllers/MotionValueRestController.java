package com.mpm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mpm.entities.MotionValue;
import com.mpm.models.services.IGeneralService;

@RestController
@RequestMapping("motion-values")
public class MotionValueRestController {

	@Autowired
	private IGeneralService<MotionValue> motionValueService;

	@GetMapping
	public List<MotionValue> getMotionValues() {
		return motionValueService.findAll();
	}

}
