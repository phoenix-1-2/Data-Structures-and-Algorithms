import java.util.ArrayList;
class MapNode<T,V>{
	T key;
	V value;
	MapNode<T,V> next;
	public MapNode(T key,V value) {
		this.key = key;
		this.value=value;
		this.next = null;
	}
}
public class Hashmap<T,V> {

	private ArrayList<MapNode<T,V>> bucketArray;
	private int size;
	private int numBuckets;

	public Hashmap() {	
		bucketArray = new ArrayList<>();
		numBuckets =20;
		for(int i=0;i<numBuckets;i++) {
			bucketArray.add(null);
		}
		size=0;
	}
	public int size() {
		return size;
	}
	private int indexHashCode(T key) {

		int index = key.hashCode();
		return index% numBuckets;

	}
	private void rehash() {
		
		ArrayList<MapNode<T,V>> temp = bucketArray;
		bucketArray = new ArrayList<>();
		size=0;
		numBuckets*=2;
		for(int i=0;i<numBuckets;i++) {
			bucketArray.add(null);
		}
		for(int i=0;i<temp.size();i++) {
			
			MapNode<T,V> head = temp.get(i);
			while(head!=null) {
				insert( head.key , head.value);
				head= head.next;
			}
			
		}
		
		
	}
	public void insert(T key,V value) {

		int bucketIndex = indexHashCode(key);

		MapNode<T,V> head = bucketArray.get(bucketIndex);
		boolean isPresent = false;
		while(head!=null) {
			if(head.key == key) {
				head.value = value;
				isPresent=true;break;

			}
			head = head.next;
		}
		if(!isPresent) {
			MapNode<T,V> newNode = new MapNode<>(key, value);
			head = bucketArray.get(bucketIndex);
			newNode.next = head;
			bucketArray.set(bucketIndex, newNode);
			double load = 1.0 * size / numBuckets;
			size++;
			if( load > 0.7 ) {
				rehash();
			}
		}

	}
	public V get(T key) {
		int bucketIndex = indexHashCode(key);
		MapNode<T,V> head = bucketArray.get(bucketIndex);
		while(head!=null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head= head.next;
		}
		return null;
	}
	public V remove(T key) {
		
		int bucketIndex = indexHashCode(key);
		MapNode<T,V> head = bucketArray.get(bucketIndex),prev = null , curr = head;
		V val = null;
		while(curr!=null) {
			
			if(curr.key==key) {
				val = curr.value;
				size--;
				if(prev==null) {
					bucketArray.set(bucketIndex, curr.next);
					return val;
				}
				prev.next = curr.next;
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		return val;
		
	}
}
