
import java.util.*;
class student
{
	private String name;
	private int age;
	private String grade;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		if(age>0)
		{
			this.age=age;
		}
		else
		{
			System.out.println("Age must be a positive");
		}
	}
	
	public String getGrade()
	{
		return grade;
	}
	
		
	public void setGrade(String grade)
	{
		this.grade = grade;
	}
	
	public void display()
	{
		System.out.println("student name is :"+name);
		System.out.println("age is :"+age);
		System.out.println("grade is :"+grade);
	}
	public static void main(String []args)
	{
		student s=new student();
		s.setName("dhruv");
		s.setAge(18);
		s.setGrade("A");
		
		s.display();
	}
}
