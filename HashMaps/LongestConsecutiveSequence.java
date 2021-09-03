import java.util.ArrayList;
import java.util.HashMap;

public class LongestConsecutiveSequence {

	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {

		HashMap<Integer, Boolean> map = new HashMap<>();
		HashMap<Integer,Integer> map2 = new HashMap<>();
		ArrayList<Integer> result = new ArrayList<>();
		int index = 0;
		for(int i : arr) {
			map.put(i, true);
			if(!map2.containsKey(i)){
				map2.put(i,index);
			}
			index++;
		}
		int maxLength = Integer.MIN_VALUE,start = Integer.MIN_VALUE,end =Integer.MIN_VALUE,startIndex = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {

			if(map.get(arr[i])) {
				map.put(arr[i], false);
				int s = arr[i],e = arr[i];
				int si = i;
				int count =1;
				for(int j=1; map.containsKey(arr[i] + j);j++ ) {
					map.put(arr[i]+j, false);
					e = arr[i] +j;
					count++;
				}
				for(int j=1; map.containsKey(arr[i] - j);j++ ) {
					map.put(arr[i]-j, false);
					s = arr[i] - j;
					count++;
				}
				si = map2.get(s);
				if(maxLength < count) {
					maxLength = count;
					start = s;
					end =e;
					startIndex = si;
				}
				else if(maxLength == count && si < startIndex) {
					start = s;
					end =e;
					startIndex = si;
				}

			}


		}
		for(int i=start;i<=end;i++) {
			result.add(i);
		}
		return result;

	}

}
