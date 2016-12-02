package server;

import java.util.Random;

public class MyServer {
	int time;
	public boolean isStopped = false;

	public int getTime() {
		return time;
	}

	public void start() {
		isStopped = false;
		System.out.println("Server starting");
	}

	public void stop() {
		isStopped = true;
		System.out.println("Server stopping");
		time = 0; // time should be reset
	}

	public void process() throws InterruptedException {
		Random r = new Random();
		int processTime = r.nextInt(5);
		time = time + processTime;
		if (time <= 3) {
			System.out.println("Server processing");
			Thread.sleep(processTime * 1000);
		}
	}
}