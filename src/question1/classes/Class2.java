package  question1.classes;

import  question1.interfaces.Interface2;
import  question1.interfaces.Interface3;

public class Class2 extends Class1 implements Interface2, Interface3{
	
	public void class2() {
		System.out.println("In Class 1");
	}
	
	public void interface1() {
		System.out.println("In Interface 1");
	}
	
	public void interface2() {
		System.out.println("In Interface 2");
	}
	
	public void interface3() {
		System.out.println("In Interface 3");
	}
}
