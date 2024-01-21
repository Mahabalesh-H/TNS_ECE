package com.tns.day4;
import java.util.Scanner;
public class Employeedemo {
	public static void main(String[] args) {
		Employee emp1=new Employee();
		String name,dept;
		int salary,id,age;
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter name: ");
		name=SC.next();
		System.out.println("Enter dept: ");
		dept=SC.next();
		System.out.println("Enter salary: ");
		salary=SC.nextInt();
		System.out.println("Enter id: ");
		id=SC.nextInt();
		System.out.println("Enter age: ");
		age=SC.nextInt();
		emp1.setName(name);
		emp1.setDept(dept);
		emp1.setSalary(salary);
		emp1.setId(id);
		emp1.setAge(age);
		System.out.println(emp1);
	}

}
