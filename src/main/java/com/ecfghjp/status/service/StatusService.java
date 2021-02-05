package com.ecfghjp.status.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecfghjp.status.entities.service.StatusDTO;
import com.ecfghjp.status.repository.entities.Status;

@Service
public interface StatusService {

	StatusDTO saveStatus(Status status);
	
	List<StatusDTO> findStatus(Status status);

	
}
