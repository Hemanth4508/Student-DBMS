package sdbms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import costomexception.IdNotFound;

public class StudentManagementSystemImpl implements StudentManagementSystem
{
	Scanner S=new Scanner(System.in);
	Map<String,Student>  db =new LinkedHashMap<String,Student>();
	
	
	@Override
	public void addStudent()
	{
		System.out.println("Enter the marks");
		double M=S.nextDouble();
		System.out.println("Enter the name");
		String N=S.next();	
		System.out.println("Enter the age");
		int A=S.nextInt();
			
		Student std=new Student(N,A,M);
		db.put(std.getId(),std);
		System.out.println("Student record insterted Sucessfully");
		System.out.println("Student id is : "+std.getId());
	}
	@Override
	public void displayStudent()
	{
		System.out.println("Enter the id");
		String id=S.next();
		id=id.toUpperCase();
		if(db.containsKey(id))
		{
			System.out.println(db.get(id));
		}
		else
		{
			try 
			{
				throw  new IdNotFound("Entered Id not found");
			}
			catch(IdNotFound i)
			{
				System.out.println(i.getMessage());
			}
		}
			
		
		
		
		
	}
	@Override
	public void displayAllStudents()
	{
		System.out.println("Students details are as follows : ");
		System.out.println("------------------------------------");
		Set<String> sk=db.keySet();
		for(String S:sk)
		{
			Student obj=db.get(S);
			System.out.println(obj);
		}
		
	}
	@Override
	public void removeStudent()
	{
		
	}
	
	@Override
	public void removeAllStudents()
	{
		
	}
	@Override
	public void   updateStudent()
	{
		
	}
	@Override
	public void   countStudents()
	{
		System.out.println("the total number of Students are : "+db.size());
	}
	@Override
	public void   sortStudents()
	{
		
	}
	
	
	
	
}
