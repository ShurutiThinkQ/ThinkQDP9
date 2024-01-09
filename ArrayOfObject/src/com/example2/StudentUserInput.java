package com.example2;

import java.util.Scanner;

public class StudentUserInput {
	
	static Scanner sc= new Scanner(System.in);
	
	static void enterDetails(Student s)
	{
		System.out.println("enter id:");
		s.setId(sc.nextInt());
		
		System.out.println("Enter name:");
		s.setName(sc.next());
		
		System.out.println("Enter marks of 5 subjects:");
		double m[]= new double[5];
		
		for(int i=0;i<m.length;i++)
		{
			m[i]= sc.nextDouble();
			
		}
		
		s.setMarks(m);
	}
	
	public static void main(String[] args) {
		
		Student st[]= new Student[3];
		for(int i=0;i<st.length;i++)
		{
			st[i]=new Student();
			enterDetails(st[i]);
			
		}
		
		System.out.println("--------------------------------");
		
//		for(Student s:st)
//		{
//			System.out.println(s);
//		}
		
		for(Student s:st)
		{
			System.out.println(s.getId()+" "+s.getName());
			System.out.println("Percentage:"+StudentTest.calPercentage(s)+"%");
		}
		
	}

}
