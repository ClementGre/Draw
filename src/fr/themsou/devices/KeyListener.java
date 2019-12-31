package fr.themsou.devices;

import java.awt.event.KeyEvent;

import fr.themsou.main.main;

public class KeyListener implements java.awt.event.KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
		if(e.getKeyCode() == 90){
			main.ctrl = true;
			System.out.println("ctrl = true");
		}
		if(e.getKeyCode() == 17){
			if(main.ctrl == true){
				boutons.CtrlZ();
			}
		}
		
	}@Override
	public void keyReleased(KeyEvent e) {
		System.out.println(e.getKeyCode());
		if(e.getKeyCode() == 90){
			main.ctrl = false;
			System.out.println("ctrl = false");
		}
		
	}@Override
	public void keyTyped(KeyEvent e) {
		System.out.println(e.getKeyCode());
	}
}
