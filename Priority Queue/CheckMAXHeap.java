public class CheckMAXHeap {

	public static boolean checkMaxHeap(int arr[]) {

		for(int  i=0;i<arr.length;i++) {

			int parentIndex = i;
			int leftChildIndex = 2*i + 1;
			int rightChildIndex = 2*i + 2;

			if( leftChildIndex < arr.length && arr[parentIndex] < arr[leftChildIndex] ) {
				return false;
			}
			if( rightChildIndex < arr.length && arr[parentIndex] < arr[rightChildIndex] ) {
				return false;
			}
			

		}
		return true;


	}
}
