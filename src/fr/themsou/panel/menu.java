package fr.themsou.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import fr.themsou.main.main;

@SuppressWarnings("serial")
public class menu extends JPanel{
	
	public void TraceMenu(Graphics g){
		
//////////////////////////////////////////////////////////////////
//////////////////////PEINCEAU////////////////////////////////////
//////////////////////////////////////////////////////////////////
		
		int Mh = main.Mh;
		
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, 100, 5000);
		
		
		if(main.drawMode == 0){
			
			g.setColor(main.color);
			g.fillRect(60, Mh - 80, 30, 65);
			
			g.setColor(Color.BLACK);
			g.drawRect(60, Mh - 80, 30, 65);
			
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(0, Mh - 5, 100, 5);
			
			g.setColor(Color.WHITE);
			g.fillRect(10, Mh + 10, 20, 20);
			g.setColor(Color.BLACK);
			g.fillRect(40, Mh + 10, 20, 20);
			g.setColor(Color.MAGENTA);
			g.fillRect(70, Mh + 10, 20, 20);
			
			g.setColor(Color.BLUE);
			g.fillRect(10, Mh + 40, 20, 20);
			g.setColor(Color.CYAN);
			g.fillRect(40, Mh + 40, 20, 20);
			g.setColor(Color.GREEN);
			g.fillRect(70, Mh + 40, 20, 20);
			
			g.setColor(Color.RED);
			g.fillRect(10, Mh + 70, 20, 20);
			g.setColor(Color.ORANGE);
			g.fillRect(40, Mh + 70, 20, 20);
			g.setColor(Color.PINK);
			g.fillRect(70, Mh + 70, 20, 20);
			
			g.setColor(Color.GRAY);
			g.fillRect(10, Mh + 100, 20, 20);
			g.setColor(Color.WHITE);
			g.drawRect(10, Mh + 100, 20, 20);
			g.setColor(Color.DARK_GRAY);
			g.fillRect(40, Mh + 100, 20, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(70, Mh + 100, 20, 20);
			
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(0, Mh + 130, 100, 5);
			
			g.setColor(Color.WHITE);
			g.fillRect(5, Mh + 145, 30, 30);
			g.fillRect(40, Mh + 150, 20, 20);
			g.fillRect(75, Mh + 155, 10, 10);
			
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(0, Mh + 185, 100, 5);
			
			g.setColor(Color.WHITE);
			g.fillRect(10, Mh + 195, 20, 20);
			g.fillOval(40, Mh + 195, 20, 20);
			
			g.drawRect(10, Mh + 225, 20, 20);
			g.drawOval(40, Mh + 225, 20, 20);
			g.fillRect(80, Mh + 195, 3, 50);
			
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(0, Mh + 255, 100, 5);
			
			g.setColor(Color.LIGHT_GRAY);
			g.fillRoundRect(25, -10, 75, 35, 15, 15);
			g.fillRect(50, -10, 50, 35);
			
			
		}
//////////////////////////////////////////////////////////////////
//////////////////////SAVE////////////////////////////////////////
//////////////////////////////////////////////////////////////////
		else if(main.drawMode == 1){
			
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(0, Mh + -55, 100, 5);
			
			g.setColor(Color.LIGHT_GRAY);
			g.fillRoundRect(50, -10, 50, 35, 15, 15);
			g.fillRect(75, -10, 25, 35);
			g.fillRoundRect(0, -10, 25, 35, 15, 15);
			g.fillRect(0, -10, 13, 35);
		}
//////////////////////////////////////////////////////////////////
//////////////////////TEXTE///////////////////////////////////////
//////////////////////////////////////////////////////////////////
		else if(main.drawMode == 2){
			
			g.setColor(main.color);
			g.fillRect(60, Mh - 80, 30, 65);
			
			g.setColor(Color.BLACK);
			g.drawRect(60, Mh - 80, 30, 65);
			
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(0, Mh - 5, 100, 5);
			
			g.setColor(Color.WHITE);
			g.fillRect(10, Mh + 10, 20, 20);
			g.setColor(Color.BLACK);
			g.fillRect(40, Mh + 10, 20, 20);
			g.setColor(Color.MAGENTA);
			g.fillRect(70, Mh + 10, 20, 20);
			
			g.setColor(Color.BLUE);
			g.fillRect(10, Mh + 40, 20, 20);
			g.setColor(Color.CYAN);
			g.fillRect(40, Mh + 40, 20, 20);
			g.setColor(Color.GREEN);
			g.fillRect(70, Mh + 40, 20, 20);
			
			g.setColor(Color.RED);
			g.fillRect(10, Mh + 70, 20, 20);
			g.setColor(Color.ORANGE);
			g.fillRect(40, Mh + 70, 20, 20);
			g.setColor(Color.PINK);
			g.fillRect(70, Mh + 70, 20, 20);
			
			g.setColor(Color.GRAY);
			g.fillRect(10, Mh + 100, 20, 20);
			g.setColor(Color.WHITE);
			g.drawRect(10, Mh + 100, 20, 20);
			g.setColor(Color.DARK_GRAY);
			g.fillRect(40, Mh + 100, 20, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(70, Mh + 100, 20, 20);
			
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(0, Mh + 130, 100, 5);
			
			g.setColor(Color.WHITE);
			g.setFont(new Font("TimesRoman", 1, 30));
			g.drawString("A", 8, Mh + 171);
			g.setFont(new Font("TimesRoman", 1, 20));
			g.drawString("A", 43, Mh + 168);
			g.setFont(new Font("TimesRoman", main.font.getStyle(), 10));
			g.drawString("A", 77, Mh + 164);
			
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(0, Mh + 185, 100, 5);
			
			g.setColor(Color.black);
			g.setFont(new Font("TimesRoman", 1, 20));
			g.drawString("B", 12, Mh + 215);
			g.setFont(new Font("TimesRoman", 2, 20));
			g.drawString("I", 46, Mh + 215);
			
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(0, Mh + 225, 100, 5);
			
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(0, Mh + 290, 100, 5);
			
			g.setColor(Color.LIGHT_GRAY);
			g.fillRoundRect(75, -10, 25, 35, 15, 15);
			g.fillRect(82, -10, 18, 35);
			
			g.fillRoundRect(0, -10, 50, 35, 15, 15);
			g.fillRect(0, -10, 25, 35);
		}
//////////////////////////////////////////////////////////////////
//////////////////////RECTANGLE///////////////////////////////////
//////////////////////////////////////////////////////////////////
		else if(main.drawMode == 3){
			
			g.setColor(main.color);
			g.fillRect(60, Mh - 80, 30, 65);
			
			g.setColor(Color.BLACK);
			g.drawRect(60, Mh - 80, 30, 65);
			
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(0, Mh - 5, 100, 5);
			
			g.setColor(Color.WHITE);
			g.fillRect(10, Mh + 10, 20, 20);
			g.setColor(Color.BLACK);
			g.fillRect(40, Mh + 10, 20, 20);
			g.setColor(Color.MAGENTA);
			g.fillRect(70, Mh + 10, 20, 20);
			
			g.setColor(Color.BLUE);
			g.fillRect(10, Mh + 40, 20, 20);
			g.setColor(Color.CYAN);
			g.fillRect(40, Mh + 40, 20, 20);
			g.setColor(Color.GREEN);
			g.fillRect(70, Mh + 40, 20, 20);
			
			g.setColor(Color.RED);
			g.fillRect(10, Mh + 70, 20, 20);
			g.setColor(Color.ORANGE);
			g.fillRect(40, Mh + 70, 20, 20);
			g.setColor(Color.PINK);
			g.fillRect(70, Mh + 70, 20, 20);
			
			g.setColor(Color.GRAY);
			g.fillRect(10, Mh + 100, 20, 20);
			g.setColor(Color.WHITE);
			g.drawRect(10, Mh + 100, 20, 20);
			g.setColor(Color.DARK_GRAY);
			g.fillRect(40, Mh + 100, 20, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(70, Mh + 100, 20, 20);
			
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(0, Mh + 130, 100, 5);
			
			g.setColor(Color.WHITE);
			g.fillRect(10, Mh + 145, 20, 20);
			g.fillOval(40, Mh + 145, 20, 20);
			
			g.drawRect(10, Mh + 175, 20, 20);
			g.drawOval(40, Mh + 175, 20, 20);
			
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(0, Mh + 205, 100, 5);
			
			g.setColor(Color.LIGHT_GRAY);
			g.fillRoundRect(0, -10, 75, 35, 15, 15);
			g.fillRect(0, -10, 25, 35);
			
		}
		
		g.drawImage(new ImageIcon(getClass().getResource("/images/pinceau.png")).getImage(), 3, 2, null);
		
		g.drawImage(new ImageIcon(getClass().getResource("/images/image.png")).getImage(), 28, 2, null);
		
		g.drawImage(new ImageIcon(getClass().getResource("/images/texte.png")).getImage(), 53, 2, null);
		
		g.drawImage(new ImageIcon(getClass().getResource("/images/cube.png")).getImage(), 78, 2, null);
		
	}

}
