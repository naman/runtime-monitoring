You will develop aspects to monitor programs to ensure compliance with the properties mentioned below. You may assume the existence of Server class with following methods.
public void start();
public void stop();
public void process();

The Server has following properties.

0. There can be more than one servers. Events associated with different servers are unrelated.
1. Every server start must be followed by a stop.
2. A start must precede every stop.
3. Two or more consecutive stops are acceptable.
4. Two or more consecutive starts are unacceptable.
5. A server that is stopped can be restarted.
6. Multiple process requests are acceptable, but no processing can happen between two consecutive starts or two consecutive stops.
7. The total process time between every pair of start and  stop must not exceed three seconds. This may result due to multiple process requests.

All of the errors should be reported as soon as possible. The aspects can be developed from scratch or (more conveniently) using JavaMOP. The properties should be specified using DFA models and the DFA models should be specified and submitted with the code.

Rest of the proprties are given in the assignment description. Run Evil.java.
