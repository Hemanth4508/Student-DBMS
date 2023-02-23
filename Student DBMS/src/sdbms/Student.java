package sdbms;
public class Student {
	private String id;
	private int age;
	private String name;
	private double marks;
	private static int count=1;
	public Student( String name,int age,  double marks)
	{
		this.id = "JSP"+count;
		this.age = age;
		this.name = name;
		this.marks = marks;
		count++;
	}
	public String getId()
	{ 
		return this.id;
	}
	public void setId(String id)
	{
		this.id=id;
		
	}
	public int getAge()
	{ 
		return this.age;
	}
	public void setAge(int age)
	{
		this.age=age;
		
	}
	public String getName()
	{ 
		return this.name;
	}
	public void setName(String name)
	{
		this.name=name;
		
	}
	public Double getMarks()
	{
		return this.marks;
	}
	public void setMarks(double marks)
	{
		this.marks=marks;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Student.count = count;
	}
	@Override
	public String toString()
	{
		return "|| Student : |id : "+id+" | name : "+name+" | age : "+age+" | marks : "+marks+"||";
		
	}
	

	


}
