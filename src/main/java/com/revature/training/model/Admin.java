
  package com.revature.training.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="onboardingadmin")
  public class Admin {
	@Id
	  private int adminId;
	  private String  adminPassword;
	  private String adminName;
	  
	  
	  

  }
 