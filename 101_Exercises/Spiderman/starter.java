import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman peter = new Spiderman(35);

		Spiderman [] multiverse = new Spiderman[50];

		for(int i = 0; i < 50; i++){
			multiverse[i] = new Spiderman();
		}

		for(int i = 0; i < 50; i++){
			multiverse[i].setActor("tom holland");
			multiverse[i].setAge(24);
			multiverse[i].setVillain("The Vulture");
		}

		for(int i = 0; i < 50; i++){
			System.out.println(multiverse[i].getActor());
			System.out.println(multiverse[i].getAge());
			System.out.println(multiverse[i].getVillain());
		}



		
	}
}
