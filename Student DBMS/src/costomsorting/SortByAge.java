package costomsorting;

import java.util.Comparator;
import sdbms.Student;

public class SortByAge implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getAge()-o2.getAge();
	}

	

}
