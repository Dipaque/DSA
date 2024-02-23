package DataStructures;

import java.util.Scanner;

public class TransactionExchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int productRate=30;
		int flag=1;
		int cashBox[]=new int [3];
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==30) {
				cashBox[0]+=1;
			}
			else if(arr[i]==60) {
				if(cashBox[0]>=1) {
					
					cashBox[0]-=1;
					cashBox[1]+=1;
				}
				else {
					flag=0;
					break;
				}
			}
			else if(arr[i]==120) {
				if(cashBox[0]>=3) {
					cashBox[0]-=3;
					cashBox[2]+=1;
					
				}
				else if( (cashBox[0]>=1 && cashBox[1]>=1)) {
					cashBox[0]-=1;
					cashBox[1]-=1;
					cashBox[2]+=1;
				}
				else {
					flag=0;
					break;
				}
			}
		}
		if(flag==1) {
			System.out.println("Transaction Passed");
		}
		else {
			System.out.println("Transaction Failed");
		}
		
	}

}
