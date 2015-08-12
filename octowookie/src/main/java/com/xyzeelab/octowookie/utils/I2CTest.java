package com.xyzeelab.octowookie.utils;

import java.util.Scanner;
import java.io.IOException;
import java.nio.ByteBuffer;

import com.pi4j.io.i2c.I2CBus;
import com.pi4j.io.i2c.I2CDevice;
import com.pi4j.io.i2c.I2CFactory;
import com.pi4j.io.serial.Serial;
import com.pi4j.io.serial.SerialDataEvent;
import com.pi4j.io.serial.SerialFactory;

public class I2CTest {
	
	public static void  I2CCommunicationTest () {
    
	    I2CBus bus = null;
	    I2CDevice device = null;
	    
		try {
			bus = I2CFactory.getInstance(I2CBus.BUS_1);
			device = bus.getDevice(0X04);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	   
	    byte[] buffer = null;
	    

	    while (true) {
			try {
			    Scanner scanner = new Scanner(System.in);
			    Integer number = scanner.nextInt();
			    byte packettosent = number.byteValue();
			    
	   			device.write(packettosent);
	   			
	   			Thread.sleep(2000);
				//device.read(buffer, 0, 2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	}
}
