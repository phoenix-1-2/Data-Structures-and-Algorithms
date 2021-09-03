
public class Cycle3 {

	public int solve(int n,int m,int U[],int V[]) {

		int[][] edges = new int[n+1][n+1];
		for(int i=0;i<m;i++) {
			
			edges[ U[i] ][ V[i] ] = 1;
			edges[ V[i] ][ U[i] ] = 1;
			
		}
		
		return countCycles( edges);
		
	}

	public int countCycles(int[][] edges) {
		int count=0;
		for(int i=1;i<edges.length;i++) {
			for(int j=1;j<edges.length;j++) {
				if(edges[i][j] ==1) {
					
					for(int k=1;k<edges.length;k++) {
						
						if(k!=i && edges[k][j]==1 && edges[i][k] ==1 ) {
							count++;
						}
						
						
					}
					
				}
			}
		}
		return count/6;
	}
	

}
