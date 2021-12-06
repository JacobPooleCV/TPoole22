package pkg;
import java.util.Scanner;
import java.util.Random;


public class Ascii {
	String type;		// What type of Ascii Art
	String name;		// What is Ascii arts name
	String oneLine;
	int number;			// How many times should it be printed

	//If undefined, type defaults to Human, name defaults to bob, and number defaults to 1.

	public Ascii() {			// Sets Ascii to default
		type = "Human";
		name = "Bob";
		number = 1;
		oneLine = "";
	}
	public Ascii(String a) {	// Sets Ascii type
		type = checkType(a);
		name = "Bob";
		number = 1;
		oneLine = "";
	}
	public Ascii(String a, String b) {	// Sets Ascii type and name
		type = checkType(a);
		name = b;
		number = 1;
		oneLine = "";
	}
	public Ascii(String a, int c) {	// Sets Ascii type and how many
		type = checkType(a);
		name = "Bob";
		number = c;
		oneLine = "";
	}
	public Ascii(String a, String b, int c) {	// Sets Ascii type, name, and how many
		type = checkType(a);
		name = b;
		number = c;
		oneLine = "";
	}
	private String checkType(String a){					// Checks if the input String a is valid
		if(a.equals("human") || a.equals("Human")){
			return "Human";
		}
		else if(a.equals("dog") || a.equals("Dog")){
			return "Dog";
		}
		else if(a.equals("cactus") || a.equals("Cactus")){
			return "Cactus";
		}
		else if(a.equals("other") || a.equals("Other")){
			return "Other";
		}
		else{
			return "Human";
		}
	}

	public void setType(String a){		// Sets variable type to input
		type = checkType(a);
	}
	public void setName(String a){		// Sets variable type to input
		name = a;
	}
	public void setNumber(int a){		// Sets variable number to input
		number = a;
	}
	public void setAscii(String a){		// Set a one line Ascii of your choice
		oneLine = a;
	}

	public void printArt(){				// Prints out the name and the art number times
		System.out.println("Your Ascii Art's name is " + name + "!");
		int i = 0;
		while (i < number){
			if(type.equals("Human")){
				System.out.println("      ////^\\\\\\\\ ");
				System.out.println("      | ^   ^ | ");
				System.out.println("     @ (o) (o) @ ");
				System.out.println("      |   <   | ");
				System.out.println("      |  ___  | ");
				System.out.println("       \\_____/ ");
				System.out.println("     ____|  |____ ");
				System.out.println("    /    \\__/    \\ ");
				System.out.println("   /              \\ ");
				System.out.println("  /\\_/|        |\\_/\\ ");
				System.out.println(" / /  |        |  \\ \\ ");
				System.out.println("( <   |        |   > ) ");
				System.out.println(" \\ \\  |        |  / / ");
				System.out.println("  \\ \\ |________| / / ");
				System.out.println("   \\ \\|<I_D_I__|/ / ");
				System.out.println("    \\ \\ / I  \\ / / ");
				System.out.println("     \\ /  I   \\ / ");
				System.out.println("     |         | ");
				System.out.println("     |    |    | ");
				System.out.println("     |    |    | ");
				System.out.println("     |    |    | ");
				System.out.println("     |    |    | ");
				System.out.println("     | ## | ## | ");
				System.out.println("     |    |    |  ");
				System.out.println("     |    |    | ");
				System.out.println("     |____|____| ");
				System.out.println("     (____(____) ");
				System.out.println("      _| | _| | ");
				System.out.println("  cccC__Cccc___) ");
			}
			else if(type.equals("Dog")){
				System.out.println("^..^      / ");
				System.out.println("/_/\\_____/ ");
				System.out.println("   /\\   /\\ ");
				System.out.println("  /  \\ /  \\ ");
			}
			else if(type.equals("Cactus")){
				System.out.println("  _  _ ");
				System.out.println(" | || | _");
				System.out.println("-| || || |");
				System.out.println(" | || || |-");
				System.out.println("  \\_  || |");
				System.out.println("    |  _/");
				System.out.println("   -| | \\ ");
				System.out.println("    |_|- ");
			}
			else if(type.equals("Other")){
				System.out.println(oneLine);
			}
			else{
				System.out.println("How did I get here...");
			}
			i++;
		}
	}

	

}
