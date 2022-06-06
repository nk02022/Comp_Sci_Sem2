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
		for(int outer = 0; outer<arr.size()-1; outer++)
			for(int inner = 0; inner<arr.size()-1-outer; inner++)
				if(arr.get(inner)>arr.get(inner+1)){
					//swap arr(inner) and arr(inner+1)
					Integer temp = arr.get(inner);
					arr.set(inner, arr.get(inner+1));
					arr.set(inner+1, temp);
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
