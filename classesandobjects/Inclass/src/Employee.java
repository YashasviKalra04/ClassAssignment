import java.util.*;
import java.io.*;

class Employee	
    {
    String firstName;
	String lastName;
	Double monthlySalary;
	Scanner input = new Scanner(System.in);
		

	Employee()	
	{
		firstName = "";
		lastName = "";
		monthlySalary = 0.0;
	}

	
	Employee(String firstName,String lastName, Double monthlySalary)	
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}


	String getFirstName()	
	{
		return firstName;
	}

	String getLastName()
	{
		return lastName;
	}

	Double getMonthlySalary() 
	{
		return monthlySalary;
	}


	void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	void setMonthlySalary(Double monthlySalary)
	{
		if (monthlySalary > 0.0)
		{
			this.monthlySalary = monthlySalary;
		}
	}
	

	Double calculateYearlySalary()
	{
		return (monthlySalary * 12);
	}

	
	void reviseMonthlySalary(Double raisePerceent)
	{
		this.monthlySalary = this.monthlySalary + ((raisePerceent/100)*this.monthlySalary);
	}
	

	void displayEmployeeInformation()
	{
		System.out.println("Employee Name : " + firstName + " " + lastName);
		System.out.println("Employee Monthly Salary : " + monthlySalary);
		System.out.println("Employee Yearly Salary : " + calculateYearlySalary());
	}
}