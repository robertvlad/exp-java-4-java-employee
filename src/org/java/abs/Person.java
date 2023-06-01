package org.java.abs;

import java.time.LocalDate;

public abstract class Person {
	
	private String name;
	private String lastName;
	private LocalDate dateOfBirth;
	
	public Person(String name, String lastName, LocalDate dateOfBirth) {
		
		setName(name);
		setLastName(lastName);
		setDateOfBirth(dateOfBirth);
	}
	
	public abstract int getYearSalary();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	protected String getStringImpls() {
		
		return "Name: " + getName() + " " + getLastName() + " | Date of Birth: " + getDateOfBirth() + " | Salary: " + getYearSalary() + " |";
	}
	
	
	@Override
	public String toString() {
		
		return "| (P) " + getStringImpls();
	}
}
