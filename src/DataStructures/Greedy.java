package DataStructures;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Greedy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcabdbcd";
		boolean found=false;
		int n=0;
		int end=0;
		Pattern p=Pattern.compile("abd");
		Matcher m=p.matcher(str);
		while(m.find()) {
			found=true;
			n=m.start();
			end=m.end();
			break;
		}
		System.out.println(found);
	}

}
