package DataStructures;

public class BalaceBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String str="{(a+b)]";
				StackOpreations st=new StackOpreations();
				char stack[]=new char [str.length()];
				int count=0;
				for(int i=0;i<str.length();i++) {
					if(str.charAt(i)=='('|| str.charAt(i)=='['|| str.charAt(i)=='{') {
						st.push(stack, str.charAt(i), stack.length);
						count++;
					}
					else if(str.charAt(i)==')'){
					if(stack[st.top]!='}'|| stack[st.top]!=']') {
						st.pop(stack);
						count--;
						}
					}
					else if(str.charAt(i)==']'){
						if(stack[st.top]!='}'|| stack[st.top]!=')') {
							st.pop(stack);
							count--;
							}
						}
					else if(str.charAt(i)=='}'){
						if(stack[st.top]!=')'|| stack[st.top]!=']') {
							st.pop(stack);
							count--;
							}
						}
				}
				if(count==0) {
					System.out.println("Yes");
				}
				else {
					System.out.println("No");
				}
			
				
	}

}
