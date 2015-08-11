package com.xyzeelab.octowookie;

class RunnerRunnable implements Runnable {
	
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i < 5; i++)
		{
			System.out.println("Hello: " + i + " Thread:" + Thread.currentThread().getName());
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			}
		}
		
	}
}