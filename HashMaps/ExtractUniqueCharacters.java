import java.util.HashMap;

public class ExtractUniqueCharacters {

	public static String uniqueChar(String str){
		String x="";
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++) {

			if(!map.containsKey(str.charAt(i))) {
				x+=str.charAt(i);
				map.put(str.charAt(i),1);
			}
		}
		return x;
	}
}
