package aspects;

import server.Evil;
import server.MyServer;
import exceptions.StartBeforeStopException;
import exceptions.TLE;

public aspect StartBeforeStopandTLE {

	before(MyServer s):
		call(* MyServer.stop()) && target(s) {
		if (s.getTime() > 3) {
			throw new TLE();
		}
		if (Evil.servers.contains(s)) {
			Evil.servers.remove(s);
		} else if (s.isStopped) {
			System.out.println("Two or more consecutive stops are acceptable.");
		} else {
			throw new StartBeforeStopException();
		}
	}

	after(MyServer s) returning:
		call(* MyServer.start()) && target(s) {
		Evil.servers.add(s);
	}

}
