
public class Driver{
	public static void main(String[] args){
		// Control Flow
		//	Iteratives - do something repeaetedly
		//	Conditionals - check against a condition

		boolean condition = false;

		int x = 7;
		int y = 6;
		
		// ==
		// .equals()

		// <
		// >
		// <=
		// >=

		// && 	AND with short circuiting -- all need to be true
		// || 	OR -- only one needs to be true	
		// ^	XOR
		// &	AND
		// |	OR

		// Conditionals
		// true | false | false -- using OR
		// true | false

		if(x < y & x == y & x > y){
			// execute if the condition is true
			System.out.println("less than");
		} else if(x == y){
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		
		// switch will receive a value and then execute a matching 
		switch(0){
			case 0: System.out.println("Zero");
			case 1: System.out.println("One");
			case 7: System.out.println("Seven");
			case 8: System.out.println("Eight");	
		}
		
		switch("Someth"){
			case "Hello": System.out.println("Welcome to the program!");
				break;
			case "Goodbye": System.out.println("Get outa here!");
				break;
			default: System.out.println("Something went wrong...");
				break;
		}
	}
}