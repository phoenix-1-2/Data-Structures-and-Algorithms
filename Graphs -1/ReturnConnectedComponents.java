import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ReturnConnectedComponents {
	
	public static void main(String[] args) {
		
		int[][] edges = Input_Ouput.input();
		ArrayList<ArrayList<Integer>> arrayList = connectedComponents(edges);
		for(ArrayList<Integer> row : arrayList) {
			for(int i : row) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	public static ArrayList<ArrayList<Integer>> connectedComponents(int[][] edges){
		
		boolean[] visited = new boolean[edges.length];
		ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
		for(int i=0;i<visited.length;i++) {
			if(!visited[i]) {
				arrayList.add(path(edges, i, visited));
			}
		}
		return arrayList;
	}
	public static ArrayList<Integer> path(int[][] edges,int sv,boolean[] visited){
		ArrayList<Integer> arr = new ArrayList<>();
		Queue<Integer> queue = new LinkedList<>();
		queue.add(sv);
		visited[sv] = true;
		while(!queue.isEmpty()) {
			
			int front = queue.poll();
			arr.add(front);
			for(int i=0;i<edges.length;i++) {
				
				if(!visited[i] && edges[front][i] ==1) {
					queue.add(i);
					visited[i] = true;
				}
				
			}
		
		}
		 Collections.sort(arr);
		 return arr;
		
	}

}
