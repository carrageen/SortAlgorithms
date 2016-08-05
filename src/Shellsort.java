
public class Shellsort implements Sort{
	private int[] sequence = {777, 555, 444, 333, 222, 111, 54, 32,16, 7, 4, 1};
	public void sort(int[] array){

		int l = array.length;
		for(int h: sequence) {
			if(h<l)
				HSort.hsort(array, h);
		}
	}
}
