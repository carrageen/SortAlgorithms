public class HSort {
	public static void hsort(int[] array, int h){
		for(int i = 0; i<h; i++) {
			InsertionSort insort = new InsertionSort();
			insort.sort(array, h, i);
		}
	}
}
