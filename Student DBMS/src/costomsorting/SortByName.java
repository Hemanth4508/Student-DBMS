package costomsorting;

import java.util.Comparator;

import sdbms.Student;

public class SortByName implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) 
	{
		
		return o1.getName().compareTo(o2.getName());
	}

	
}
