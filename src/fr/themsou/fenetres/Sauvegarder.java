package fr.themsou.fenetres;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fr.themsou.devices.files;
import fr.themsou.main.main;

@SuppressWarnings("serial")
public class Sauvegarder extends JPanel{
	
	public static void close(){
		
		files.Jsauv.dispose();
	}
	
	public void paintComponent(Graphics g){
		
		
	
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 300);
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("Arial", 1, 17));
		g.drawString("Chemin du fichier :", 175, 20);
		
		
		
		JTextField chemin = new JTextField();
		chemin.setBounds(150, 30, 195, 20);
		chemin.setText(main.chemin);
	    add(chemin);
	    
	    g.drawString("Nom :", 225, 80);
	    
	    JTextField nom = new JTextField();
		nom.setBounds(150, 90, 195, 20);
		nom.setText(main.nom);
	    add(nom);
	    
	    
	    JButton sauvegarder = new JButton("Sauvegarder");
		sauvegarder.setBounds(150, 140, 195, 20);
	    add(sauvegarder);
	    
	    if(main.erreurSauvegarder == true){
	    	g.setColor(Color.RED);
			g.setFont(new Font("Arial", 1, 25));
			g.drawString("Dossier introuvble", 145, 200);
			main.erreurSauvegarder = false;
	    }
	    
	    sauvegarder.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				File file = new File(chemin.getText() + nom.getText() + ".txt");
				
				if(!file.exists()) {
					try {
						file.createNewFile();
					}catch (IOException e1){
						System.out.println("erreur");
						
						main.erreurSauvegarder = true;
						main.sauvegarder.repaint();
					}
				}
				
				try {
					FileWriter writer = new FileWriter(file);
					BufferedWriter out = new BufferedWriter(writer);
					
					int i = 0;
					
					while(i != main.object.size()){
						
						out.write(main.object.get(i));
						out.newLine();
						
						i++;
					}
					
					
					
					out.close();
					
					
					//
					
					close();
					
					main.fenetre.setTitle(nom.getText() + ".txt - Draw");
					
					main.nom = nom.getText();
					main.chemin = chemin.getText();
					
				} catch (IOException e1){
					System.out.println("erreur");
					
					main.erreurSauvegarder = true;
					main.sauvegarder.repaint();
				}
				
				
				
				
			}
		});
	}
}
