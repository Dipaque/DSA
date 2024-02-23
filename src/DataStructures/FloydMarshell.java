package DataStructures;
import java.util.*;
public class FloydMarshell {
	    public void undir(int[][] arr,int u,int v){
	        arr[u][v]=1;
	        arr[v][u]=1;
	    }
	    public void dir(int[][] arr,int u,int v){
	        arr[u][v]=1;
	    }
	    public void wundir(int[][] arr,int u,int v,int w){
	        arr[u][v]=w;
	        arr[v][u]=w;
	    }
	    public void wdir(int[][] arr,int u,int v,int w){
	        arr[u][v]=w;
	    }
	    public void printarr(int[][] arr){
	        for(int i=0;i<arr.length;i++){
	            System.out.print("The indices of "+i+" are: ");
	        for(int j=0;j<arr[i].length;j++){
	            System.out.print(arr[i][j]+" ");
	        }                                                        
	        System.out.println();
	        }
	    }

	    public static void main(String[] args){
	       FloydMarshell g=new FloydMarshell();
	       Scanner sc=new Scanner(System.in);
	       int n=4;
	       int[][] arr=new int[n][n];
	       g.wdir(arr, 0, 1, 3);
	       g.wdir(arr, 2, 0, 5);
	       g.wdir(arr, 0, 3, 7);
	       g.wdir(arr,3,0,2);
	       g.wdir(arr, 1, 2, 2);
	       g.wdir(arr, 2, 3, 1);
	       g.wdir(arr, 1, 0, 1);
	       g.printarr(arr);
	    sc.close();

	    
	}
}
