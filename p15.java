
interface exam
{
	void result();
}
class mark
{
	String name="Dhruv";
	int marks=97;
}
class interf extends mark implements exam
{
	public void result()
	{
		if(marks>=33)
		{
			System.out.println(name+" was pass !!");
		}
		else
		{
			System.out.println(name+" was failed !!");
		}
	}
	public static void main(String []args)
	{
		interf obj = new interf();
		obj.result();
	}
}
