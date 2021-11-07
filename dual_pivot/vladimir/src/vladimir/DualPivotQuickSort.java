package vladimir;

public class DualPivotQuickSort{

	public void dualPivotQuickSort(int arr[], int p, int r) {
	
	}

	private int partition(int arr[], int p, int r) {
		
		int pivot = arr[r];
		int i = p - 1;
		
		for (int j= p; j < r ; j++) {
			if (arr[j] < pivot) {
				i = i + 1;
				swap(arr,i, j);
			}
			
		}
		swap(arr, i + 1, r);
		return i + 1;
		
	}
	
	private void swap(int arr[], int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] =tmp;
		return ;
	}
}
