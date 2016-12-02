package aspects;

import server.Evil;
import server.MyServer;
import exceptions.StartBeforeProcessException;

public aspect StartBeforeProcess {

	before(MyServer s):
		call(* MyServer.process()) && target(s) {
		
		if (!Evil.servers.contains(s)) {
			throw new StartBeforeProcessException();
		}
	}

	after(MyServer s) returning:
		call(* MyServer.start()) && target(s) {
		Evil.servers.add(s);
	}
}
