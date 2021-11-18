package vladimir;

public class IntroSort {
	public void sort (int arr[]) {
		int maxdepth = (int) Math.log(arr.length) * 2;
		introSort(arr, maxdepth, 0, arr.length - 1);
	}
	
	public void introSort(int arr[], int maxdepth, int p, int r) {
		if (p >= r)
			return;
		if (maxdepth == 0)
			heapSort(arr, p, r);
		else {
			QuickSort qs = new QuickSort();
			int q = qs.partition(arr, p, r);
			
			introSort(arr, maxdepth - 1, p, q - 1);
			introSort(arr, maxdepth - 1, q + 1, r);
		}			
	}
	
	private void heapSort(int arr[], int p, int r) {
		for (int i = (r - 1)/2; i >= 0; i--)
			maxHeapify(arr, i, r);
		
		for (int i = r;i > 0; i--) {
			swap(arr, p, i);
			maxHeapify(arr, p, i);
		}
		
	}
	
	//max heap 인지 check
	private void maxHeapify(int arr[], int p, int r) {
		//p == root
		int leftChild = 2 * p + 1;
		int rightChild = 2 * p + 2;
		int largest = p;
		
		if (leftChild <= r && arr[leftChild] > arr[largest])
			largest = leftChild;
		if (rightChild <= r && arr[rightChild] > arr[largest])
			largest = leftChild;
		if (largest != p) {
			swap(arr, p, largest);
			maxHeapify(arr, largest, r);
		}
	}
	
	private void swap(int arr[], int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
		return ;
	}
}
