package DataStructures;

public class Infix {
	static int  top=-1;
	public void push(char stack[],char data,int n) {
	if(top==n-1) {
	System.out.println("Stack Overflow");
	}
	else {
	top=top+1;
	stack[top]=data;
	}
	}
	public void pop() {
	if(isEmpty()) {
	System.out.println("Stack Underflow");
	}
	else {
	top=top-1;
	}
	}
	public void display(char stack[]) {
	for(int i=top;i>=0;i--) {
	System.out.println(stack[i]);
	}
	}
	public boolean isEmpty() {
	if(top==-1) {
	return true;
	}
	else {
	return false;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="(6/2)*5-2";
		char ch[]=str.toCharArray();
		StackOpreations s=new StackOpreations();
		Infix in=new Infix();
		char stack1[]=new char[str.length()];
		int stack2[]=new int [str.length()];
		int n=str.length();
		int ans=0;
		for(int i=0;i<ch.length;i++) {
		if(ch[i]=='+' || ch[i]=='-' || ch[i]=='*' || ch[i]=='/' || ch[i]=='%') {
			in.push(stack1, ch[i], ch.length);
		}
		else if(ch[i]>='0'&& ch[i]<='9') {
			int num=Character.getNumericValue(ch[i]);
			s.push(stack2, num, stack2.length);
		}
		else if(ch[i]==')' ||ch[i]==']'|| ch[i]=='}') {
			int num1=s.pop(stack2);
			int num2=s.pop(stack2);
			switch(stack1[top]) {
			case '+' :ans=num2+num1;
					s.push(stack2, ans, n);
					break;
			case '-':ans=num2-num1;
					s.push(stack2, ans, n);
					break;
			case '*':ans=num2*num1;
					s.push(stack2, ans, n);
					break;
			case '/':ans=num2/num1;
					s.push(stack2, ans, n);
					break;
			case '%':ans=num2%num1;
					s.push(stack2, ans, n);
					break;
				}
			in.pop();
			}
		}	
		while(top>-1){
			if(stack1[top]=='+'|| stack1[top]=='-'||stack1[top]=='*'||stack1[top]=='/'||stack1[top]=='%') {
				int num1=s.pop(stack2);
				int num2=s.pop(stack2);
				switch(stack1[top]) {
				case '+' :ans=num2+num1;
						s.push(stack2, ans, n);
						
						break;
				case '-':ans=num2-num1;
						s.push(stack2, ans, n);
						
						break;
				case '*':ans=num2*num1;
						s.push(stack2, ans, n);
						
						break;
				case '/':ans=num2/num1;
						s.push(stack2, ans, n);
						break;
				case '%':ans=num2%num1;
						s.push(stack2, ans, n);
						break;
					}
				in.pop();
			}
		}
		s.display(stack2);
	}
}

