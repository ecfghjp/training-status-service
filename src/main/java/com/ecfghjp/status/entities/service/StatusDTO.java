package com.ecfghjp.status.entities.service;

import java.util.Date;

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

	private String trainingId;

	private String employeeShortName;

	private Date startDateTime;

	private Date lastEditedDateTime;

	private Date finishDateTime;

	private int points;

}
