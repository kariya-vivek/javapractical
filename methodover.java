
import java.util.*;
class student
{
	void disply(String name)
	{
		System.out.println("Student name is:-"+name);
	}
	void disply(String name,int id)
	{
		System.out.println("Student name and id is:-"+name+id);
	}
	void disply(String name,int id ,int age)
	{
		System.out.println("Student name,id and age is:-"+name+id+age);
	}
}
class main
{
	public static void main(String[]args)
	{
		student s=new student();
		s.disply("Dhruv ");
		s.disply("Dhruv ",164);
		s.disply("Dhruv ",164,18);
	}
}
