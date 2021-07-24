package day26inheritance;

public class Animal {
	
	public Animal() {
		System.out.println("Parent constructor ran...");
	}
	
	public Animal(String name) {
		this();
		System.out.println("Parent constructor with parameters ran...");
	}

}
