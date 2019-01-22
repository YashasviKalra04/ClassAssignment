import java.util.*;
class Employeetest
{

	public static void main(String args[])
	{

		String firstName;
		String lastName;
		Double monthlySalary;
		Double raisePerceent;

		Scanner input = new Scanner(System.in);

		Employee employee1 = new Employee();
		Employee employee2 = new Employee("NCU", "University", 100.0);
		employee1.displayEmployeeInformation();
		employee2.displayEmployeeInformation();

		System.out.print("Enter Employee 1 First Name : ");
		firstName = input.nextLine();
		employee1.setFirstName(firstName);

		System.out.print("Enter Employee 1 Last Name : ");
		lastName = input.nextLine();
		employee1.setLastName(lastName);

		System.out.print("Enter Employee 1 Monthly Salary : ");
		monthlySalary = input.nextDouble();
		employee1.setMonthlySalary(monthlySalary);

		employee1.displayEmployeeInformation();

		System.out.print("Enter Employee 1 Monthly Salary Rasie Percent : ");
		raisePerceent = input.nextDouble();
		employee1.reviseMonthlySalary(raisePerceent);
		employee1.displayEmployeeInformation();

		System.out.print("Enter Employee 2 Monthly Salary Rasie Percent : ");
		raisePerceent = input.nextDouble();
		employee2.reviseMonthlySalary(raisePerceent);
		employee2.displayEmployeeInformation();

	}
}