package ui;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class MultiThreadTimer extends Thread {

	
	@Override
	public void run() {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			int i = -1;
			@Override
			public void run() {	
				
				System.out.print(++i);
				if(i == 10) {
					timer.cancel();
				}
			}	
		},1000, 1000);
	}

}
