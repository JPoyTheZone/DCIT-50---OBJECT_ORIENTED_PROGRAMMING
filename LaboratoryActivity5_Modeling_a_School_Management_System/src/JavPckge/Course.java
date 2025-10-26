package JavPckge;

public class Course{
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

//Course CS101 = new ProgrammingFundamentals("CS101","ProgrammingFundamentals");
//Course CS102 = new ProgrammingFundamentals("CS102","Object-Oriented Programming");

//CS101.displayCouse();