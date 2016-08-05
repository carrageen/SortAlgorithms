
public class Quicksort implements Sort{

	@Override
	public void sort(int[] a) {
		sort(a, 0, a.length-1);

	}

	private void sort(int[] a, int lo, int hi) {
		if(hi <= lo)
			return;

		int j = partition(a, lo, hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);
	}

	private int partition (int[] a, int lo, int hi) {
		int i = lo, j = hi+1;
		while(true) {
			while(a[++i] < a[lo])
				if(i == hi)
					break;

			while(a[lo] < a[--j])
				if(j == lo)
					break;

			if(i >= j)
				break;

			swap(a, i, j);
		}
		swap(a, lo, j);
		return j;
	}

	private void swap(int[] a, int x, int y) {
		int tmp = a[x];
		a[x] = a[y];
		a[y] = tmp;
	}
}

