package LearnCollection;

// Multiple entities in collection

import java.util.*;


 class Student
{
	private int RegNo;
	private String Name;
	private int Mark;
	private char Grade;
	
	Student(int RegNo,String Name,int Mark,char Grade)
	{
	this.RegNo=RegNo;
	this.Name=Name;
	this.Mark=Mark;
	this.Grade=Grade;
	}
	
	public int getRegNo()
	{
		return RegNo;
	}

	public void setRegNo(int regno)
	{
		RegNo = regno;
	}

	public String getName()
	{
		return Name;
	}

	public void setName(String name)
	{
		Name = name;
	}

	public int getMark()
	{
		return Mark;
	}

	public void setMark(int mark)
	{
		Mark = mark;
	}

	public char getGrade() 
	{		
		return Grade;
	}

	public void setGrade(char grade)
	{
		Grade = grade;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(Grade, Mark, Name, RegNo);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Grade == other.Grade && Mark == other.Mark && Objects.equals(Name, other.Name) && RegNo == other.RegNo;
	}
	

	@Override
	public String toString() 
	{
		return "\n Students [RegNo=" + RegNo + ", Name=" + Name + ", Mark=" + Mark + ", Grade=" + Grade + "]";
	}
	
	
}

public class MultipleEntities
{
	public static void main(String args[])
	{
		Student arun=new Student(001,"Arun",400,'B');
		Student karun=new Student(001,"Arun",400,'B');
		Student varun=new Student(003,"Varun",380,'c');
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(arun);
		lhs.add(karun);
		lhs.add(varun);
		System.out.println(lhs);
	
	}

}

/*
o/p:

[
Students [RegNo=1, Name=Arun, Mark=400, Grade=B], 
Students [RegNo=3, Name=Varun, Mark=380, Grade=c]]

*/