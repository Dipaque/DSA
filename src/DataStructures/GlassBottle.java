package DataStructures;

import java.util.Scanner;

public class GlassBottle {
	public static void display() {
		System.out.println("Hello World!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=12;
		int plastic=11;
		int glass=9;
		int empty=8;
		int litre=0;
		while(n>=glass) {
			int diff=n-glass;
			litre++;
			n=diff+empty;
		}
		System.out.println(litre);
		display();
		sc.close();
	}
}
