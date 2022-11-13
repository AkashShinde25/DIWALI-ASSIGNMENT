import java.lang.*;
import java.util.*;


class Employee{
	
	int empId;
	String name;
	static double basicPay;
	
	Employee(){
		
		
	}
	
	Employee(int empId, String name, double basicPay){
		
		this.empId = empId;
		this.name = name;
		this.basicPay = basicPay;
		
	}
	
	void printDetails(double salary){
		
		System.out.println("Id of the employee is : "+empId);
		System.out.println("Name of the employee is : "+name);
		System.out.println("Salary of the employee is : "+ salary);
		
	}
	
	static class Salary{
		
		double calSalary(){
			
			double sal = basicPay * 1.7;
			return sal;
		}
	}
	
	static class Address{
		
		void printAddress(String email, long mobileNO){
			
			System.out.println("Email id of the employee is : "+email);
			System.out.println("Mobile no of the employee is : "+mobileNO);
			
		}
	}
	
	
}
class StaticInnerClass4{
	
	public static void main(String args[]){
		
		Employee e1 = new Employee(123, "Omkar", 10000);
		
		Employee.Salary es1 = new Employee.Salary();
		double res = es1.calSalary();
		
		e1.printDetails(res);
		
		Employee.Address ea1 = new Employee.Address();
		ea1.printAddress("om@3435gamil.com", 97020096);
	}
}