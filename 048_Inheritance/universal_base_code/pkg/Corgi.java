package pkg;
import java.util.Scanner;
import java.util.Random;

public class Corgi extends Dog{
	String breed;
	public String name;

	public Corgi() {
		breed = "Corgi";
		name = "Joey";
	}

	public boolean hasSmallLegs(){
		return true;
	}

}
