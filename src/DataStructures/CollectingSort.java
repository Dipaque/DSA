package DataStructures;

public class CollectingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {181, 289, 390, 121, 145, 736, 514, 888, 122};
		int large=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>large) {
				large=arr[i];
			}
		}
		
		int freq[]=new int [large+1];
		for(int i=0;i<freq.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
				count++;	
				}
			}
			freq[i]=count;
		}
		int in=0;
		for(int i=0;i<freq.length-1;i++) {
				freq[i+1]=freq[i]+freq[i+1];
		}
		int sortedArr[]=new int [freq.length];
		int size=0;
		for(int i=0;i<freq.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					int index=freq[i];
					sortedArr[index-1]=i;
					freq[i]=freq[i]-1;
					size++;
				}
			}
		}
		for(int i=0;i<size;i++) {
			System.out.println(sortedArr[i]);		}
	}

}
