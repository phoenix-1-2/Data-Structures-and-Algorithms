import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GetPathBFS {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] edges = Input_Ouput.input();
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		boolean[] visited = new boolean[edges.length];
		ArrayList<Integer> arrayList  = getPath(edges, start, end, visited);
		if(arrayList!=null)
			for(int i : arrayList) {
				System.out.print(i+" ");
			}
	}
	public static ArrayList<Integer> getPath(int[][] edges,int start,int end,boolean[] visited){

		Queue<Integer> queue = new LinkedList<>();
		HashMap<Integer, Integer> map = new HashMap<>();

		queue.add(start);
		visited[start] = true;
		while( !queue.isEmpty() && queue.peek()!=end) {

			int front = queue.poll();
			for(int i=0;i<edges.length;i++) {
				if(!visited[i] && edges[front][i] == 1) {
					queue.add(i);
					visited[i] = true;
					map.put(i, front);
				}
			}

		}
		ArrayList<Integer> ans = new ArrayList<>();
		if(!map.containsKey(end)) {
			return null;
		}
		else {
			ans.add(end);
			int f = map.get(end);
			while(f!=start) {
				ans.add(f);

				f = map.get(f);

			}
			ans.add(start);

		}

		return ans;



	}

}
