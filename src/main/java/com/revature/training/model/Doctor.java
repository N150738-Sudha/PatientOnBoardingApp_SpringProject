package com.revature.training.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="doctors")
public class Doctor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int doctorId;
	@Column(nullable=false)
	private String doctorName;
	@Column(unique=true, nullable=false)
	private String doctorPassword;
	@Column(unique=true, nullable=false)
	private String doctorMobileNo;
	@Column(unique=true, nullable=false)
	private String doctorEmail;
	@Column(nullable=false)
	private String doctorDomain;
	@Column(nullable=false)
	private String doctorExperience;
	@Column(nullable=false)
	private int doctorSalary;
	@Column
	private String status;
	
	
	
  }
 
