package com.han.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Application {
    private Integer id;
    private String name;
    private Integer number;
    private Date birthdate;
    private String address;
    private Long phone;
    private String email;
    private String dsc1;
    private String dsc2;
    private Float investment;
    private String area;
    private String note;
    
    public Application() {
    }
    
    public Application(String name, String email) {
    	this.name = name;
    	this.email = email;
    }

	public Application(Integer id, String name, Integer number, Date birthdate, String address, Long phone, String email, String dsc1, String dsc2, Float investment, String area, String note) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.birthdate = birthdate;
        this.address= address;
        this.phone = phone;
        this.email = email;
        this.dsc1 = dsc1;
        this.dsc2 = dsc2;
        this.investment = investment;
        this.area = area;
        this.note = note == null ? "" : note;
    }
	
	@Override
	public String toString() {
	    return "Application{" + "id=" + id + ", name=" + name + ", email=" + email + '}';
	}
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }
 
    // other getters and setters...
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDsc1() {
		return dsc1;
	}

	public void setDsc1(String dsc1) {
		this.dsc1 = dsc1;
	}

	public String getDsc2() {
		return dsc2;
	}

	public void setDsc2(String dsc2) {
		this.dsc2 = dsc2;
	}

	public Float getInvestment() {
		return investment;
	}

	public void setInvestment(Float investment) {
		this.investment = investment;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}