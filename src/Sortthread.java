import java.time.Duration;
import java.time.Instant;

public class Sortthread implements Runnable {
	private int[] a;
	String name;
	Sort alg;


	public Sortthread(Sort alg, String name,  int[] array){
		this.a = array;
		this.name = name;
		this.alg=alg;
	}
	@Override
	public void run() {
		Instant startTime = Instant.now();
		alg.sort(a);
		System.out.println(name + "fertig nach " + Duration.between(startTime, Instant.now()));
	}

}
