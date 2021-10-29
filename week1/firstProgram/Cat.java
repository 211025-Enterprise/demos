package firstProgram;
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

// Access Modifiers
//			global    package    subclass    class
//	public		x	  x          x           x
//	protected		  x          x		 x
//	default			  X   	     		 x
//	private						 x


public class Cat{ // class declaration
	public String name = "Tom";
	protected double weight = 15;
	private int age = 22;
	private String breed = "American Shorthair";
	protected boolean isFixed = false;
	boolean isChipped = false;
	String owner;
	String color = "Blue/Grey";

	// method overloading:
	// no two methods of the same name, can share the same number 
	// of arguments if the order and type of those arguments 
	// are the same.
	public Cat(){
	}

	public Cat(String name){
		this.name = name;
	}

	
	public Cat(int age){ // valid, BUT... it 
		this.breed = breed;
		this.age = age;
	}

	public Cat(long age){ // valid, BUT... it
		this.breed = breed;
		this.age = (int) age;
	}

	public Cat(float weight){
	
	}

	public Cat(double weight){

	}

//	public Cat(String breed){ // not valid
//		this.breed = breed;
//	}

	public Cat(String breed, int age){
		this.breed = breed;
		this.age = age;
	}

	public Cat(int age, String breed){ // valid, order is different
		this.breed = breed;
		this.age = age;
	}


	public String getBreed(){
		return this.breed;
	}

	public int getAge(){
		return this.age;
	}

	public int getAge(String something){
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

