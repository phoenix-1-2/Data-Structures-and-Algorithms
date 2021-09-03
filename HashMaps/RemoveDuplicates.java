import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
	
	public static ArrayList<Integer> removeDuplicates(int[] arr){
		ArrayList<Integer> output= new ArrayList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		for(int i : arr) {
			if(!map.containsKey(i)) {
				map.put(i, true);
				output.add(i);
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,2,4,1,5,2,3,1,5,6};
		ArrayList<Integer> outputArrayList = removeDuplicates(arr);
		for(int i : outputArrayList) {
			System.out.print(i+" ");
		}
	}

}
