package com.vit.vit_result_management;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String prn;
    private String name;

    private String subject1;
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrn() {
		return prn;
	}

	public void setPrn(String prn) {
		this.prn = prn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject1() {
		return subject1;
	}

	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}

	public double getSubject1Mse() {
		return subject1Mse;
	}

	public void setSubject1Mse(double subject1Mse) {
		this.subject1Mse = subject1Mse;
	}

	public double getSubject1Ese() {
		return subject1Ese;
	}

	public void setSubject1Ese(double subject1Ese) {
		this.subject1Ese = subject1Ese;
	}

	public String getSubject2() {
		return subject2;
	}

	public void setSubject2(String subject2) {
		this.subject2 = subject2;
	}

	public double getSubject2Mse() {
		return subject2Mse;
	}

	public void setSubject2Mse(double subject2Mse) {
		this.subject2Mse = subject2Mse;
	}

	public double getSubject2Ese() {
		return subject2Ese;
	}

	public void setSubject2Ese(double subject2Ese) {
		this.subject2Ese = subject2Ese;
	}

	public String getSubject3() {
		return subject3;
	}

	public void setSubject3(String subject3) {
		this.subject3 = subject3;
	}

	public double getSubject3Mse() {
		return subject3Mse;
	}

	public void setSubject3Mse(double subject3Mse) {
		this.subject3Mse = subject3Mse;
	}

	public double getSubject3Ese() {
		return subject3Ese;
	}

	public void setSubject3Ese(double subject3Ese) {
		this.subject3Ese = subject3Ese;
	}

	public String getSubject4() {
		return subject4;
	}

	public void setSubject4(String subject4) {
		this.subject4 = subject4;
	}

	public double getSubject4Mse() {
		return subject4Mse;
	}

	public void setSubject4Mse(double subject4Mse) {
		this.subject4Mse = subject4Mse;
	}

	public double getSubject4Ese() {
		return subject4Ese;
	}

	public void setSubject4Ese(double subject4Ese) {
		this.subject4Ese = subject4Ese;
	}

	private double subject1Mse;
    private double subject1Ese;

    private String subject2;
    private double subject2Mse;
    private double subject2Ese;

    private String subject3;
    private double subject3Mse;
    private double subject3Ese;

    private String subject4;
    private double subject4Mse;
    private double subject4Ese;

    public Student() {
    }
    
    public double getSubject1Final() {
        return subject1Mse + subject1Ese;
    }

    public double getSubject2Final() {
        return subject2Mse + subject2Ese;
    }

    public double getSubject3Final() {
        return subject3Mse + subject3Ese;
    }

    public double getSubject4Final() {
        return subject4Mse + subject4Ese;
    }
    
    public double getTotalMarks() {
        return getSubject1Final()
             + getSubject2Final()
             + getSubject3Final()
             + getSubject4Final();
    }
    
    public double getPercentage() {
        return Math.round((getTotalMarks() / 400.0) * 10000.0) / 100.0;
    }

}