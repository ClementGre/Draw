package fr.themsou.devices;

import javax.swing.JFrame;
import fr.themsou.main.main;

public class files {
	
	public static JFrame Jsauv = new JFrame("Sauvegarder");
	public static JFrame Jouv = new JFrame("Ouvrir");
	public static JFrame Jimgouv = new JFrame("Ouvrir");
	
	public static void save(){
		
		
		
		Jsauv.setSize(500, 300);
		Jsauv.setResizable(true);
		Jsauv.setLocationRelativeTo(null);
		Jsauv.setVisible(true);
		Jsauv.setContentPane(main.sauvegarder);
		
		Jsauv.setLayout(null);
		
		main.sauvegarder.setLayout(null);
		
		main.sauvegarder.repaint();
		
		
		
		
		
	}public static void open(){
			
			
		Jouv.setSize(500, 300);
		Jouv.setResizable(true);
		Jouv.setLocationRelativeTo(null);
		Jouv.setVisible(true);
		Jouv.setContentPane(main.ouvrir);
		
		Jouv.setLayout(null);
		
		main.ouvrir.setLayout(null);
		
		main.ouvrir.repaint();
		
		
	}public static void openPicture(){
		
		
	Jimgouv.setSize(500, 300);
	Jimgouv.setResizable(true);
	Jimgouv.setLocationRelativeTo(null);
	Jimgouv.setVisible(true);
	Jimgouv.setContentPane(main.imgouvrir);
	
	Jimgouv.setLayout(null);
	
	main.imgouvrir.setLayout(null);
	
	main.imgouvrir.repaint();
	
	
}
}
