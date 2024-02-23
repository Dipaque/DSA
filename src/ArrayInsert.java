import java.util.*;

		public class Main{
		public static void main(String[] args) {
			ArrayInsert st=new ArrayInsert();
			int [] ar=new int [20];
			ar[0]=4;
			ar[1]=2;
			ar[2]=3;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the pos");
			int pos=sc.nextInt();
			System.out.println("enter the ele");
			int ele=sc.nextInt();
			int n=ar.length;
		/*for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}*/
		st.insert(pos,ele,ar);
		for(int i=00;i<ar.length;i++) {
		System.out.println(ar[i]);
		}

		}
	}
}
