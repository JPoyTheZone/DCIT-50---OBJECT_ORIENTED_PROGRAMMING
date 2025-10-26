package JavPckge;

public class Student extends Person{
	String studentId;
	
	Student(String n,int a,String g,String i){
		super(n,a,g);
		studentId = i;
		
	}
	
	Student displayStudent() {
		System.out.println("--- Teacher Information ---");
		displayInfo(); //display basic Person Info
		System.out.println("Student ID: "+ studentId); //Extend Person Info
		return this;
	}
}


//Student Ana_Santos = new Student("Ana Santos",19,"Female","S1023");
//Ana_Santos.displayStudent();