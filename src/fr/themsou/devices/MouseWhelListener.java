package fr.themsou.devices;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import fr.themsou.main.main;

public class MouseWhelListener implements MouseWheelListener{

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		
		

		//main.Mh = main.Mh + e.getWheelRotation() * 10;
		
		
		main.zoom = main.zoom + e.getWheelRotation();
		
	}

}
