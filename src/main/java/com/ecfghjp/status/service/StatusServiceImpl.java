package com.ecfghjp.status.service;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecfghjp.status.entities.service.StatusDTO;
import com.ecfghjp.status.repository.StatusRepository;
import com.ecfghjp.status.repository.entities.Status;
import com.ecfghjp.status.repository.filter.QuerySpecs;



@Service
public class StatusServiceImpl implements StatusService {
	private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass().getSimpleName());

	@Autowired
	private StatusRepository statusRepository;
	
	@Autowired
	private QuerySpecs querySpecs;
	
	

	public StatusServiceImpl(StatusRepository statusRepository, QuerySpecs querySpecs) {
		this.statusRepository = statusRepository;
		this.querySpecs = querySpecs;
	}


	@Override
	public StatusDTO saveStatus(Status status) {
		logger.info("Inside status service method save status");
		//Status DTO creation ad converstion
		Status statusReturned = statusRepository.save(status);
		ModelMapper modelMapper = new ModelMapper();
		StatusDTO statusDTO = modelMapper.map(statusReturned,StatusDTO.class);
		return statusDTO;
	}

	@Override
	public List<StatusDTO> findStatus(Status status) {
		logger.info("Inside status service method get status");
		List<Status> statusReturned = querySpecs.fetchStatus(status);
		ModelMapper modelMapper = new ModelMapper();
		List<StatusDTO> statusDTOs = statusReturned
										.stream()
										.map(entity -> modelMapper.map(entity,StatusDTO.class))
										.collect(Collectors.toList());
		return statusDTOs;
	}

	@Override
	public StatusDTO updateStatus(Status status) {
		logger.info("Inside status service method update status");
		// TODO Auto-generated method stub
		return null;
	}

}
