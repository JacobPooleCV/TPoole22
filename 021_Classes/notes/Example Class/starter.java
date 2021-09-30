import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		myMath test = new myMath();
		System.out.println(test.add());
		System.out.println(test.add(1,2));

		myMath test2 = new myMath(1,2);
		System.out.println(test2.add());
	}
}
