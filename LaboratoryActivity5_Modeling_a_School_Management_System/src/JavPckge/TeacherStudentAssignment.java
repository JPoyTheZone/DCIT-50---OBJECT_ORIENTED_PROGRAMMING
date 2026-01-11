package JavPckge;

class Person {
	
	String name;
	int age;
	String gender;
	
	Person(){
		name = "Unknown";
		age = 0;
		gender = "Unknown";
	}
	
	Person(String n,int a,String g){
		name = n;
		age = a;
		gender = g;
	}
	
	Person(Person p){
		name = p.name;
		age = p.age;
		gender = p.gender;
	}
	
	
	Person displayInfo(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		return this;
		
	}

}

class Course{
	String courseCode;
	String courseName;
	
	Course(String cC,String cN){
		courseCode = cC;
		courseName = cN;
		
	}
	
	void displayCourse(){
		System.out.println("   "+courseCode+" - "+courseName);
		
	}
}

class Student extends Person{
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

class Teacher extends Person{
	String department;
	
	//Implements Aggregation 'HAS-A', doesn't need super?
	Course course1st;
	Course course2nd;
	Course course3rd;
	Course course4th;
	
	int courseHandled;
	
	Teacher(String n,int a,String g,String d,Course c1){
		super(n,a,g); //gets the Parent class, in this case it's Person
		department = d;
		course1st = c1;

		courseHandled = 1;
	}
	
	Teacher(String n,int a,String g,String d,Course c1,Course c2){
		super(n,a,g); //gets the Parent class, in this case it's Person
		department = d;
		course1st = c1;
		course2nd = c2;
		
		courseHandled = 2;
		
	}
	Teacher(String n,int a,String g,String d,Course c1,Course c2,Course c3){
		super(n,a,g); //gets the Parent class, in this case it's Person
		department = d;
		course1st = c1;
		course2nd = c2;
		course3rd = c3;
		
		courseHandled = 3;
	}
	Teacher(String n,int a,String g,String d,Course c1,Course c2,Course c3,Course c4){
		super(n,a,g); //gets the Parent class, in this case it's Person
		department = d;
		course1st = c1;
		course2nd = c2;
		course3rd = c3;
		course4th = c4;
		
		courseHandled = 4;
	}
	
	
	Teacher displayTeacher() {
		System.out.println("--- Teacher Information ---");
		displayInfo(); //display basic Person Info
		System.out.println("Department: "+ department); //Extend Person Info
		switch (courseHandled) {
		case 1:
			//code block for 1 course
			course1st.displayCourse();
			break;
		case 2:
			//code block for 2 courses
			course1st.displayCourse();
			course2nd.displayCourse();
			break;
		case 3:
			//code block for 3 courses
			course1st.displayCourse();
			course2nd.displayCourse();
			course3rd.displayCourse();
			break;
			
		case 4:
			//code block for 4 courses
			course1st.displayCourse();
			course2nd.displayCourse();
			course3rd.displayCourse();
			course4th.displayCourse();
			break;
		}
		
		return this;
	}
}

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Course CS101 = new Course("CS101","ProgrammingFundamentals");
		Course CS102 = new Course("CS102","Object-Oriented Programming");
		
		Student Ana_Santos = new Student("Ana Santos",19,"Female","S1023");
		Teacher Mr_Dela_Cruz = new Teacher("Mr. Dela Cruz",45,"Male","Computer Studies",CS101,CS102);
		
		Ana_Santos.displayStudent();
		System.out.println("\n");
		Mr_Dela_Cruz.displayTeacher();
		System.out.println("\n");
		CS101.displayCourse();
		CS102.displayCourse();
	}

}
