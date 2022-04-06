import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<String> arr2 = new ArrayList<String>();
		addValuesInt(arr1, 10);
		addValuesString(arr2, 10);
		printValuesInt(arr1);
		System.out.println();
		printValuesString(arr2);

		searchArrInt(arr1, 5);
		searchArrString(arr2, "apple");
		
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(new Integer((int)(Math.random()*10)));
		}
	}

	public static void addValuesString(ArrayList<String> arr, int num){
		for(int i = 0; i < num; i++){
			int rand = (int)(Math.random()*4);
			if(rand == 0)
				arr.add(new String("potato"));
			else if(rand == 1)
				arr.add(new String("apple"));
			else if(rand == 2)
				arr.add(new String("banana"));
			else if(rand == 3)
				arr.add(new String("orange"));
		}
			
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	public static void printValuesString(ArrayList<String> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
}
