package DataStructures;

public class StackOpreations {
	//ARRAY IMPLEMENTATION
	int top=-1;
public void push(char  stack[],char data,int n) {
	if(top==n-1) {
		System.out.println("Stack Overflow");
	}
	else {
		top=top+1;
		stack[top]=data;
	}
}
public void  pop(char  stack[]) {
	int pop=0;
	if(isEmpty()) {
		System.out.println("Stack Underflow");
	}
	else {
	 pop=stack[top];
		top=top-1;
	}
//	return pop;
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

//LINKEDLIST
Node head;
public void pushll(char data) {
	Node n=new Node();
	n.data=data;
	n.next=null;
	if(head==null) {
		head=n;
		top=head.data;
	}
	else {
		n.next=head;;
		head=n;
		top=head.data;
	}
}
public void peek() {
	System.out.println(top);
}
public void peekArr(char stack[]) {
	System.out.println(stack[top]);
}
public void displayll() {
	Node temp=head;
	while(temp.next!=null) {
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
	System.out.print(temp.data);
	
}
public void popll() {
	if(isEmpty()) {
		System.out.println("Stack underflow");
	}
	else {
	Node temp=head;
	head=temp.next;
	temp.next=null;
	top=head.data;
}
}
}
