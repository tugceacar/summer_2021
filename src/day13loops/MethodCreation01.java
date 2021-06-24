package day13loops;

public class MethodCreation01 {

	public static void main(String[] ali) {
		
		System.out.println(add(3, 5));//8
		
		System.out.println(add(13, 15));//28
		
		System.out.println(add(31, 51));//82
		
		System.out.println(add(30, 25));//55
		//The values you used when you call a method are called "arguments"
		System.out.println(multiply(2,3,4));//24

	}
	
	//Create a method and use it inside the main method
	public static int add(int a, int b) {		
		return a + b;		
	}
	
	//Create a method which multiplies 3 integers, then call the method from main method
	//The variables created inside the method parenthesis like x, y, z are called "parameters"
	
	public static int multiply(int x, int y, int z) {
		
		
		return x*y*z;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
