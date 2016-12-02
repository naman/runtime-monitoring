package server;

import java.util.ArrayList;

public class Evil {
	public static ArrayList<MyServer> servers;

	public static void main(String[] args) {
		Evil e = new Evil();
		try {
			e.doEvilStuff();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}

	private void doEvilStuff() throws InterruptedException {
		servers = new ArrayList<MyServer>();

		MyServer s = new MyServer();
		s.start();

		s.process();

		s.start();
		s.stop();

		s.start();
		s.process();
		s.stop();
		s.stop();

	}

}