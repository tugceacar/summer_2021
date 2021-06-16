package day08stringmanipulations;

public class String01 {

	public static void main(String[] args) {
		
		/*
		 	"Learn Java earn money" I want you to find the index of 'e' inside the second "earn"
		*/
		String s1 = "Learn Java earn money";
		
		System.out.println(s1.indexOf("earn", 5));//11
		
		//9.Method: lastIndexOf() <== It returns the index of last occurence of a character + Returns int
		System.out.println(s1.indexOf("e"));//1
		
		System.out.println(s1.lastIndexOf("e"));//19
		System.out.println(s1.lastIndexOf('e'));//19 <== lastIndexOf() accepts char as a parameter
		
		System.out.println(s1.lastIndexOf(" "));//15
		System.out.println(s1.lastIndexOf(' '));//15
		
		System.out.println(s1.lastIndexOf(""));//21
		
		System.out.println(s1.lastIndexOf("X"));//-1 <== For non-existing characters, it returns -1
		System.out.println(s1.lastIndexOf('X'));//-1
		
		System.out.println(s1.lastIndexOf("Java"));//6 <== It found the last Java, then returned the index of first character
		System.out.println(s1.lastIndexOf("earn"));//11
		
		System.out.println(s1.lastIndexOf('a', 10));//9 <== lastIndexOf() gets the first 5 characters in that example
		                                            //      then returns the index of a
		
		System.out.println(s1.lastIndexOf("e", 14));
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
