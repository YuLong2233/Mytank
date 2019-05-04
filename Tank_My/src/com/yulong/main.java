package com.yulong;

public class main {

	public static void main(String[] args) throws InterruptedException {
		//在主方法里new一个TankFrame;
		TankFrame tankframe = new TankFrame();
		
		//增加一个无限循环，调用repaint方法，达到不停重画窗口的效果
		while(true) {
			Thread.sleep(50);
			tankframe.repaint();
		}

	}

}
