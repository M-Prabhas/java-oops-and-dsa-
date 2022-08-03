package dsa;
import java.util.*;
public class graphBFS {

	public static boolean bfs(ArrayList<ArrayList<Integer>> graph,int src,int dest,
			int v,int pred[],int dist[]) {
		
		LinkedList<Integer> queue=new LinkedList<>();
		boolean visited[]=new boolean[v];
		for(int i=0;i<v;i++) {
			visited[i]=false;
			dist[i]=Integer.MAX_VALUE;
			pred[i]=-1;
		}
		
		visited[src]=true;
		dist[src]=0;
		queue.add(src);
		int u=0;
		while(!queue.isEmpty()) {
			int curr= queue.remove();
			for(int i=0;i<graph.get(u).size();i++) {
				int neighbour=graph.get(u).get(i);
				if(visited[neighbour]==false) {
					visited[neighbour]=true;
					dist[neighbour]=dist[curr]+1;
					pred[neighbour]=curr;
					queue.add(neighbour);
					
					if(neighbour==dest)
						return true;
					
					}
			
			}
			u++;
		}
		
		return false;
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
		int v=6;
		int e=8;
		
		int pred[]=new int[v+1];
		int dist[]=new int[v+1];
		
		System.out.println(bfs(graph,1,6,v,pred,dist));

	}

}
