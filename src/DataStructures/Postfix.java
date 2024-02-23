package DataStructures;

public class Postfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String str="2 3 1 * + 9 -";
		char ch[]=str.toCharArray();
		StackOpreations s=new StackOpreations();
		int [] stack=new int [str.length()];
		int temp=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>'0' && ch[i]<='9') {
				int a=Character.getNumericValue(ch[i]);
				s.push( stack,a, str.length());
			}
			else if(ch[i]=='+' ||ch[i]=='-' || ch[i]=='*' || ch[i]=='/' || ch[i]=='%') {
			switch(ch[i]) {
			case '+' : int num1=s.pop(stack);
						int num2=s.pop(stack);
						 temp=num2+num1;
						 s.push(stack,temp,str.length());
						
						 break;
			case '-':  num1=s.pop(stack);
						 num2=s.pop(stack); 			
						 temp=num2-num1;
						 s.push(stack, temp, str.length());
						 break;
			case '*':  num1=s.pop(stack);
						num2=s.pop(stack); 			
						temp=num2*num1;
						s.push(stack,temp,str.length());
						break;
			case '/':  num1=s.pop(stack);
			 			num2=s.pop(stack); 			
			 			temp=num2/num1;
			 			s.push(stack, temp, str.length());
			 			break;
			
			}                                                                                             
		}
		}
		s.display(stack);
		

	}

}

