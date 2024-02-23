package DataStructures;

import java.util.Scanner;

public class NSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int caseNo=sc.nextInt();
		for(int i=0;i<caseNo;i++) {
			LinkedListOperations li=new LinkedListOperations();
			int size=sc.nextInt();
			int n=sc.nextInt();
			for(int j=0;j<size;j++) {
				int element=sc.nextInt();
				li.insert(element);
				}
			li.sum(n,size);
			}
		
	}

}
