import java.util.HashMap;

public class PairSumTo0 {

public static void PairSum(int[] input, int size) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i : input) {
			
			if( map.containsKey(-i) ) {
				for(int j=0;j<map.get(-i);j++) {
					if(-i < i) {
						System.out.println( -i +" "+ i  );
					}
					else {
						System.out.println( i +" " + -i  );
					}
				}
				
			}
			
			if(map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			}
			else {
				map.put(i, 1);
			}
		}
		
		
	}
	
	
}
