package com;

public class Employeee 
{
	String id;
	String name;
	double salary;
	static int count=1;
	public Employeee(String name, double salary) {
		super();
		this.id = "SONY"+count;
		this.name = name;
		this.salary = salary;
		count++;
	}
	@Override
	public String toString() 
	{
		return "Employeee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public static void main(String[] args) 
	{
	 System.out.println(new Employeee("HEM",250004));
	 System.out.println(new Employeee("SUM",250004));
	 System.out.println(new Employeee("SOW",250004));
	 System.out.println(new Employeee("SUP",250004));
		
	}

	
	

	
}
