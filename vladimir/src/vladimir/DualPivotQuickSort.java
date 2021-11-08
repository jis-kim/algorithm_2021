package vladimir;

public class DualPivotQuickSort{
	public void dualPivotQuickSort(int arr[], int p, int r) {
		
		if (r - p < 17) { //길이가 17보다 작다
			insertionSort(arr, p, r);
			return ;
		}
		
		if (arr[r] < arr[p])
			swap(arr, p, r);
		int p1 = arr[p];
		int p2 = arr[r];
		
		int l = p + 1; //p1보다 작은 값..의 다음
		int g = r - 1; //p2보다 큰 값..의 다음
			
		for (int k = l; k <= g; k++) {
			if (arr[k] < p1) {//1영역
				swap(arr, l, k);
				l = l + 1;
			}
			else if (arr[k] > p2) {//3영역
				while(arr[g] > p2 && k < g)
					g--;
				swap(arr, g, k);
				g = g - 1;
				
				if (arr[k] < p1) { //바 값이 1영역
					swap(arr, l, k);
					l = l + 1;
				}
			}
		}
		
		l--;//pivot들이 들어갈 위치를 조정한다.
		g++;
		swap(arr, p, l);
		swap(arr, r, g);
		
		dualPivotQuickSort(arr, p, l - 1);
		dualPivotQuickSort(arr, l + 1, g - 1);
		dualPivotQuickSort(arr, g + 1, r);
	}
	
	private void insertionSort(int arr[], int p, int r) {
		int j;
		for(int i = p + 1; i <= r; i++) {
			for(j = p; j < i; j++) { //p~i -1(정렬됨)까지 큰거 있나 확인1
				if (arr[i] < arr[j])
					break;
			}
			int tmp = arr[i];
			for (int k = i; k > j; k--) //뒤부터 땡긴
				arr[k] = arr[k - 1];
			arr[j] = tmp;
		}
	}
	
	private void swap(int arr[], int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
