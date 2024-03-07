package test;

import modelo.javabeans.Country;
import modelo.javabeans.Department;
import modelo.javabeans.Employee;
import modelo.javabeans.Job;
import modelo.javabeans.Location;
import modelo.javabeans.Region;

public class TestEmpleado {

	public static void main(String[] args) {
		
		Region reg1 = new Region(2, "LATAM");
		
		Country pais1 = new Country("AR", "Aregntina", reg1);
		
		Location loc1 = new Location(1700, "Salamanca 12", pais1);
		
		Department dep1 = new Department(20, "T1", loc1);
		
		Job job1 = new Job("IT", "Programadores", 15000, 35000);
		
		Employee emp1 = new Employee(1, "Pedro", "Ramirez", 25000, dep1, job1);
		
		System.out.println(emp1.getDepartment().getLocation().getCountry().getRegion().getRegionName());
		

	}

}
