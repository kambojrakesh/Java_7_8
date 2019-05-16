package java7.map.conMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Worker implements Runnable {
	int i;
	ConcurrentHashMap<Integer, Integer> ch = new ConcurrentHashMap<>(16, 1, 1);

	Worker(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		ch.put(i + 10, null);
		// ch.remove(1);
		System.out.println(ch);

	}
}

public class TestNestedAbsInterface {

	public static void main(String args[]) {

		ExecutorService ex = Executors.newFixedThreadPool(101);

		for (int i = 0; i < 10; i++) {
			Worker w = new Worker(i);
			ex.execute(w);
		}

	}
}