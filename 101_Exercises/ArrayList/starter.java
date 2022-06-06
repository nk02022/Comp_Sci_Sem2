import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList <Integer> arr = new ArrayList <Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many value do you you you wants in yous array?");
		int a = sc.nextInt();
		for(int b = 0; b<a; b++){
			arr.add((int)(Math.random()*9)+1);
			printArrayList(arr);
		}
		System.out.println("How many more values do you want to add you greedy person"){
			int b = sc.nextInt();
			addValueArrayList(arr, b);
			printArrayList(arr);
		}
	}
}
