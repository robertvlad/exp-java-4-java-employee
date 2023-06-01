package org.java.abj;

import java.time.LocalDate;

import org.java.abs.Person;

public class Boss extends Person{
	
	private int dividendo;
	private int bonus;

	public Boss(String name, String lastName, LocalDate dateOfBirth, int dividendo, int bonus) {
		
		super(name, lastName, dateOfBirth);
		
		setDividendo(dividendo);
		setBonus(bonus);		
	}

	@Override
	public int getYearSalary() {
		
		return getDividendo() + getBonus();
	}

	public int getDividendo() {
		return dividendo;
	}

	public void setDividendo(int dividendo) {
		this.dividendo = dividendo;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
	@Override
	public String toString() {
		
		return "| (B) " + getStringImpls();
	}
}
