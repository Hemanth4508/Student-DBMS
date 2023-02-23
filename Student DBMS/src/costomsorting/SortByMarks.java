package costomsorting;

import java.util.Comparator;

import sdbms.Student;

public class SortByMarks implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) 
	{
		return o1.getMarks().compareTo(o2.getMarks());
	}

	

}
