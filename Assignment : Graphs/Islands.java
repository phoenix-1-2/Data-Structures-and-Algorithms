
public class Islands {

	public static int solve(int n,int m,int U[],int V[]) {
		
		int[][] edges = new int[n+1][n+1];
		for(int i=0;i<U.length;i++) {
			edges[U[i]][V[i]] = 1;
			edges[V[i]][U[i]] = 1;
		}
		
		return countConnectedComponents(edges);
	}
	public static int countConnectedComponents(int[][] edges) {
		
		boolean[] visited = new boolean[ edges.length ];
		int count=0;
		for(int i=1;i<visited.length;i++) {
			if(!visited[i]) {
				dfs( edges, visited,i );
				count++;
			}
		}
		return count;
		
	}
	public static void dfs(int[][] edges,boolean[] visited,int i) {
		
		visited[i] = true;
		for(int j=1;j<edges.length;j++) {
			if(!visited[j] && edges[i][j] ==1) {
				dfs(edges, visited, j);
			}
		}
		
	}

}
