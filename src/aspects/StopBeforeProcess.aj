package aspects;

import server.Evil;
import server.MyServer;
import exceptions.StopBeforeProcessException;

public aspect StopBeforeProcess {

	before(MyServer s):
		call(* MyServer.process()) && target(s) {
		if (s.isStopped) {
			throw new StopBeforeProcessException();
		}
	}

	after(MyServer s) returning:
		call(* MyServer.stop()) && target(s) {
		Evil.servers.remove(s);
	}

}
