package com.xyzeelab.octowookie.communications;

public enum DataFrameFlags {
		START_FLAG(0x12),
		END_FLAG(0x13),
		CMD_FLAG(0x14),
		ESC_FLAG(0x7D);
	
	  private int code;

	  private DataFrameFlags(int code) {
	    this.code = code;
	  }

	  public int getCode() {
	    return code;
	  }
}
