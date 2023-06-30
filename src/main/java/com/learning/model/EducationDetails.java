package com.learning.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EducationDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String qualification;
	
	private String spcialication;
	
	private String  percentage;
	
	private String subjects;

	public EducationDetails() {
		super();
	}

	public EducationDetails(int id, String qualification, String spcialication, String percentage, String subjects) {
		super();
		this.id = id;
		this.qualification = qualification;
		this.spcialication = spcialication;
		this.percentage = percentage;
		this.subjects = subjects;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSpcialication() {
		return spcialication;
	}

	public void setSpcialication(String spcialication) {
		this.spcialication = spcialication;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}
	
}
