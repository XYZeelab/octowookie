package com.xyzeelab.octowookie.communications;

public enum SerialCommandByte {
		  REQ_SENSOR_DATA(0x52), 
		  RES_SENSOR_DATA(0x56),
		  RES_SENSOR_DATA_WITH_STATUS(0x44),
		  RESET_SENSOR(0x5A);

		  private int code;

		  private SerialCommandByte(int code) {
		    this.code = code;
		  }

		  public int getCode() {
		    return code;
		  }
}
