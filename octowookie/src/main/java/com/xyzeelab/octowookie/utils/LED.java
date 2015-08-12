package com.xyzeelab.octowookie.utils;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class LED {
	
	public static void blinkLED() {
		GpioController gpio = GpioFactory.getInstance();
		
		GpioPinDigitalOutput myLed = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07, "My LED", PinState.LOW);
		
		for (int i = 0; i <100; i++) {
			
			myLed.toggle();
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
