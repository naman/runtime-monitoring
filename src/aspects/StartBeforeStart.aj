package aspects;

import server.Evil;
import server.MyServer;
import exceptions.StartBeforeStartException;

public aspect StartBeforeStart {
	
	before(MyServer s):
		call(* MyServer.start()) && target(s) {
		if (Evil.servers.contains(s)) {
			throw new StartBeforeStartException();
		}
	}

	after(MyServer s) returning:
		call(* MyServer.start()) && target(s) {
		Evil.servers.add(s);
	}
	
	after(MyServer s) returning:
		call(* MyServer.stop()) && target(s) {
		Evil.servers.remove(s);
	}

}
