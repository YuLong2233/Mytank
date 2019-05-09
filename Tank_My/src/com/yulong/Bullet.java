package com.yulong;

import java.awt.Color;
import java.awt.Graphics;

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

	public void move() {
		switch(dir) {
		case UP:
			y -= bulletSpeed;
			break;
		case DOWN:
			y += bulletSpeed;
			break;
		case LEFT:
			x -= bulletSpeed;
			break;
		case RIGHT:
			x += bulletSpeed;
			break;
		default:
			break;
		}	
		
	}

	public void paint(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.yellow);
		g.fillRect(x, y, 50, 40);
		move();
		//x +=30;
		g.setColor(c);
		
	}
	
	
	
}
