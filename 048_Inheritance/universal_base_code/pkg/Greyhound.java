package pkg;
import java.util.Scanner;
import java.util.Random;

public class Greyhound extends Dog{
	public String name;
	String breed;

	public Greyhound() {
		name = "Rapid Ranger";
		breed = "Greyhound";
	}

	public boolean isFast(){
		return true;
	}
}
