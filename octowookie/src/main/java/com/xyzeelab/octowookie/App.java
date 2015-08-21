package com.xyzeelab.octowookie;

import com.xyzeelab.octowookie.misc.SysInfo;
import com.xyzeelab.octowookie.communications.*;
import com.xyzeelab.octowookie.utils.LED;
import com.xyzeelab.octowookie.RunnerRunnable;

/**
 * @author Anthony
 *
 */
public class App {
    /**
     * @param args No parameters accepted yet.
     */
    public static void main( String[] args )
    {
    	SysInfo.GetInformation();
    	
    	//System.out.println("Blinking LED");
    	//LED.blinkLED();
    	
    	System.out.println("Communicating with Arduino using I2C");
    	SerialCommunication.Connect();
    	
//    	RunnerRunnable runner = new RunnerRunnable();
//    	Thread tc1 = new Thread(runner);
//    	tc1.start();
    }
}
