
package com.revature.training.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.JoinColumns;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "doctor_availability")
public class DoctorAvailability {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int serialNo;

	private String availableDate;

	private String availableTime;
	
	private int doctorId;


	
}
