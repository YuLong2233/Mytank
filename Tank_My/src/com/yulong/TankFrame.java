package com.yulong;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {
		
		//重写TankFrame的构造方法，让TankFram类自己构造时生成窗口
		TankFrame(){
		Frame f = new Frame();
		this.setSize(500, 500);
		this.setResizable(false);
		this.setTitle("Tank War");
		this.setVisible(true);
		
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
			g.fillRect(100, 100, 50, 40);
		}
}	
