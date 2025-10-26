package JavPckge;

public class Main {

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
	}

}
