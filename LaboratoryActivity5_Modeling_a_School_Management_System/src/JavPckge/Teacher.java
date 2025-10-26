package JavPckge;

public class Teacher extends Person{
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


//Course CS101 = new ProgrammingFundamentals("CS101","ProgrammingFundamentals");
//Course CS102 = new ProgrammingFundamentals("CS102","Object-Oriented Programming");

//Teacher Mr_Dela_Cruz = new Teacher("Mr. Dela Cruz",45,"Male","Computer Studies",CS101,CS102);
//Mr_Dela_Cruz.displayTeacher();