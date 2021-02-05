package com.ecfghjp.status.entities.service;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class StatusDTO {

	private Long statusId;
	
	private int attempt;

	private String trainingId;

	private String employeeShortName;

	private LocalDateTime startDateTime;
	
	private LocalDateTime lastEditedDateTime;

	private LocalDateTime finishDateTime;

	private int points;
	
	private boolean endTraining;

}
