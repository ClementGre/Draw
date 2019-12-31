package fr.themsou.main;

import fr.themsou.devices.menuBar;

public class Run {

	
	
	
	public static void run(){
		
		
		
		while(true){
			try {Thread.sleep(20);} catch (InterruptedException e) {e.printStackTrace();}
			
			
			
			main.panel.repaint();
			
			if(main.sx != (int) main.fenetre.getSize().getWidth() || main.sy != (int) main.fenetre.getSize().getHeight()){
				
				menuBar.paintmenu();
				menuBar.paintslider();
				main.sx = (int) main.fenetre.getSize().getWidth();
				main.sy = (int) main.fenetre.getSize().getHeight();
				
			}
			
			if(main.size != main.slider1.getValue() && main.drawMode == 0){
				main.slider1.setValue(main.size);
			}else if(main.fontSize != main.slider1.getValue() && main.drawMode == 2){
				main.slider1.setValue(main.fontSize);
				
			}
		
			
			
			
		}
	}
}
