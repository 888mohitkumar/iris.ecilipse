package com.iris;

import java.util.Date;
import java.util.Timer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Timer timer = new Timer();
		
		//timer.scheduleAtFixedRate(new Task(), new Date().getTime(),5);
		timer.scheduleAtFixedRate(new Task(), 100, 5000);
		//timer.schedule(new Task(), 5);
	}

}
