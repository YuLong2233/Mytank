package com.yulong;

import java.awt.Color;
import java.awt.Graphics;

public class Tank {
	private static final int Speed =5;
	private int x,y;
	private Dir dir = Dir.DOWN;
	private boolean isMoving = false;
	
	public boolean isMoving() {
		return isMoving;
	}
	public void setMoving(boolean isMoving) {
		this.isMoving = isMoving;
	}
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
		//x +=30;
		g.setColor(c);
		move();
		
	}
	
	
	public void move() {
		if(!isMoving) return;
		
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
//	public void setMoving(boolean b) {
//		
//		
//	}
	public void fire() {
		tf.b = new Bullet(x,y,this.dir);
		tf.b.move();
		
	}
}
