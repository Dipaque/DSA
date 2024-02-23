package DataStructures;

public class CountRepeatedChar {
	public static void main(String[] args) {
		String name="ProsperMartial";
		char ch[]=name.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int count=0;
				if(ch[i]==ch[i+1]) {
					count++;
				}
			System.out.println(ch[i]+" "+count);
		}
	}

}
