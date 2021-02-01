package com.ecfghjp.status.repository.filter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ecfghjp.status.entities.service.StatusDTO;
import com.ecfghjp.status.repository.StatusRepository;
import com.ecfghjp.status.repository.entities.Status;

@Component
public class QuerySpecs {

	@Autowired
	StatusRepository statusRepository;

	public List<Status> fetchStatus(Status status) {
		List<Status> statusList = new ArrayList<>();
		QueryExecution queryExecution = new QueryExecution();
		if (status.getTrainingId() != null) {
			queryExecution
					.add(new SearchCriterea("trainingId", status.getTrainingId(), SearchOperation.EQUAL));
		}
		if(status.getEmployeeShortName()!=null) {
			queryExecution
			.add(new SearchCriterea("employeeShortName", status.getEmployeeShortName(), SearchOperation.MATCH));
		}
		
		statusList = statusRepository.findAll(queryExecution);
		return statusList;

	}

}
