package com.example2;

import java.util.Arrays;

public class Student {
	
	private int id;
	private String name;
	private double marks[];
	
	Student() 
	{
		marks= new double[5];
	}
	
	Student(int id, String name, double marks[])
	{
		this();
		this.id=id;
		this.name=name;
		this.marks=marks;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double[] getMarks()
	{
		return marks;
	}
	
	public void setMarks(double marks[])
	{
		this.marks=marks;
	}
	
	public String toString()
	{
		return "Id:"+id+", Name:"+name+" ,Marks:"+Arrays.toString(marks);
	}

	

}
