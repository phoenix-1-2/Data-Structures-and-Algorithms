import java.util.Scanner;

public class HasPath {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();
        int[][] edges = new int[V][V];
        for(int i=0;i<E;i++){

            int sv = s.nextInt();
            int ev = s.nextInt();

            edges[sv][ev] = 1;
            edges[ev][sv] = 1;
        }
        int start = s.nextInt();
        int end  = s.nextInt();
        boolean[] visited = new boolean[V];
        System.out.println(  hasPath( edges,start,end,visited ) );
    }

    public static boolean hasPath(int[][] edges,int start,int end,boolean[] visited){

        if(edges[start][end] == 1){
            return true;
        }
        visited[start] = true;
        for(int i=0;i<edges.length;i++){
            if( edges[start][i] ==1 && !visited[i] ){
                if(hasPath(edges,i,end,visited)){
                    return true;
                }
            }
        }
        return false;

    }
}