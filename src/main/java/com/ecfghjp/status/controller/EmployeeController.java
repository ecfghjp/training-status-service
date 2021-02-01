package com.ecfghjp.status.controller;

import java.lang.invoke.MethodHandles;
import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecfghjp.status.entities.service.StatusDTO;
import com.ecfghjp.status.exception.EmployeeNotFoundException;
import com.ecfghjp.status.repository.entities.Status;
import com.ecfghjp.status.service.StatusService;

@RestController
@RequestMapping("/status")
public class EmployeeController {
	private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass().getSimpleName());

	@Autowired
	private StatusService statusService;

	@PostMapping("/")
	public StatusDTO saveEmployee(@Valid @RequestBody StatusDTO statusDto) {
		logger.info("Inside status controller method save status");
		// Status DTO conversion
		Status statusEntity = convertToDto(statusDto);
		return statusService.saveStatus(statusEntity);
	}

	@PostMapping("/search")
	public List<StatusDTO> findEmployee(@RequestBody StatusDTO statusDto) throws Exception {
		logger.info("Inside status controller method find status");

		Status statusEntity = convertToDto(statusDto);

		List<StatusDTO> statusDtos = statusService.findStatus(statusEntity);
		if (null == statusDtos) {
			throw new EmployeeNotFoundException("Status not found");
		} else {
			return statusDtos;
		}
	}

	private Status convertToDto(StatusDTO statusDto) {
		ModelMapper modelMapper = new ModelMapper();
		Status statusEntity = modelMapper.map(statusDto, Status.class);
		return statusEntity;
	}
}
