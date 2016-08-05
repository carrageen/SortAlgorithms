
public class SelectionSort implements Sort{
	private int i = 0;
	private int[] a;

	public void sort(int[] array) {
		a = array;
		for(i = 0; i<a.length;i++){
			swap(i, findSmallestRemaining());
		}

	}

	private int findSmallestRemaining(){
		int min = i;
		for(int j = i; j<a.length; j++) {
			if(a[j] < a[min])
				min = j;
		}
		return min;
	}

	private void swap(int x, int y) {
		int tmp = a[x];
		a[x] = a[y];
		a[y] = tmp;
	}

}
