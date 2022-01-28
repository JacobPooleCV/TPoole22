package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name!
	int age;			// How many times should it be printed
	String villain;		// Who's the arch nemesis of this Spiderman

	public Spiderman() {			// Default constructor!
		this("Tobey Maguire", 46, "Green Goblin");
	}
	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	public Spiderman(String actor) {			// String constructor!
		this(actor, 46, "Green Goblin");
	}
	public Spiderman(int age) {			// int constructor!
		this("Tobey Maguire", age, "Green Goblin");
		fight();
	}
	public Spiderman(String actor, int age) {			// String, int constructor!
		this(actor, age, "Green Goblin");
	}
	public Spiderman(String actor, int age, String villain) {			// String, int, String constructor!
		this.actor = actor;
		this.age = age;
		this.villain = villain;
		printArt();
	}
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	public void setActor(String actor){
		this.actor = actor;
		return;
	}
	public void setAge(int age){
		this.age = age;
		return;
	}
	public void setVillain(String villain){
		this.villain = villain;
		return;
	}

	public String getActor(){
		return actor;
	}
	public int getAge(){
		return age;
	}
	public String getVillain(){
		return villain;
	}


	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}

	

}
