package fr.themsou.devices;


import javax.swing.JFrame;

import fr.themsou.main.main;
@SuppressWarnings("serial")

public class Saisie extends JFrame{
	
	
	public static void paintDebut(){
		

		
		
		main.panel.setLayout(null);
		

		int Mh = main.Mh;
	    
		if(main.drawMode == 0 || main.drawMode == 2 || main.drawMode == 3){
			
			main.panel.remove(main.text4);
			
			main.text.setColumns(3);
			main.text2.setColumns(3);
			main.text3.setColumns(3);
			
		    main.text.setBounds(10, Mh - 80, 40, 15);
		    main.text2.setBounds(10, Mh - 55, 40, 15);
		    main.text3.setBounds(10, Mh - 30, 40, 15);
		    
		    main.panel.add(main.text);
			main.panel.add(main.text2);
			main.panel.add(main.text3);
			
		}if(main.drawMode == 2){
			
			
			
			main.text4.setColumns(10);
			main.text4.setBounds(10, Mh + 240, 80, 15);
			main.panel.add(main.text4);
			
			
		}
	}
}
