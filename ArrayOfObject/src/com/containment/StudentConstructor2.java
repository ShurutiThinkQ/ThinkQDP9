package com.containment;

public class StudentConstructor2 {
	
	public static void main(String[] args) {
				
		Student st[]= new Student[4];
		st[0]=new Student(101, "Reetu", new Course(1,"Java", 56000));
		st[1]=new Student(102, "Jyoti", new Course(2,".net",45000));
		st[2]=new Student(103, "Pooja", new Course(2,".net",45000));
		
		st[3]= new Student();
		st[3].setId(104);
		st[3].setName("Pranali");
		st[3].setCourse(new Course(1,"Java", 56000));
		
		for(Student s:st)
		{
			System.out.println(s);
		}
		
	}

}
