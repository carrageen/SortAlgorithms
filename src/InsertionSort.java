import java.util.ArrayList;

public class InsertionSort implements Sort{
	private int i = 0;

	public void sort(int[] array, int stride, int offset) {
		offset %= stride;

		if (stride == 1)
			sort(array);
		else {
			ArrayList<Integer> toBeSorted = new ArrayList<>();
			for (int i = offset; i < array.length; i++) {
				if (i % stride == 0)
					toBeSorted.add(array[i]);
			}

			int[] sortArr = new int[toBeSorted.size()];
			int j = 0;
			for (int i : toBeSorted) {
				sortArr[j++] = i;
			}

			sort(sortArr);

			j = 0;
			for(int i = offset; i<array.length; i++){
				if(i%stride == 0)
					array[i] = sortArr[j++];
			}
		}



	}

	public void sort(int[] a) {
		for(i = 1; i<a.length;i++){
			int j = i;
			while(j>0 && a[j]>a[j-1]){
				swap(a, j, j-1);
				--j;
			}
		}
	}

	private void swap(int[] a, int x, int y) {
		int tmp = a[x];
		a[x] = a[y];
		a[y] = tmp;
	}
}
