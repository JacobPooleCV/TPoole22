package pkg;
import java.util.Scanner;
import java.util.Random;

public class Greyhound extends Dog{
	public String name;
	String color;

	public Greyhound() {
		name = "Rapid Ranger";
		color = "grey";
	}

	public boolean isFast(){
		return true;
	}
}
