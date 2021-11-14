package pkg;
import java.util.Scanner;
import java.util.Random;


private class Ogre {
	private String name;

	public Ogre() {
		name = "Shrek";
		boolean ugly = true;
	}

	private String getName(){
		return name;
	}

	public boolean isUgly(){
		return ugly;
	}

	private void interact(Donkey donkey){
		System.out.println(donkey.name + ", what are you doing in my swamp?!");
		return;
	}


}
