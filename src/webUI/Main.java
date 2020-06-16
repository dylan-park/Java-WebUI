package webUI;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
	final static long UPDATE_RATE = 1;
	// Eventually you will have to pass a runtine into the program instead of just using itself
	static Runtime runtime = Runtime.getRuntime();
	
	public static void main(String[] args) {
		Timer timer = new Timer();
		TimerTask memCheck = new MemCheck();
		timer.scheduleAtFixedRate(memCheck, 0, UPDATE_RATE * 1000);

	}
}