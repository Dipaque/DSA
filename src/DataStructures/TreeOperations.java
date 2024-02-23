package DataStructures;

import java.util.Scanner;

public class TreeOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree bt=new Tree();
		Scanner sc=new Scanner(System.in);
		int n=1;
		while(n==1) {
     	int choice=sc.nextInt();
		switch(choice) {
		case 1:int data=sc.nextInt();
				bt.insert(data);
				break;
		case 2:int key=sc.nextInt();
				bt.delete(bt.root,key);		
				break;
		case 3: int keys=sc.nextInt();
				bt.search(bt.root, keys);
				break;
		case 4:bt.inorder(bt.root);
		    	break;
		}
		}
		sc.close();

	}

}
