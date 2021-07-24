package day26inheritance;

/*
 	super()
 	1)super() is used to call a specific constructor from parent class.
 	2)Typing "super()" or not typing "super()" have same meaning.
 	3)super() must be used in the first line inside the constructor.
 	4)super() can be used just once inside a constructor.
 	5)super() can call constructors just from "parent class" not from "grand parent classes"
 */

public class Bird extends Mammal{
	
	public Bird() {
		super(3);
		System.out.println("Child constructor ran...");
	}

}
