package DataStructures;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
	public  void addElementsUndirectionalWeight(ArrayList<ArrayList<Integer>>arr,int adrs,int data,int weight) {
		arr.get(adrs).add(data);
		arr.get(adrs).add(weight);
		arr.get(data).add(adrs);
		arr.get(data).add(weight);
	}
	public  void addDirectionalWeight(ArrayList<ArrayList<Integer>>arr,int adrs,int data,int weight) {
		arr.get(adrs).add(data);
		arr.get(adrs).add(weight);
	}
	public  void addUndirectional(ArrayList<ArrayList<Integer>>arr,int adrs,int data) {
		arr.get(adrs).add(data);
		arr.get(data).add(adrs);
	}
	public  void addDirectional(ArrayList<ArrayList<Integer>>arr,int adrs,int data) {
		arr.get(adrs).add(data);
	}
	public void printList(ArrayList<ArrayList<Integer>>arr) {
		for(int i=0;i<arr.size();i++) {
			for(int j=0;j<arr.get(i).size();j++) {
			System.out.print(arr.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
	public void addUnDirectionalArray(int [][]arr,int u,int v) {
		arr[u][v]=1;
		arr[v][u]=1;
	}
	public void addDirectionalArray(int [][]arr,int u,int v) {
		arr[u][v]=1;
	}
	public void printArr(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void BFS(int head,int [][]arr) {
		int n=arr.length;
		BFS g=new BFS();
		Queue<Integer> q=new LinkedList<Integer>();
		boolean [] visited=new boolean[n];
		visited[head]=true;
			q.add(head);
			while(!q.isEmpty()) {
				int temp=q.remove();
				System.out.print(temp+" ");
				for(int i=0;i<arr[temp].length;i++) {
					if(arr[temp][i]==1) {
						int av=i;
				if(!visited[av])
					q.add(av);
					visited[av]=true;
			}
		}
	}
}
	public void DFS(int head,int arr[][],boolean[] visited) {
		int n=arr.length;
		visited[head]=true;
		System.out.print(head+" ");
		for(int i=0;i<arr[head].length;i++) {
			if(arr[head][i]==1) {
				int av=i;
			if(!visited[av]) {
				DFS(av,arr,visited);
				}
			}
		}
	}
}
