import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 200);
		printValuesInt(arr1);
		bubbleSort(arr1);
		System.out.println("\n");
		printValuesInt(arr1);
	}
	public static void bubbleSort(ArrayList<Integer> arr){
		int outer;
		int inner;
		int key;
		
		for(outer = 1; outer<arr.size(); outer++){
			key=arr.get(outer);
			inner = outer -1;
			while(inner >= 0 && arr.get(inner) > key){
				arr.set(inner+1, arr.get(inner));
				inner = inner -1;
			}
			arr.set(inner+1, key);
		}
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(new Integer((int)(Math.random()*1000)));
		}
	}
	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
}
