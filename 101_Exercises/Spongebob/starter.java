import pkg.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


class starter {
	public static void main(String args[]) throws FileNotFoundException {
		
		//creating File instance to reference text file in Java
        File text = new File("./test.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner sc = new Scanner(text);
     
        //Reading each line of the file using Scanner class
        int lineNumber = 1;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            













 



        }      ;

		
	}
}
