package DataStructures;

public class Queuee {
	//ARRY IMPLEMENTATION IN QUEUE
	    int front=-1;
	    int rear=-1;
	    public void enqueue(int queue[],int data,int n){
	    	if(front==0&&rear==queue.length-1) {
	    		System.out.println("Overflow!");
	    	}
	    	else {
	    		if(front==-1 && rear==-1)
	    			front=front+1;
	         queue[++rear]=data;
	    	}
	    }
	    public int  dequeue(int queue[]){
	    	int temp=0;
	    	if(front ==-1 && rear==-1) {
	    		System.out.println("Underflow!");
	    	}
	    	else {
	        temp=queue[front];
	      for(int i=0;i<rear;i++) {
	    	  queue[i]=queue[i+1];
	      }
	      
	      rear--;
	    	}
	        return temp;
	    	
	    }
	    public void display(int queue[]){
	        for(int i=0;i<=rear;i++){
	            System.out.println(queue[i]);

	        }
	    }
	    public int poll(int queue[]){
	        int poll=queue[front];
	        dequeue(queue);
	        return poll;
	    }
	    public int size(){
	        return rear;
	    }
	    public boolean isEmpty() {
	    	if((front==-1 && rear==-1) || (front>rear)){
	    		return true;
	    	}
	    	else {
	    	return false;
	    	}
	    }
	 // LINKEDLIST IMPLEMENTATION
	    Node head;
		public void enqueueLL(int data) {
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
		public int  dequeueLL() {
				Node temp=head;
				head=temp.next;
				temp.next=null;
			int t= temp.data;
			return t;
		}
		public void displayLL() {
			Node n=head;
			if(n==null) {
				System.out.println(" ");
			}
			else {
			while(n.next!=null) {
				System.out.print(n.data+" ");
				n=n.next;
			}
			
			//to print last data
			System.out.print(n.data);
			}
		}
		public int search(int key) {
			Node n=head;
			while(n.next!=null ) {
				if(key==n.data)
					break;
				n=n.next;
			}
			return key;
		}
		public int sizeLL() {
			Node n=head;
			int count=0;
			while(n.next!=null) {
				count++;
				n=n.next;
			}
			count=count+1;
			return count;
		}
		public int pollLL() {
			int poll=head.data;
			dequeueLL();
			return poll;
		}
}
	       
	   
	 

	


