package com.xyzeelab.octowookie.utils;

public enum DataFrameFlags {
	START_FLAG(0x12),
	END_FLAG(0x13),
	ESC_FLAG(0x7D);
	
	private int flags;
	
	private DataFrameFlags(int serialFlag) {
		this.flags = serialFlag;
	}
	
}
