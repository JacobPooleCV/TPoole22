import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Corgi a = new Corgi();
		System.out.println(a.name);
		a.bark();

		Greyhound b = new Greyhound();
		System.out.println(b.name);
		b.bark();

		Dog c = new Dog();
		System.out.println(c.name);
		c.bark();
	}
}
