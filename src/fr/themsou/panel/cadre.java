package fr.themsou.panel;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import fr.themsou.main.main;

@SuppressWarnings("serial")
public class cadre extends JPanel{

	public void TraceCadre(Graphics g){
		
		
		int Mh = main.Mh;
////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////// TOUS ////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
		if(main.drawMode == 0 || main.drawMode == 2 || main.drawMode == 3){
			g.setColor(Color.BLACK);
			
			if(main.color == Color.WHITE) g.drawRect(10, Mh + 10, 20, 20);
				
			else if(main.color == Color.BLACK){ g.setColor(Color.WHITE); g.drawRect(40, Mh + 10, 20, 20); }
				
			else if(main.color == Color.MAGENTA) g.drawRect(70, Mh + 10, 20, 20);
				
			else if(main.color == Color.BLUE) g.drawRect(10, Mh + 40, 20, 20);
				
			else if(main.color == Color.CYAN) g.drawRect(40, Mh + 40, 20, 20);
				
			else if(main.color == Color.GREEN) g.drawRect(70, Mh + 40, 20, 20);
				
			else if(main.color == Color.RED) g.drawRect(10, Mh + 70, 20, 20);
				
			else if(main.color == Color.YELLOW) g.drawRect(40, Mh + 70, 20, 20);
				
			else if(main.color == Color.PINK) g.drawRect(70, Mh + 70, 20, 20);
				
			else if(main.color == Color.GRAY) g.drawRect(10, Mh + 100, 20, 20);
			
			else if(main.color == Color.DARK_GRAY) g.drawRect(40, Mh + 100, 20, 20);
			
			else if(main.color == Color.LIGHT_GRAY) g.drawRect(70, Mh + 100, 20, 20);
		}
////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////// PEINCEAU ////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
		if(main.drawMode == 0){
			g.setColor(Color.BLACK);
			
			if(main.mode == 1) g.drawRect(10, Mh + 195, 20, 20);
				
			if(main.mode == 2) g.drawRect(10, Mh + 225, 20, 20);
				
			if(main.mode == 3) g.drawOval(40, Mh + 195, 20, 20);
					
			if(main.mode == 4) g.drawOval(40, Mh + 225, 20, 20);
							
			if(main.mode == 5) g.drawRect(80, Mh + 195, 3, 50);
			
			g.setColor(Color.BLACK);
			
			if(main.size == 30) g.drawRect(5, Mh + 145, 30, 30);
			
			else if(main.size == 20) g.drawRect(40, Mh + 150, 20, 20);
			
			else if (main.size == 10) g.drawRect(75, Mh + 155, 10, 10);
		}
////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////// TEXTE ///////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
		if(main.drawMode == 2){
			g.setColor(Color.black);
			
			if(main.fontSize == 30) g.drawRect(5, Mh + 145, 30, 30);
			
			if(main.fontSize == 20) g.drawRect(40, Mh + 150, 20, 20);
			
			if(main.fontSize == 10) g.drawRect(75, Mh + 155, 10, 10);
			
			if(main.bold == true) g.drawRect(10, Mh + 197, 20, 20);
			
			if(main.italic == true) g.drawRect(40, Mh + 197, 20, 20);
		}
	
////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////TEXTE ///////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
		if(main.drawMode == 3){
			g.setColor(Color.BLACK);
			
			if(main.mode == 1) g.drawRect(10, Mh + 145, 20, 20);
			
			else if(main.mode == 2) g.drawRect(10, Mh + 175, 20, 20);
			
			else if(main.mode == 3) g.drawOval(40, Mh + 145, 20, 20);
			
			else if(main.mode == 4) g.drawOval(40, Mh + 175, 20, 20);
		}
	}
}

