package UpCastingPoly;

public class Main {

	public static void main(String[] args) {
		// we create reference variable from class Person which have (object type ) of 
		// Son class
		Person p1 = new Son("anas", 43 , true);   
		// we create reference variable from class Person which have (object type ) of 
		// Person class
		
		Person p2 = new Person("saad", 70);
		Son s1 = new Son("ali", 35 , false);
		
		System.out.println(p1.age);
		System.out.println(p1.name);
	//	System.out.println(p1.is_study); -----> error  is_study is Son attribute 
		
		System.out.println(s1.is_study); 
		s1.print();
		
		Person.print2(p1);
		Son.print2(s1);
		
	// 	Son s2 = new Person("sami", 80);  -------> error just super class make upCasting
		

	}

}
