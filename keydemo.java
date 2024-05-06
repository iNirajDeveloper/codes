package com.tssm.prac;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keydemo extends Applet implements KeyListener {
	String msgString=" ";
	public void init() {
		addKeyListener(this);
		
	}
	public void paint(Graphics graphics)
	{
		super.paint(graphics);
		graphics.drawString("key status "+msgString,20,20);
	}
	@Override
	public void keyPressed(KeyEvent e) {
		msgString="key pressed :"+ KeyEvent.getKeyText(e.getKeyCode());
		System.out.println(msgString);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		msgString="key released:"+ KeyEvent.getKeyText(e.getKeyCode());
		System.out.println(msgString);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		msgString="key typed :"+ KeyEvent.getKeyText(e.getKeyCode());
		System.out.println(msgString);
		// TODO Auto-generated method stub
		
	}

}
