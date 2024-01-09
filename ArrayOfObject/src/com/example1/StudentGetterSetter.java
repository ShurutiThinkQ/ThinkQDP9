package com.example1;

import java.util.Scanner;

public class StudentGetterSetter {
	
	static Scanner sc= new Scanner(System.in);
	
	static void insertStudent(Student s)
	{
		System.out.println("Enter id:");
	    s.setId(sc.nextInt());
	    
	    System.out.println("Enter name:");
	    s.setName(sc.next());
	    
	    System.out.println("Enter marks:");
	    s.setMarks(sc.nextDouble());
		
	}
	
	public static void main(String[] args) {
		
		Student st[]= new Student[3];
		
		for(int i=0;i<st.length;i++)
		{
			st[i]= new Student();
			insertStudent(st[i]);
			
		}
		
		System.out.println("---------------------------");
		
		for(Student s:st)
		{
			System.out.println(s);
		}
		
		sc.close();
		
	}

}
