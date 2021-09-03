import java.util.ArrayList;
import java.util.Scanner;

public class GetPathDFS {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] edges = Input_Ouput.input();
		int start = scanner.nextInt();
		int end  = scanner.nextInt();
		boolean[] visited = new boolean[edges.length];
		ArrayList<Integer> ans = getPath(edges, start, end, visited);
		if(ans!=null)
			for(int i : ans) {
				System.out.print(i+" ");
			}
	}

	public static ArrayList<Integer> getPath( int[][] edges ,int start ,int end, boolean[] visited){
		if(start == end) {
			ArrayList<Integer> ansArrayList = new ArrayList<>();
			ansArrayList.add(start);
			return ansArrayList;
		}
		visited[start] = true;
		for(int i=0;i<edges.length;i++) {

			if(edges[start][i]==1 && !visited[i]) {

				ArrayList<Integer> ans = getPath(edges, i, end, visited);
				if(ans!=null) {
					ans.add(start);
					return ans;
				}

			}

		}
		return null;

	}

}
