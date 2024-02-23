package DataStructures;

public class BucketSort {
	public static void main(String [] args) {
		int arr[]= {181, 289, 390, 121, 145, 736, 514, 888, 122};
		int lar=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>lar) {
				lar=arr[i];
			}
		}
		int freq[]=new int [lar+1];
		
		for(int i=0;i<freq.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					count++;
				}
			}
			freq[i]=count;
		}
		int index=0;
		int size=0;
		int sortedArr[]=new int [freq.length];
		for(int i=0;i<freq.length;i++) {
			if(freq[i]==0) {
				continue;
			}
			else {
				int temp=freq[i];
				for(int j=0;j<temp;j++) {
				sortedArr[index++]=i;
				size++;
				
				}
				
			}
		}
		for(int K=0;K<size;K++)
			System.out.print(sortedArr[K]+" ");
	
	}
}
