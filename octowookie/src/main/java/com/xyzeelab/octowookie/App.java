package com.xyzeelab.octowookie;

import com.pi4j.system.SystemInfo;
import com.pi4j.system.NetworkInfo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	RunnerRunnable runner = new RunnerRunnable();
    	Thread tc1 = new Thread(runner);
    	tc1.start();
    }
}
