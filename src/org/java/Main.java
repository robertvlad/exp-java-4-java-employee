package org.java;

import java.time.LocalDate;

import org.java.abj.Boss;
import org.java.abj.Employee;
import org.java.abs.Person;

public class Main {
	
	public static void main(String[] args) {
		
		Employee e = new Employee("Hugo", "Cabret", LocalDate.parse("1999-12-12"), 2000, true, true);
		
		System.out.println(e);
		
		System.out.println("\n---------------------------------\n");
		
		Boss b = new Boss("Hugo", "Cabret", LocalDate.parse("1999-12-12"), 20000, 30000);
		
		System.out.println(b);
		
		Person[] pe = { e, b};
		
		int sumSalaryTot = 0;
		
		for (int i = 0; i < pe.length; i++) {
			
			Person p = pe[i];
			int yearSalary = p.getYearSalary();
			sumSalaryTot += yearSalary;
		}
		
		System.out.println("\n---------------------------------\n");
		
		System.out.println(sumSalaryTot);
	}
}
