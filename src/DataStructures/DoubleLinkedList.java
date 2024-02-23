package DataStructures;

public class DoubleLinkedList {
		Node head;
		public void insertLast(int data) {
			Node n=new Node();
			n.data=data;
			n.next=null;
			if(head==null) {
				head=n;
			}
			else {
				Node temp=head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				n.previous=temp;
				temp.next=n;
			}
		}
		public void insertAtStart(int data) {
			Node n=new Node();
			if(head==null) {
				insertLast(data);
			}
			else {
			n.data=data;
			n.next=head;
			head.previous=n;
			head=n;
			}
		}
		public void insertAtMid(int pos,int data) {
			Node n=new Node();
			n.data=data;
			n.next=null;
			Node temp=head;
			if(pos==1) {
				insertAtStart(data);
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
			while(n.next!=null) {
				n1=n;
				n=n.next;
			}
			n1.next=null;
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
		public void deleteAtFront() {
			Node temp=head;
			head=temp.next;
			head.previous=null;
			temp.next=null;
		}
		public void display() {
			Node n=head;
			while(n.next!=null) {
				System.out.println(n.data);
				n=n.next;
			}
			//to print last data
			System.out.println(n.data);
			}
		
public void length() {
	Node n=head;
	int count=1;
	while(n.next!=null) {
		count++;
		n=n.next;
	}
	System.out.println(count);
	}
public void search(int key) {
	Node n=head;
	int count=1;
	int flag=0;
	while(n.next!=null) {
		if(n.data==key) {
			System.out.println(count);
			flag=1;
			break;
		}
		count++;
		n=n.next;
	}
	if(n.next==null && n.data==key) {
		System.out.println(count);
		flag=1;
		return;
	}
	if(flag==0) {
		System.out.println("Not found!");
		return;
	}
	
	
	}
public void deleteElement(int key) {
	Node n=head;
	int count=1;
	if(head.data==key ) {
 		deleteAtFront();
 	}
	else {
	while(n.next!=null) {
		
			 if(n.data==key) {
		 		deleteAt(count);
		 	}
		 	n=n.next;
		 	count++;
			}
		}

	}
}


