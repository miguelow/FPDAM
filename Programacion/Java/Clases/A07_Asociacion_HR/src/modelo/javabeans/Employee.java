package modelo.javabeans;

import java.util.Objects;

public class Employee {

	private int employeId;
	private String firstName;
	private String LastName;
	private double salary;
	
	private Department department;
	private Job job;
	
	public Employee() {
	
	}

	public Employee(int employeId, String firstName, String lastName, double salary, Department department, Job job) {
		super();
		this.employeId = employeId;
		this.firstName = firstName;
		LastName = lastName;
		this.salary = salary;
		this.department = department;
		this.job = job;
	}

	public int getEmployeId() {
		return employeId;
	}

	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeId == other.employeId;
	}

	@Override
	public String toString() {
		return "Employee [employeId=" + employeId + ", firstName=" + firstName + ", LastName=" + LastName + ", salary="
				+ salary + ", department=" + department + ", job=" + job + "]";
	}
	
	

}
