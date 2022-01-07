package pkg;
import java.util.Scanner;
import java.util.Random;

public class Corgi extends Dog{
	public String name;
	String color;

	public Corgi() {
		name = "Joey";
		color = "golden";
	}

	public boolean hasSmallLegs(){
		return true;
	}

}
