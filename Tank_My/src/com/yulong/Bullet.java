package com.yulong;

public class Bullet {
	int x ,y ;
	final static int bulletSpeed = 10;
	Dir dir = Dir.DOWN;
	
	public Bullet(int x, int y, Dir dir) {
		super();
		this.x = x;
		this.y = y;
		this.dir = dir;
	}
	
	
}
