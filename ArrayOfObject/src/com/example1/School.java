package com.example1;

public class School {
	
	static void findTopper(Student stud[])
	{
		double maxMarks= Double.MIN_VALUE;
		
		Student topper= new Student();
		
		for(Student s:stud)
		{
			if(s.getMarks()>maxMarks)
			{
				topper= s;
				maxMarks= s.getMarks();
			}
		}
		
		System.out.println("Topper of the students:");
		System.out.println(topper);
		
	}
	
	static void sortMarks(Student stud[])
	{
		Student temp= new Student();
		
		for(int i=0;i<stud.length;i++)
		{
			for(int j=i+1;j<stud.length;j++)
			{
				if(stud[i].getMarks()>stud[j].getMarks())
				{
					temp= stud[i];
					stud[i]=stud[j];
					stud[j]=temp;
					
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
//		Student s= new Student();
//		System.out.println(s);
		
		Student st[]= new Student[5]; // no student object is created here
		
	   System.out.println(st[0]); // gives null
	   
	   for(int i=0;i<st.length;i++)
	   {
		   st[i]= new Student();
	   }
		
	   st[0]= new Student(1,"Deepti",78);
	   st[1]= new Student(2,"Arpita",89);
	   st[2]= new Student(3,"Pranay",78);
	   st[3]= new Student(4,"Reetu",81);
	   st[4]= new Student();
	   
	   st[4].setId(5);
	   st[4].setName("Prachi");
	   st[4].setMarks(90);
	   
	   for(Student s: st)
	   {
		   System.out.println(s);
	   }
	
	   System.out.println("--------------------------");
//	   
//	   for(int i=0;i<st.length;i++)
//	   {
//		   System.out.println(st[i]);
//	   }
			
	   findTopper(st);

	   System.out.println("--------------------------------");
	   
	   sortMarks(st);
	   
	   for(Student s: st)
	   {
		   System.out.println(s);
	   }
	 
	}

}
