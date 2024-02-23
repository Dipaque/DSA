package DataStructures;
import java.util.*;
public class BFS {
	public static void main(String[] args) {
	int n=6;
	int head=0;
	Graph g=new Graph();
	Queuee q=new Queuee();
	boolean visited[]=new boolean [n];
		int arr[][]=new int [n][n];
		g.addDirectionalArray(arr,0,1);
		g.addDirectionalArray(arr,0,3);
		g.addDirectionalArray(arr,3,1);
		g.addDirectionalArray(arr, 3,2);
		g.addDirectionalArray(arr,1,4);
		g.addDirectionalArray(arr,3,4);
		g.addDirectionalArray(arr,1,2);
		g.addDirectionalArray(arr,4,2);
		g.addDirectionalArray(arr,5,4);
		g.addDirectionalArray(arr, 5,2);
		g.DFS(head, arr, visited);
	
	}
}
