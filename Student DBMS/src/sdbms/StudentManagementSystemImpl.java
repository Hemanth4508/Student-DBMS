package sdbms;
import java.util.*;
import costomexception.*;
import costomsorting.*;
public class StudentManagementSystemImpl implements StudentManagementSystem
{
	Scanner S=new Scanner(System.in);
	Map<String,Student>  db =new LinkedHashMap<String,Student>();//MAIN DATABASE
	@Override
	public void addStudent()//Adding the student
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
		
		if(db.size()!=0)
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
		else
		{
			try
    		{
    			throw new  IdNotFound("No records are found to Display!");
    		}
    		catch(IdNotFound i)
    		{
    			System.out.println(i.getMessage());
    		}
		}
		
		
		
		
		
		
	}
	@Override
	public void removeStudent()
	{
		System.out.println("Enter the id");
	    String Sid=(S.next()).toUpperCase();
	    	if(db.containsKey(Sid))
	    	{
	    	   db.remove(Sid);
	    	   System.out.println("Student details with id "+Sid+" sucessfully removed.");
	    	}
	    	else
	    	{
	    		try
	    		{
	    			throw new  IdNotFound("The student deteails with id"+Sid+" is not found.");
	    		}
	    		catch(IdNotFound i)
	    		{
	    			System.out.println(i.getMessage());
	    		}
	    	}
	 
		
	}

	@Override
	public void removeAllStudents()
	{
		if(db.size()!=0)
		{
			System.out.println("Avilable Student Records : "+db.size());
			db.clear();
			System.out.println("Sucessfully removed all the students");
		}
		else
		{
			try
    		{
    			throw new  IdNotFound("No records are found to delete!");
    		}
    		catch(IdNotFound i)
    		{
    			System.out.println(i.getMessage());
    		}
		}
	}
	@Override
	public void   updateStudent()
	{
		System.out.println("Enter the id");
	    String Sid=(S.next()).toUpperCase();
	    	if(db.containsKey(Sid))
	    	{
	    	  Student obj=db.get(Sid);
	    	  System.out.println("The student details with id "+Sid);
	    	  System.out.println(obj.toString());
	    	  boolean flag=true;
	    	  while(flag)
	    	  {
	    		  System.out.println("To update 1.age 2.name 3:marks");
		    	  int option=S.nextInt();
		    	  switch (option)
		    	  {
		    	  case 1:
		    		  System.out.println("Enter the age to update");
		    		  int age =S.nextInt();
		    		  obj.setAge(age);
		    		  db.put(Sid,obj);
		    		  System.out.println("Student age Updated sucessfully"); flag=false;
		    		  break;
		    	  case 2:
		    		  System.out.println("Enter the name to update");
		    		  String name =S.next();
		    		  obj.setName(name);
		    		  db.put(Sid,obj);
		    		  System.out.println("Student Name Updated sucessfully");flag=false;
		    		  break;
		    	  case 3:
		    		  System.out.println("Enter the marks to update");
		    		  double marks =S.nextDouble();
		    		  obj.setMarks(marks);
		    		  db.put(Sid,obj);
		    		  System.out.println("Student marks Updated sucessfully");flag=false;
		    		  break;
		    	 default : 
		    		 try 
						{
		    			 flag=true;
							throw new InvalidChoice(" Kindly Enter a Valid Choice");
						}
						catch(InvalidChoice I)
						{
							System.out.println(I.getMessage());
						}
	    	  }
	    	  }
	    	}
	    	else
	    	{
	    		try
	    		{
	    			throw new  IdNotFound("The student deteails with id "+Sid+" is not found.");
	    		}
	    		catch(IdNotFound i)
	    		{
	    			System.out.println(i.getMessage());
	    		}
	    	}

		
				
		
		
	}
	@Override
	public void   countStudents()
	{
		System.out.println("the total number of Students are : "+db.size());
	}
	@Override
	public void   sortStudents()
	{
		Set<String> sk=db.keySet();
		ArrayList<Student> al= new ArrayList<Student>();
		for(String k:sk) 
		{
			al.add(db.get(k));
			
		}
		System.out.println("select 1: to sort by id. 2: to sort by age. 3 to sort by name 4.to sort by marks");
		int option= S.nextInt();
		switch(option)
		{
			case 1:
				Collections.sort(al,new SortById());
				display(al);
				break;
			case 2:
				Collections.sort(al,new SortByAge());
				display(al);
				break;
			case 3:
				Collections.sort(al,new SortByName());
				display(al);
				break;
			case 4:
				Collections.sort(al,new SortByMarks());
				display(al);
				break;
			default:
				try 
				{
					throw new InvalidChoice(" Kindly Enter a Valid Choice");
				}
				catch(InvalidChoice I)
				{
					System.out.println(I.getMessage());
				}
				
			
		}
		
		
	}
	public void display(ArrayList<Student> a1)
	{
		for(Student S:a1)
		{
			System.out.println(S);
		}
	}	
	
	
	
	
}
