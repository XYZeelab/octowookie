package com.xyzeelab.octowookie;

import com.xyzeelab.octowookie.misc.SystemInformation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SystemInformation.GetInformation();
    	
    	RunnerRunnable runner = new RunnerRunnable();
    	Thread tc1 = new Thread(runner);
    	tc1.start();
    }
}
