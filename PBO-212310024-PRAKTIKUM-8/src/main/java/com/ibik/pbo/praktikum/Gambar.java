package com.ibik.pbo.praktikum;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.MenuKeyListener;

public class Gambar extends JFrame implements KeyListener {
 
	JLabel label;
	ImageIcon icon;
		 
	Gambar(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.addKeyListener(this);
		
		//icon = new ImageIcon("D:\\Projek maven\\PBO-212310024-PRAKTIKUM-8\\gambar1");
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
		label.setIcon(icon);
		label.setBackground(Color.red);
		label.setOpaque(true);
		
		this.getContentPane().setBackground(Color.black);
		this.add(label);
		this.setVisible(true);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyChar()) {
			case 'a': label.setLocation(label.getX()-15,label.getY());
				break;
			case 'w': label.setLocation(label.getX(),label.getY()-15);
					break;
			case 's': label.setLocation(label.getX(),label.getY()+15);
			break;
			case 'd': label.setLocation(label.getX()+15,label.getY());
			break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("kamu memencet key : " + e.getKeyCode());
	}
}

