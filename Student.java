import java.util.*;

class myexception extends Exception{
	public myexception(String st)
	{
		super(st);
	}
}
class Student
{
	int roll_no,age;
	String name,course;
	public Student(int roll_no,Stringname,int age, String course)
	{
		this.roll_no=roll_no;
		this.name=name;
		this.age=age;
		this.course=course;
	}
	void check() throws  myexception
	{
		System.out.println("Roll no: "+roll_no);
		System.out.println("Name: "+ name);
		System.out.println("Age: "+age);
		System.out.println("Course: "+ course);
		if(age>=15 && age<=21)
		{
			throw new myexception("Age within range");
		}
		else
		{
			System.out.println("Age not within range");
		}
	}
	public static void main(String args[])
	{
		Student s=new Student(01,"siddhi",23,"BScIT");
		try
		{
		s.check();
		}
	catch(myexception e)
	{
		System.out.println(e);
	}
}
}
