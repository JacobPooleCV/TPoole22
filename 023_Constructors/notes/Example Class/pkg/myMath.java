package pkg;
import java.util.Scanner;
import java.util.Random;


public class myMath {
    public int x;
    public int y;
    
	public myMath() {  // This is the empty constructor
		x = 0;
		y = 0;
	}
	
	public myMath(int a, int b) {  // This is the int constructor
		x = a;
		y = b;
	}
	
	public int add(int a, int b){
	    x = a;
	    y = b;
	    return x+y;
	}
	public int add(){
	    return x + y;
	}
	

}
