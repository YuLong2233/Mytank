package com.yulong;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(500, 500);
		f.setResizable(false);
		f.setTitle("Tank War");
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			} 
			
			
		});
	}
}	
