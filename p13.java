
import java.util.*;
class student
{
	protected String name;
	protected int id;
}
class examstudent extends student
{
	private int marks;
	public examstudent(String n,int i,int marks)
	{
		name = n;
		id = i;
		this.marks=marks;
	}
	public void display()
	{
		System.out.println("student name :-"+name);
		System.out.println("student id :-"+id);
		System.out.println("student marks :-"+marks);
	}
}
class Main
{
		public static void main(String []args)
		{
			examstudent student=new examstudent("dhruv",164,97);
			student.display();
		}
}
