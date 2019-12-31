package fr.themsou.devices;

import java.awt.Color;
import javax.swing.JPanel;
import fr.themsou.main.main;
import fr.themsou.panel.panel;

@SuppressWarnings("serial")
public class click extends JPanel{

	public void click(){
		
	
		int Mx = main.Mx;
		int My = main.My;
		int Mh = main.Mh;
		
			
		if(My <= 25 && My >= 0){
			
			if(Mx >= 0 && Mx <= 25){
				main.mode = 1;
				main.drawMode = 0;
				main.panel.removeAll();
				Saisie.paintDebut();
				boutons.paintboutons();
				menuBar.paintmenu();
				menuBar.paintslider();
			}else if(Mx >= 25 && Mx <= 50){
				main.mode = -1;
				main.drawMode = 1;
				main.panel.removeAll();
				Saisie.paintDebut();
				boutons.paintboutons();
				menuBar.paintmenu();
				menuBar.paintslider();
			}else if(Mx >= 50 && Mx <= 75){
				main.mode = -1;
				main.drawMode = 2;
				main.panel.removeAll();
				Saisie.paintDebut();
				boutons.paintboutons();
				menuBar.paintmenu();
				menuBar.paintslider();
			}else if(Mx >= 75 && Mx <= 100){
				main.mode = 1;
				main.drawMode = 3;
				main.panel.removeAll();
				Saisie.paintDebut();
				boutons.paintboutons();
				menuBar.paintmenu();
				menuBar.paintslider();
			}
			
		}
////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////// ALL ////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
		if(main.drawMode == 0 || main.drawMode == 2 || main.drawMode == 3){
			if(Mx >= 10 && Mx <= 30){
				
				if(My >= 10 + Mh && My <= 30 + Mh){main.color = Color.WHITE;main.text.setText(main.color.getRed() + ""); main.text2.setText(main.color.getGreen() + ""); main.text3.setText(main.color.getBlue() + "");}
					
				else if(My >= 40 + Mh && My <= 60 + Mh){main.color = Color.BLUE;main.text.setText(main.color.getRed() + ""); main.text2.setText(main.color.getGreen() + ""); main.text3.setText(main.color.getBlue() + "");}
					
				else if(My >= 70 + Mh && My <= 90 + Mh){main.color = Color.RED;main.text.setText(main.color.getRed() + ""); main.text2.setText(main.color.getGreen() + ""); main.text3.setText(main.color.getBlue() + "");}
					
				else if(My >= 100 + Mh && My <= 120 + Mh){main.color = Color.GRAY;main.text.setText(main.color.getRed() + ""); main.text2.setText(main.color.getGreen() + ""); main.text3.setText(main.color.getBlue() + "");}
			}else if(Mx >= 40 && Mx <= 60){
				
				if(My >= 10 + Mh && My <= 30 + Mh){main.color = Color.BLACK;main.text.setText(main.color.getRed() + ""); main.text2.setText(main.color.getGreen() + ""); main.text3.setText(main.color.getBlue() + "");}
					
				else if(My >= 40 + Mh && My <= 60 + Mh){main.color = Color.CYAN;main.text.setText(main.color.getRed() + ""); main.text2.setText(main.color.getGreen() + ""); main.text3.setText(main.color.getBlue() + "");}
					
				else if(My >= 70 + Mh && My <= 90 + Mh){main.color = Color.YELLOW;main.text.setText(main.color.getRed() + ""); main.text2.setText(main.color.getGreen() + ""); main.text3.setText(main.color.getBlue() + "");}
					
				else if(My >= 100 + Mh && My <= 120 + Mh){main.color = Color.DARK_GRAY;main.text.setText(main.color.getRed() + ""); main.text2.setText(main.color.getGreen() + ""); main.text3.setText(main.color.getBlue() + "");}
				
				
			}else if(Mx >= 70 && Mx <= 90){
				
				if(My >= 10 + Mh && My <= 30 + Mh){main.color = Color.MAGENTA;main.text.setText(main.color.getRed() + ""); main.text2.setText(main.color.getGreen() + ""); main.text3.setText(main.color.getBlue() + "");}
					
				else if(My >= 40 + Mh && My <= 60 + Mh){main.color = Color.GREEN;main.text.setText(main.color.getRed() + ""); main.text2.setText(main.color.getGreen() + ""); main.text3.setText(main.color.getBlue() + "");}
					
				else if(My >= 70 + Mh && My <= 90 + Mh){main.color = Color.PINK;main.text.setText(main.color.getRed() + ""); main.text2.setText(main.color.getGreen() + ""); main.text3.setText(main.color.getBlue() + "");}
				
				else if(My >= 100 + Mh && My <= 120 + Mh){main.color = Color.LIGHT_GRAY;main.text.setText(main.color.getRed() + ""); main.text2.setText(main.color.getGreen() + ""); main.text3.setText(main.color.getBlue() + "");}
				
			}
			
		}
////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////// PEINCEAU ////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
		if(main.drawMode == 0){
			if(Mx >= 10 && Mx <= 30){
				
				if(My >= 145 + Mh && My <= 175 + Mh) main.size = 30;
				
				else if(My >= 195 + Mh && My <= 215 + Mh)main.mode = 1;
					
				else if(My >= 225 + Mh && My <= 245 + Mh)main.mode = 2;
				
			}else if(Mx >= 40 && Mx <= 60){
				
				if(My >= 145 + Mh && My <= 175 + Mh)main.size = 20;
					
				else if(My >= 195 + Mh && My <= 215 + Mh)main.mode = 3;
				
				else if(My >= 225 + Mh && My <= 245 + Mh)main.mode = 4;
				
			}else if(Mx >= 70 && Mx <= 90){
				
				if(My >= 145 + Mh && My <= 175 + Mh)main.size = 10;
				
				else if(My >= 195 + Mh && My <= 245 + Mh)main.mode = 5;
				
			}
		}
////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////// TEXTE ///////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
		else if(main.drawMode == 2){
			if(Mx >= 10 && Mx <= 30){
				
				if(My >= 145 + Mh && My <= 175 + Mh) main.fontSize = 30;
				
				else if(My >= 200 + Mh && My <= 220 + Mh)if(main.bold == true){main.bold = false;} else{main.bold = true;}
				
			}else if(Mx >= 40 && Mx <= 60){
				
				if(My >= 145 + Mh && My <= 175 + Mh)main.fontSize = 20;
				
				else if(My >= 195 + Mh && My <= 215 + Mh)if(main.italic == true){main.italic = false;} else{main.italic = true;}
				
				
			}else if(Mx >= 70 && Mx <= 90){
				
				if(My >= 145 + Mh && My <= 175 + Mh) main.fontSize = 10;
				
				
			}
		}
////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////// CUBE ////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
		else if(main.drawMode == 3){
			if(Mx >= 10 && Mx <= 30){
				
				if(My >= 145 + Mh && My <= 165 + Mh)main.mode = 1;
				
				else if(My >= 175 + Mh && My <= 195 + Mh)main.mode = 2;
				
			}else if(Mx >= 40 && Mx <= 60){
				
				if(My >= 145 + Mh && My <= 165 + Mh)main.mode = 3;
				
				else if(My >= 175 + Mh && My <= 195 + Mh)main.mode = 4;
				
			}else if(Mx >= 70 && Mx <= 90){
			
			}
		}
		panel.setupPolice();
	}
}
