import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[][] a = new int[6][10];
		for(int[] ia: a){
			fillWithFewUnique(ia);
		}
		Sortthread insert = new Sortthread(new InsertionSort(), "Insertionsort", a[1]);
		Sortthread select = new Sortthread(new SelectionSort(), "Selectionsort", a[2]);
		Sortthread shell = new Sortthread(new Shellsort(), "Shellsort", a[3]);
		Sortthread merge = new Sortthread(new Mergesort(), "Mergesort", a[0]);
		Sortthread quick = new Sortthread(new Quicksort(), "Quicksort", a[4]);
		Sortthread quick3 = new Sortthread(new Quick3sort(), "3-Way Quicksort", a[5]);

		Thread[] threads = new Thread[6];
		threads[0] = new Thread(insert);
		threads[1] = new Thread(select);
		threads[2] = new Thread(shell);
		threads[3] = new Thread(merge);
		threads[4] = new Thread(quick);
		threads[5] = new Thread(quick3);


		for(Thread thread: threads) {
			thread.start();
		}

		for(Thread thread: threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		for (int[] arr: a) {
			for(int i = 0; i<arr.length-1; i++) {
				assert(arr[i] < arr[i+1]);
			}
		}



	}

	private static void fillWithRandoms(int[] a) {
		Random rand = new Random();
		for (int j = 0; j < a.length; j++) {
			a[j] = rand.nextInt();
		}
	}

	private static void fillWithFewUnique(int[] a) {
		Random rand = new Random();
		for (int j = 0; j < a.length; j++) {
			a[j] = rand.nextInt(5);
		}
	}

	public static void print(int[] a) {
		for(int i : a){
			System.out.println(i);
		}
	}

}
