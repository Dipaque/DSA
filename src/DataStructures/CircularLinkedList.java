package DataStructures;

public class CircularLinkedList {
	Node head;
public void insert(int data) {
	Node n=new Node();
	n.data=data;
	n.next=null;
	if(head==null) {
		head=n;
		n.next=head;
	}
	else {
		Node temp=head;
		while(temp.next!=head) {
			temp=temp.next;
		}
		temp.next=n;
		n.next=head;
	}
}
public void insertDLL(int data) {
	Node n=new Node();
	n.data=data;
	n.next=null;
	n.previous=null;
	if(head==null) {
		head=n;
		n.next=head;
		n.previous=null;
	}
	else {
		Node temp=head;
		while(temp.next!=head) {
			temp=temp.next;
		}
		temp.next=n;
		n.previous=temp;
		n.next=head;
	}
}
public void insertStart(int data) {
	Node n=new Node();
	if(head==null) {
		insertDLL(data);
	}
	else {
		Node tempHead=head;
	n.data=data;
	n.next=head;
	head.previous=n;
	head=n;
	Node last=head.next;
	while(last.next!=tempHead) {
		last=last.next;
	}
	last.next=head;
	
	}	
}
public void insertMid(int pos,int data) {
	Node n=new Node();
	n.data=data;
	n.next=null;
	Node temp=head;
	if(pos==1) {
		insertStart(data);
	}
	else {
	for(int i=2;i<pos;i++) {
		temp=temp.next;
	}
	n.next=temp.next;
	temp.next=n;
	n.previous=temp;
	Node n1=n.next;
	n1.previous=n;
	}
}
public void deleteAtMid(int pos) {
	Node n=head;
	Node n1=null;
	for(int i=0;i<pos-1;i++) {
		n1=n;
		n=n.next;
	}
	n1.next=null;
	n1.next=n.next;
}
public void deleteLast() {
	Node n=head;
	Node n1=null;
	while(n.next!=head) {
		n1=n;
		n=n.next;
	}
	n1.next=head;
}
public void deleteAtFront() {
	Node temp=head;
	head=temp.next;
	head.previous=null;
	Node temp1=head.next;
	while(temp1.next!=temp) {
		temp1=temp1.next;
	}
	temp1.next=head;
	
}
	
public void display() {
	Node temp=head;
	while(temp.next!=head) {
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
	System.out.println(temp.data);
}
public void deleteAt(int pos) {
	Node n=head;
	Node n1=null;
	if(pos==1) {
		deleteAtFront();
	}
	else {
	for(int i=2;i<pos;i++) {
		n=n.next;
	}
	n1=n.next;
	n.next=n1.next;
	n.previous=n1;
}
}
public void deleteElement(int key) {
	Node n=head;
	int count=1;
	if(head.data==key ) {
 		deleteAtFront();
 	}
	else {
	while(n.next!=head) {
		
			 if(n.data==key) {
		 		deleteAt(count);
		 	}
		 	n=n.next;
		 	count++;
	}
	if(n.data==key) {
		deleteLast();
	}
	}

		}
public void length() {
	Node n=head;
	int count=1;
	while(n.next!=head) {
		count++;
		n=n.next;
	}
	System.out.println(count);
	}

public void search(int key) {
Node n=head;
int count=1;
int flag=0;
while(n.next!=head) {
	if(n.data==key) {
		System.out.println(count);
		flag=1;
		break;
	}
	count++;
	n=n.next;
}
if(n.next==head && n.data==key) {
	System.out.println(count);
	flag=1;
	return;
}
if(flag==0) {
	System.out.println("Not found!");
	return;
}
}
	
}

