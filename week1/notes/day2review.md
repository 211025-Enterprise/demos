# Day 2 Review

## Operators
### Equality/Comparison Operators
	== equality   (keep .equals() in mind) 
	!= non-equality
	<
	>
	<=
	>=
### Arithmetic
	+
	-
	*
	/
	% - modulo/modulus - gives me the remainder (3 % 2 = 1)
	()
### Logical shortcircuit
	&&  
	||

### Bitwise	x == 5 ^ y == 6 ^ z == 7    given 5, 6, 7 or true, true, false
	&	both	one
	|	one	both
	^	either but not both
### Ternary
	?
	x == 5 ? code to execute if true : code to execute if false;
	z == 5 || y == 6 ? print(true) : print(false);
### Unary
	! negation  boolean b = true; !b = false;
	++ increment, equivalent to += 1
	-- decrement, equivalent to 
### Assignment
	this.age = this.age + 5;     this.age + 5;
	this.age += 5;
	this.age += 1; this.age++; post-increment
	20 , 20, 21
	method(++age); pre-increment
	=	assign a value to a location in memory (a variable)
	+=	evaluate and reassign
	-= 
	/=
	*=
	%=

## Access Modifiers	Same Class	Same Package subclass	Same Package Non-sub	Different Package sub	Different Package non-sub
	private		x
	default		x		x			x			
	protected	x		x			x			x			
	public		x		x			x			x			x


Animal interface 
	species
	habitat
	
	feedingPatterns
	feed();
	sleep();
	reproduce();

class Dog implements Animal

	feed(){
		yummy
	}

class Dolphin implements Animal

	feed(){
	}
}



List<Animals> storeInventory = new ArrayList();

	for(Animal a in storeInventory){
		a.feed();
		a.sleep();
	}



Dog dog = new Dog();
dog.bark(); // woof

Chihuahua c = new Chihuahua();


public abstract class Business{
	license
	location
	type

	abstract openingProdures(); // interface

	closingProcedure(){
		location.lock();
	}
	
}

public class Pub extends Business{
	public OP(){
		location.unlock();
	}
	@Override
	public closingProcedures(){
		we don't close
	}
}

Pub p = new Pub();

## Non-Access Modifiers
	final - 	you cannot change the data
		variables - constant or immutable
		methods - you can't override the method in a subclass
		class - class can not be extended
	static - 
		variable - belongs to the class, not the instance. 
		methods - same as above
		class ? depends on the level of the class

	abstract
		methods
		class - 
	

public abstract class Dog implements Animal, Interface2{
	// this is the dogs 
	String name = "Jeff";
	...
	abstract feed();
	sleep(){
		...
	}
}

public class Husky extends Dog implement Walkable {
	feed(){
		...
	}
}

RealEstateApp - 1
HouseListingForce
RevApartments
RevaHouse
RevEstate*
BlueDoors
BlueFin
RevaListing
Revasture
Evature
Realature*
	