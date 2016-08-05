
public class Quick3sort implements Sort{

	@Override
	public void sort(int[] a) {
		sort(a, 0, a.length-1);

	}

	private void sort(int[] a, int lo, int hi) {
		if(hi <= lo)
			return;

		int lt = lo, gt = hi;
		int v = a[lo];
		int i = lo;
		while (i <= gt) {
			int cmp = new Integer(a[i]).compareTo(new Integer(v));
			if(cmp < 0)
				swap(a, lt++, i++);

			else if(cmp > 0)
				swap(a, i, gt--);

			else
				i++;
		}

		sort(a, lo, lt-1);
		sort(a, gt+1, hi);
	}

	private void swap(int[] a, int x, int y) {
		int tmp = a[x];
		a[x] = a[y];
		a[y] = tmp;
	}
}
