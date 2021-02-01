package com.ecfghjp.status.repository.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Status{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long statusId;
	
	@NotNull
	private String trainingId; 
	
	@NotNull
	private String employeeShortName;
	
	private Date startDateTime = new Date();
	
	private Date lastEditedDateTime;

	private Date finishDateTime;
	
	private int points = 0;

}
