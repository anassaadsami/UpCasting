package UpCastingPoly;

public class Person {
	String name ;
	int age ;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	} 
	public static void print() {
		System.out.println("static method from Person class can not be overriden!");
	}
	public static void print2(Person p) {
		System.out.println("my name is "+ p.name);
	}
	

}
class Son extends Person{
	boolean is_study ;

	public Son(String name, int age , boolean is_study) {
		super(name, age);
		this.is_study = is_study ;
		
	}
	// this method is not override the original method in Person class cause it's static 
	// method and static method can not be overridden so it's just another method 
	//with the same name 
	 //@Override   if we code this -----> error 
	public static void print() {
		System.out.println("static method from Son class can not be overriden!");
	}
	//@Override   //if we code this -----> error
	public static void print2(Son s) {
		System.out.println("my name is "+ s.name);
	}
	
}
