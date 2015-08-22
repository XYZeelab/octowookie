package com.xyzeelab.octowookie.communications;

import java.util.Scanner;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import com.pi4j.io.i2c.I2CBus;
import com.pi4j.io.i2c.I2CDevice;
import com.pi4j.io.i2c.I2CFactory;
import com.pi4j.io.serial.Serial;
import com.pi4j.io.serial.SerialDataEvent;
import com.pi4j.io.serial.SerialFactory;

public class SerialCommunication {
	private SerialType serialType;
	public static final byte address = 0x40;
	
	public static void  Connect () {
    
		SerialType type;
	    I2CBus bus = null;
	    I2CDevice device = null;
	    	    
		try {
			bus = I2CFactory.getInstance(I2CBus.BUS_1);
			device = bus.getDevice(address);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	   		
		byte[] startByte = { 0x12 };
		byte[] endByte = { 0x13 };
		
		while (true)
		{
			Scanner scanner = new Scanner(System.in);
		    String line = scanner.nextLine();
		    byte[] datatosend = line.getBytes();
	    
		    ByteArrayOutputStream outputStream = new ByteArrayOutputStream ();
		    try {
				outputStream.write(startByte);
			    outputStream.write(datatosend);
			    outputStream.write(endByte);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	
			try {
	   			device.write(outputStream.toByteArray(), 0 ,outputStream.toString().length());
	   			Thread.sleep(2000);
	   			
	   			int ch = device.read();
	   			if (ch > 0)
	   				System.out.println("Received something");
	   			
	   			System.out.println(ch);
	   			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Exception occurred: " + e.getMessage());
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Exception occurred: " + e.getMessage());
			}
		}


		
		
	}

	public SerialType getSerialType() {
		return serialType;
	}

	public void setSerialType(SerialType serialType) {
		this.serialType = serialType;
	}
}
