package JavPckge;

public class Person {
	
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

//Declared Using:
//    Person Ana_de_Santos = new Person("Ana De Santos",19,"Female")