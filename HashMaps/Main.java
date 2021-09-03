
public class Main {

	public static void main(String[] args) {
		
		Hashmap<Integer, Integer> map = new Hashmap<>();
		for(int i=0;i<100;i++) {
			map.insert(i, 1);
		}
		for(int i=0;i<100;i++) {
			map.insert(i, map.get(i) + 1 );
		}
		for(int i=0;i<100;i++) {
			map.insert(i, map.get(i) + 1 );
		}
		for(int i=0;i<100;i++) {
			System.out.println(i +" " +  map.get(i));
		}
		for(int i=0;i<100;i++) {
			System.out.println(map.remove(i));
		}
		for(int i=0;i<100;i++) {
			System.out.println(i +" " +  map.get(i));
		}
		System.out.println(map.size());
		
	}
}
