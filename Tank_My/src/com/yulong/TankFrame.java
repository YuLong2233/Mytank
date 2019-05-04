package com.yulong;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {
	
		int x=100,y=100;
		
		//重写TankFrame的构造方法，让TankFram类自己构造时生成窗口
		TankFrame(){
		Frame f = new Frame();
		this.setSize(500, 500);
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
		//重写Frame类里的paint方法，画出矩形图像
		@Override
		public void paint(Graphics g) {
			g.fillRect(x, y, 50, 40);
			x +=30;
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

