package com.revature.training.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="patientstable")
public class Patient {

	@Id
	@GeneratedValue
	private long patientId;
	private String password;
	private String patientName;
	private String gender;
	private int patientAge;
	private String mobileNumber;
	private String mailId;
	private String address;

}
