package com.yulong;

import java.awt.Color;
import java.awt.Graphics;

public class Tank {
	private static final int Speed =5;
	private int x,y;
	private Dir dir = Dir.DOWN;
	public Dir getDir() {
		return dir;
	}
	public void setDir(Dir dir) {
		this.dir = dir;
	}
	private TankFrame tf = null;
	public Tank(int x,int y,Dir dir,TankFrame tf) {
		this.x = x;
		this.y = y;
		this.dir = dir;
		this.tf  = tf;
		
		
	}
	public void paint(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.blue);
		g.fillRect(x, y, 50, 40);
		move();
		//x +=30;
		g.setColor(c);
		
	}
	private void move() {
		switch(dir) {
		case UP:
			y -= Speed;
			break;
		case DOWN:
			y += Speed;
			break;
		case LEFT:
			x -= Speed;
			break;
		case RIGHT:
			x += Speed;
			break;
		default:
			break;
		}	
	}
	public void setMoving(boolean b) {
		
		
	}
}
