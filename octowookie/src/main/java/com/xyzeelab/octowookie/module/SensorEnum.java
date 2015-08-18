package com.xyzeelab.octowookie.module;

public enum SensorEnum {
	
	TemperatureSensor(1, "DHT 11 Temperature Sensor");
	
	private int sensorId;
	private String sensorName;
	
	/**
	 * @param id - Sensor Id
	 * @param sensorName - Sensor Name
	 */
	private SensorEnum (int id, String sensorName) {
		this.setId(id);
		this.setSensorName(sensorName);
	}

	public String getSensorName() {
		return sensorName;
	}

	public void setSensorName(String sensorName) {
		this.sensorName = sensorName;
	}

	public int getId() {
		return sensorId;
	}

	public void setId(int id) {
		this.sensorId = id;
	}
}
