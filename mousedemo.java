package com.tssm.prac;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mousedemo extends Frame implements MouseListener{
	Label l;
	public mousedemo() {
		setLayout(new FlowLayout());
		addMouseListener(this);
		l=new Label();
		l.setBounds(20,50,200,200);	
		add(l);
		setSize(300,300);
		setVisible(true);
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		setVisible(true);
		l.setText("mouse clicked");	
		System.out.println("mouse is clicked");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		setVisible(true);
		l.setText("mouse entered");
		System.out.println("mouse is entered");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		setVisible(true);
		l.setText("mouse exited");
		System.out.println("mouse is exited");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		setVisible(true);
		l.setText("mouse pressed");
		System.out.println("mouse is pressed");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		setVisible(true);
		l.setText("mouse release");
		System.out.println("mouse is release");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		mousedemo frame=new mousedemo();
		frame.setVisible(true);	}
	
}