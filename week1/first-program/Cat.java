
// Data Type
// Primitive Types
//	int
//	float
//	char
//	double
//	long
//	byte
//	short
// 	boolean

//	Non-floating point Integer values
//	byte 	- 8 bits / 1 byte			default:0
//	short 	- 16 bits	ex: short s = 5;		0
//	int 	- 32 bits  	ex: int x = 5;			0
//	long 	- 64 bits					0

//	Floating point (Decimal) values
//	float	- 32 bits	ex: float x = 5.5f;	default:0.0
//	double	- 64 bits	ex: double d = 5.5;		0.0

//	char	- 16 bits	ex: char c = 'x';		u00000
//	boolean	- 1 bit 	ex: boolean b = true;		false?

// Reference Types
//	default value for reference types is null;
/*
	multi line comment
*/

public class Cat{ // class declaration
	String name = "Tom";
	double weight = 15;
	private int age = 22;
	String breed = "American Shorthair";
	boolean isFixed = false;
	boolean isChipped = false;
	String owner;
	String color = "Blue/Grey";


	public static void main(String[] args){
		Cat newCat = new Cat(); // object instantiation
		Cat newCat1; // object declaration
		Cat cat2 = new Cat();
		
		newCat = cat2;
		newCat1 = newCat;
		System.out.println("age: " + newCat.age); //22
		newCat.sleep();
		newCat1.sleep();
		cat2.sleep();
		System.out.println("age: " + newCat.age); //25
	}


	public int getAge(){
		return this.age;
	}

	public void setAge(int age){
		this.age = age;
	}

	public void walk(){
		System.out.println("Walking.");
	}

	public void eat(){
		System.out.println("Devouring tuna.");
	}

	public String meow(){
		return "Woof";
	}

	public int attack(){
		return 100;
	}

	public void sleep(){
		this.age = this.age + 1; 
	}

	public Cat breed(){
		Cat newCat = new Cat();
		return newCat;
	}
}

