import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Input_Ouput {


	public static void main(String[] args) {
		int[][] edges = input();
		System.out.println("DFS");
		DFS(edges);
		System.out.println();
		System.out.println("BFS");
		BFS(edges);
	}
	public static int[][] input(){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int e = scanner.nextInt();
		int[][] edges = new int[n][n];
		for(int i=0;i<e;i++) {
			int se = scanner.nextInt();
			int ee = scanner.nextInt();
			edges[se][ee] = 1;
			edges[ee][se] = 1;
		}
		return edges;
	}
	public static void DFS(int[][] input) {
		boolean[] visited = new boolean[input.length];
		for(int i=0;i<visited.length;i++) {
			if(!visited[i]) {
				helperDFS(input,i,visited);
			}
		}
	}
	public static void helperDFS(int[][] input, int i, boolean[] visited) {

		System.out.print(i+" ");
		visited[i] = true;
		for(int x=0;x<input.length;x++) {
			if( input[i][x] ==1 && !visited[x] ) {
				helperDFS(input, x, visited);
			}
		}

	}

	public static void BFS(int[][] input) {

		boolean[] visited  = new boolean[input.length];
		for(int i=0;i<visited.length;i++) {
			if(!visited[i]) {
				BFS(input, i, visited);
			}
		}

	}
	public static void BFS(int[][] input,int sv ,boolean[] visited) {

		Queue<Integer> queue = new LinkedList<>();
		queue.add(sv);
		visited[sv] = true;
		while(!queue.isEmpty()) {
			
			int frontVertex = queue.poll();
			System.out.print(frontVertex+" ");
			for(int i=0;i<input.length;i++) {
				if( input[frontVertex][i] == 1 && !visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}
			
		}


	}


}
