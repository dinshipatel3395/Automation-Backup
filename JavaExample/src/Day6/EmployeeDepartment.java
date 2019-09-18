package Day6;
/*2.Create program with following functionality:
a)Create two classes with name 'Employee' and 'Department'.
b)Create one method 'basic_pay' in Employee(Use Basic pay = number of working days * pay per day)
c)Override method 'basic_pay' in Department class
*/


class Employee
{
	double basicpay;
	public void basic_pay(double number_of_working_days,double pay_per_day)
	{
		basicpay=number_of_working_days*pay_per_day;
		System.out.println("Employee's basicpay="+basicpay);
	}
}
class Department extends Employee
{
	public void basic_pay(double number_of_working_days,double pay_per_day)
	{
		basicpay=number_of_working_days*pay_per_day;
		System.out.println("Department's basicpay="+basicpay);
	}
}
public class EmployeeDepartment 
{
	public static void main(String args[])
	{
		Employee E=new Department();
		E.basic_pay(19,250);
	}
}