package com.example2;

public class StudentTest {
	
	static double calPercentage(Student s)
	{
		double per;
		double total=0;
		double marks[]=s.getMarks();
		for(double m:marks )
		{
			total+=m;
		}
		
		per=(total/500)*100;
		return per;
	}
	
	public static void main(String[] args) {
		
		Student st[]= new Student[3];
		
		double m1[]={56,34,56,12,34};
		st[0]= new Student(1,"Bhaskar",m1);
		
		double m2[]={90,45,78,23,90};
		st[1]= new Student(2,"Pranay",m2);
		
		double m3[]={89,44,67,66,90};
		st[2]= new Student();
		st[2].setId(3);
		st[2].setName("Pooja");
		st[2].setMarks(m3);
		
		System.out.println("-------------------------------");

		for(Student s:st)
		{
			System.out.println(s.getId()+" "+s.getName());
			System.out.println("Percentage:"+calPercentage(s)+"%");
		}
		
		
	}

}
