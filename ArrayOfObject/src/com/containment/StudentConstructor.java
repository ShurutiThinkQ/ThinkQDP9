package com.containment;

public class StudentConstructor {
	
	public static void main(String[] args) {
		
		Course c1= new Course(1,"Java", 56000);
		Course c2= new Course(2,".net",45000);
		
		Student st[]= new Student[4];
		st[0]=new Student(101, "Reetu", c2);
		st[1]=new Student(102, "Jyoti", c1);
		st[2]=new Student(103, "Pooja", c2);
		
		st[3]= new Student();
		st[3].setId(104);
		st[3].setName("Pranali");
		st[3].setCourse(c1);
		
		for(Student s:st)
		{
			System.out.println(s);
		}
		
	}

}
