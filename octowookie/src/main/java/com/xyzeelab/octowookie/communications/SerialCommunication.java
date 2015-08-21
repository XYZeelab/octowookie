package com.xyzeelab.octowookie.communications;

import java.util.Scanner;
import java.io.IOException;
import com.pi4j.io.i2c.I2CBus;
import com.pi4j.io.i2c.I2CDevice;
import com.pi4j.io.i2c.I2CFactory;
import com.pi4j.io.serial.Serial;
import com.pi4j.io.serial.SerialDataEvent;
import com.pi4j.io.serial.SerialFactory;

public class SerialCommunication {
	private SerialType serialType;
	
	public static void  Connect () {
    
		SerialType type;
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
	    
		byte[] startcmd = { 0x7E };
		
		try {
			device.write(startcmd, 0, startcmd.length);
			
		    while (true) {
				
				SerialCommandByte command = SerialCommandByte.REQ_SENSOR_DATA;
				
			    Scanner scanner = new Scanner(System.in);
			    String line = scanner.nextLine();
			    byte[] packettosent = line.getBytes();
			    
	   			device.write(packettosent, 0 ,packettosent.length);
	   			
	   			Thread.sleep(2000);
				//device.read(buffer, 0, 2);
	
		    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception occurred: " + e.getMessage());
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception occurred: " + e.getMessage());
		}
	}

	public SerialType getSerialType() {
		return serialType;
	}

	public void setSerialType(SerialType serialType) {
		this.serialType = serialType;
	}
}
