package DataStructures;

public class LRU {
	public void LRU(int last,int arr[]) {
		int flag=0;
		int found=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==last) {
				flag=1;
				found=i;
			}
		}
		if(flag==0) {
			int temp=arr[0];
			for(int j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=last;
		}
		if(flag==1) {
			int temp=arr[found];
			for(int i=found;i<arr.length-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=last;
		}
	}
	public void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String [] args) {
		Queuee q=new Queuee();
		int arr[]=new int [5];
		for(int i=0;i<arr.length;i++) {
			q.enqueue(arr, i, arr.length);
		}
		LRU l=new LRU();
		l.LRU(6,arr);
		l.LRU(3, arr);
		l.display(arr);
		
	}
}
