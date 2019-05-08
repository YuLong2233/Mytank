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
		Tank tank = new Tank(x,y,Dir.DOWN,this);
		
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
		//双缓冲功能，解决闪烁问题
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
		
		//重写Frame类里的paint方法
		@Override
		public void paint(Graphics g) {
			
			tank.paint(g);
			
			
		}
	
		
		class MykeyAdapter extends KeyAdapter{
			boolean bL = false;
			boolean bU = false;
			boolean bR = false;
			boolean bD = false;
			
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				switch(code) {
				case KeyEvent.VK_UP:
					bU = true;
					break;
				case KeyEvent.VK_DOWN:
					bD = true;
					break;
				case KeyEvent.VK_LEFT:
					bL = true;
					break;
				case KeyEvent.VK_RIGHT:
					bR = true;
					break;
				
				default:
					break;
				}
				setMainTankDir();
			}
			
			private void setMainTankDir() {
//				if (!bL && !bU && !bR && !bD)
//					tank.setMoving(false);
//				else {
//					tank.setMoving(true);

					if (bL)
						tank.setDir(Dir.LEFT);
					if (bU)
						tank.setDir(Dir.UP);
					if (bR)
						tank.setDir(Dir.RIGHT);
					if (bD)
						tank.setDir(Dir.DOWN);
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				int code = e.getKeyCode();
				switch(code) {
				case KeyEvent.VK_UP:
					bU = false;
					break;
				case KeyEvent.VK_DOWN:
					bD = false;
					break;
				case KeyEvent.VK_LEFT:
					bL = false;
					break;
				case KeyEvent.VK_RIGHT:
					bR = false;
					break;
				
				default:
					break;
				}
			}
			
		}
}	

