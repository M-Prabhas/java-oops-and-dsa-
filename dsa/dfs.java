package dsa;
import java.util.ArrayList;

public class dfs {

	public static int[]  dfs1(int start,int v,int vis[],ArrayList<Integer> stack,ArrayList<ArrayList<Integer>> graph){
		
		vis[start]=start;
		stack.add(start);
	   for(int i=start;i<=v;i++) {
		   if(vis[i] != i ) {
			   dfs1(start+1,v,vis,stack,graph);
		   }
	   }
	   
	   return vis;
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
		
		int v=5;
		int e=8;
		int vis[]=new int[v];
		ArrayList<Integer> stack=new ArrayList<>();
		
		dfs1(0,v,vis,stack,graph);

	}

}
