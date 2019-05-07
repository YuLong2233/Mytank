package com.yulong;

public class Tank {
	private static final int tankSpeed =5;
	private int x,y;
	private Dir dir = Dir.DOWN;
	private TankFrame tf = null;
	private Tank(int x,int y,Dir dir,TankFrame tf) {
		this.x = x;
		this.y = y;
		this.dir = dir;
		this.tf  = tf;
		
		
	}
}
