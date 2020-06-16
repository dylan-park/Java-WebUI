package webUI;

import java.util.TimerTask;

public class MemCheck extends TimerTask {

	@Override
	public void run() {
		int mb = 1024 * 1024;

		// Print used memory
		System.out.println(((Main.runtime.totalMemory() - Main.runtime.freeMemory()) / mb) + "MB / "
				+ (Main.runtime.totalMemory() / mb) + "MB (" + (Main.runtime.maxMemory() / mb) + "MB max)");
	}

}
