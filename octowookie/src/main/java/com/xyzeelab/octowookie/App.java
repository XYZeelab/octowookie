package com.xyzeelab.octowookie;

import com.xyzeelab.octowookie.misc.SysInfo;
import com.xyzeelab.octowookie.utils.LED;
import com.xyzeelab.octowookie.RunnerRunnable;


public class App {
    public static void main( String[] args )
    {
    	SysInfo.GetInformation();
    	
    	System.out.println("Blinking LED");
    	LED.blinkLED();
    	
//    	RunnerRunnable runner = new RunnerRunnable();
//    	Thread tc1 = new Thread(runner);
//    	tc1.start();
    }
}
