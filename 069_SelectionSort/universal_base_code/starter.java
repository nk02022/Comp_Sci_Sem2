import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 200);
		printValuesInt(arr1);
		selectionSort(arr1);
		System.out.println("\n");
		printValuesInt(arr1);
	}
	public static void selectionSort(ArrayList<Integer> arr){
		for(int outer = 0; outer<arr.size()-1; outer++){
			int minInd = outer;
			for(int inner = outer+1; inner<arr.size(); inner++)
				if(arr.get(inner)<arr.get(minInd)){
					minInd = inner;
				}
			Integer temp = arr.get(minInd);
			arr.set(minInd, arr.get(outer));
			arr.set(outer, temp);
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
