package com.example.demo;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Student  {

	@NotBlank
	private String id;
	
	@Size(min = 3, max = 50)
	private String name;
	
	@NotBlank
	@Email(message = "Veuillez saisir une adresse mail valide")
	private String email;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date birthDate;
	
	
	// Méthodes usuelles: constructeur, getters, setters, etc.
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	

	
	public Student(@NotBlank String id, @Size(min = 3, max = 50) String name,
			@NotBlank @Email(message = "Veuillez saisir une adresse mail valide") Date date, String email) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = date;
		this.email = email;
		
	}


	


} 