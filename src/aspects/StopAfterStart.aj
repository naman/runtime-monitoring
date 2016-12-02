package aspects;

import exceptions.NoStopAfterStartException;
import server.Evil;

public aspect StopAfterStart {
	
	after(Evil e) returning:
		call(* Evil.doEvilStuff()) && target(e) {
		
		if (Evil.servers.size() != 0) {
			throw new NoStopAfterStartException();
		}
	}

}
