package com.yulong;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {
	
		int x=100,y=100;
		static final int GAME_WIDTH=1060,GAME_HEIGHT=800;
		
		//重写TankFrame的构造方法，让TankFram类自己构造时生成窗口
		TankFrame(){
			Frame f = new Frame();
			this.setSize(GAME_WIDTH, GAME_HEIGHT);
			this.setResizable(false);
			this.setTitle("Tank War");
			this.setVisible(true);
			
		
		//添加一个键盘监听事件
		this.addKeyListener(new MykeyAdapter() {
			
		});
		
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			} 
			
			
		});
	}	
		
		Image offScreenImage = null;

		@Override
		public void update(Graphics g) {
			if (offScreenImage == null) {
				offScreenImage = this.createImage(GAME_WIDTH, GAME_HEIGHT);
			}
			Graphics gOffScreen = offScreenImage.getGraphics();
			Color c = gOffScreen.getColor();
			gOffScreen.setColor(Color.BLACK);
			gOffScreen.fillRect(0, 0, GAME_WIDTH, GAME_HEIGHT);
			gOffScreen.setColor(c);
			paint(gOffScreen);
			g.drawImage(offScreenImage, 0, 0, null);
		}
		//重写Frame类里的paint方法，画出矩形图像
		@Override
		public void paint(Graphics g) {
			Color c = g.getColor();
			g.setColor(Color.blue);
			g.fillRect(x, y, 50, 40);
			x +=30;
			g.setColor(c);
			
		}
	
		
		class MykeyAdapter extends KeyAdapter{
			
			@Override
			public void keyPressed(KeyEvent e) {
				x += 50;
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				super.keyReleased(e);
			}
			
		}
}	

