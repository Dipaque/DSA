package DataStructures;

import java.util.Arrays;

public class LinkedListOperations {
Node head;
public void insert(int data) {
	Node node=new Node();
	node.data=data;
	node.next=null;
	if(head==null) {
		head=node;
	}
	else {
		Node n=head;
		while(n.next!=null) {
			n=n.next;
		}
		n.next=node;
	
	}
}
public void insertAtStart(int data) {
	Node node=new Node();
	node.data=data;
	node.next=head;
	head=node;
}          
public void insertAt(int pos,int data) {
	Node node=new Node();
	node.data=data;
	node.next=null;
	Node n=head;
	if(pos==0) {
		insertAtStart(data);
	}
	else {
	for(int i=0;i<pos-1;i++) {
		n=n.next;
	}
	node.next=n.next;
	n.next=node;
}
}
public void display() {
	Node n=head;
	if(n==null) {
		return;
	}
	else {
	while(n.next!=null) {
		System.out.print(n.data+" ");
		n=n.next;
	}
	
	//to print last data
	System.out.println(n.data);
	}
}
public int deleteAt(int pos) {
	if(pos==1) {
		deleteAtFront();
	}
	Node n=head;
	Node n1=null;
	for(int i=1;i<pos-1;i++) {
		n=n.next;
	}
//	if(n==null) {
//		deleteAtEnd();
//	}
	n1=n.next;
	int data=n1.data;
	n.next=n1.next;
	return data;
}
public void deleteAtEnd() {
	Node n=head;
	Node n1=null;
	while(n.next!=null) {
		n1=n;
		n=n.next;
	}
	n1.next=null;	
}
public void deleteAtFront() {
	Node temp=head;
	head=temp.next;
	temp.next=null;
}
	
public int  count() {
	Node n=head;
	int count=0;
	while(n.next!=null) {
		count++;
		n=n.next;
	}
	count=count+1;
	return count;
	}
public void search(int no) {
	Node n=head;
	int count=0;
	while(n.next!=null) {
		if(n.data==no) {
			System.out.println(count+1);
			break;
		}
		count++;
		n=n.next;
	}
	if(n.next==null) {
		System.out.println(count+1);
	}
	}

public void dropDuplicates(int size) {
	int arr[]=new int [size];
	int i=0;
	Node n=head;
	while(n.next!=null) {
		arr[i]=n.data;
		n=n.next;
		i++;
	}
	arr[i]=n.data;
	Arrays.sort(arr);
	for(int j=0;j<arr.length-1;j++) {
		if(arr[j]!=arr[j+1]) {
			System.out.print(arr[j]+" ");
		}
	}
		System.out.print(arr[arr.length-1]);
}
public void sort() {
	Node temp=head;
	int tdata;
	if(head==null) {
		return;
	}
	else {
	while(temp!=null) {
		Node temp1=temp.next;
		while(temp1!=null) {
		if(temp.data>temp1.data) {
		tdata=temp.data;
		temp.data=temp1.data;
		temp1.data=tdata;
		}
		temp1=temp1.next;
	}
	temp=temp.next;
	}
	}
}
public boolean checkCyclic() {
	boolean flag=false;
	Node temp=head;
	while(temp.next!=null ) {
		Node temp1=temp.next.next;
		if(temp.data==temp1.data) {
			flag=true;
		}
		temp=temp.next;
	}
	return flag;
}
public void unique(int size) {
	int arr[]=new int [size];
	int i=0;
	Node n=head;
	while(n.next!=null) {
		arr[i]=n.data;
		n=n.next;
		i++;
	}
	arr[i]=n.data;
    for(int k=0;k<arr.length;k++){
        int flag=0;
        for(int j=0;j<arr.length;j++){
            if(arr[k]==arr[j] && k!=j){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(arr[k]);
        }
    }
}
public void sum(int n,int size) {
	Node temp=head;
	int arr[]=new int[size];
	int i=0;
	while(temp.next!=null) {
		arr[i]=temp.data;
		temp=temp.next;
		i++;
	}
	int sum=0;
	arr[i]=temp.data;
	for(int  j=size-1;j>=size-n;j--) {
		sum+=arr[j];
	}
	System.out.println(sum);
}
}