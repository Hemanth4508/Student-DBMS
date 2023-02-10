package sdbms;
import java.util.Scanner;
import costomexception.*;



public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner S=new Scanner(System.in);
		StudentManagementSystem SMS=new StudentManagementSystemImpl();
		while(true)
		{
			System.out.println("-----------------------MAIN MENU----------------------------");
			System.out.println("1.To add Student\n2.To display Student\n3.To display all Students\n4. To remove Student\n5.To remove all Students\n6.To update Student\n7.to count Students\n8.To sort Student\n10.To Exit");
			
			int option=S.nextInt();
			switch(option)
			{
			case 1 :
				SMS.addStudent();
				break;
			case 2 :
				SMS.displayStudent();
				break;
			case 3 :
				SMS.displayAllStudents();
				break;
			case 4 :
				SMS.removeStudent();
				break;
			case 5 :
				SMS.removeAllStudents();
				break;
			case 6 :
				SMS.updateStudent();
				break;
			case 7 :
				SMS.countStudents();
				break;
			case 8 :
				SMS.sortStudents();
				break;
			case 9 :
				System.out.println("Thank You");
				System.exit(0);
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
			
	
		
		
	}

}
