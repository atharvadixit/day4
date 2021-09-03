package question1.util;

import question1.classes.Class2;
import question1.interfaces.Interface2;

public class Util {
	public static void main(String[] args) {
		
		Class2 class2 = new Class2();
		//We are able to access all the methods implemented by Class 2 because the reference type is of Class2
		class2.class1();
		class2.class2();
		class2.interface1();
		class2.interface2();
		class2.interface3();
		
		Interface2 interface2;
		interface2 = new Class2();
		//We able to access only methods of Interface2 implemented by Class2 because the reference type is of Interface2
		interface2.interface1();
		interface2.interface2();
	}
}
