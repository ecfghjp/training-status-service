package com.ecfghjp.status.repository.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
	
	private int attempt;
	
	@NotNull
	private String trainingId; 
	
	@NotNull
	private String employeeShortName;
	
	@CreationTimestamp
	private LocalDateTime startDateTime;
	
	@UpdateTimestamp
	private LocalDateTime lastEditedDateTime;
	
	private LocalDateTime finishDateTime;
	
	private int points = 0;

}
