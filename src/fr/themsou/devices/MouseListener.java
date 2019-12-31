package fr.themsou.devices;

import fr.themsou.main.main;

public class MouseListener implements java.awt.event.MouseListener{

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		
		main.click.click();
		
	}@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		
	}@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		
	}@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		
		main.press = true;
		
		if(main.Mx > 100){
			if(main.drawMode == 0){
				if(main.mode == 5){
					if(main.line == false){
						main.xline = main.Mx;
						main.yline = main.My;
						main.line = true;
					}else{
						main.object.add(main.color.getRed() + "," + main.color.getGreen() + "," + main.color.getBlue() + "," + main.Mx + "," + main.My + "," + main.xline + "," + "5" + "," + main.yline );
						main.line = false;
					}
				}
			}else if(main.drawMode == 3){
				if(main.Cube == false){
					main.Cubex = main.Mx;
					main.Cubey = main.My;
					main.Cube = true;
				}else{
					
					int lx = main.Mx - main.Cubex;
					int ly = main.My - main.Cubey;
					
					if(main.mode == 1) main.object.add(main.color.getRed() + "," + main.color.getGreen() + "," + main.color.getBlue() + "," + main.Cubex + "," + main.Cubey + "," + lx + "," + "7" + "," + "1" + "," + ly);
					
					else if(main.mode == 2) main.object.add(main.color.getRed() + "," + main.color.getGreen() + "," + main.color.getBlue() + "," + main.Cubex + "," + main.Cubey + "," + lx + "," + "7" + "," + "2" + "," + ly);
					
					else if(main.mode == 3) main.object.add(main.color.getRed() + "," + main.color.getGreen() + "," + main.color.getBlue() + "," + main.Cubex + "," + main.Cubey + "," + lx + "," + "7" + "," + "3" + "," + ly);
					
					else if(main.mode == 4) main.object.add(main.color.getRed() + "," + main.color.getGreen() + "," + main.color.getBlue() + "," + main.Cubex + "," + main.Cubey + "," + lx + "," + "7" + "," + "4" + "," + ly);
					
					main.Cube = false;
				}
			}
		}
		
		
		
	}@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		
		main.press = false;
		
	}
}
