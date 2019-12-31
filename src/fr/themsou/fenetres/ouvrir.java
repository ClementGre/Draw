package fr.themsou.fenetres;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fr.themsou.devices.files;
import fr.themsou.main.main;

@SuppressWarnings("serial")
public class ouvrir extends JPanel{
	
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
	    
	    if(main.erreurOuvrir == true){
	    	g.setColor(Color.RED);
			g.setFont(new Font("Arial", 1, 25));
			g.drawString("Fichier introuvble", 145, 200);
			main.erreurOuvrir = false;
	    }
	    
	    JTextField nom = new JTextField();
		nom.setBounds(150, 90, 195, 20);
		nom.setText(main.nom);
	    add(nom);
	    
	    JButton ouvrir = new JButton("Ouvrir");
		ouvrir.setBounds(150, 140, 195, 20);
	    add(ouvrir);
	    
	    ouvrir.addActionListener(new ActionListener() {
			
			@SuppressWarnings("resource")
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
				File file = new File(chemin.getText() + nom.getText() + ".txt");
				
				try {
					
					BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
					
					
					String line = in.readLine();
					
					main.object.clear();
					
					
					
					while(line != null){
						
						main.object.add(line);
						
						line = in.readLine();
						
						
						
					}
					
					files.Jouv.dispose();
					
					
					main.fenetre.setTitle(nom.getText() + ".txt - Draw");
					
					main.nom = nom.getText();
					main.chemin = chemin.getText();
					
				} catch (IOException e1){
					System.out.println("erreur");
					
					main.erreurOuvrir = true;
					main.ouvrir.repaint();
					
				}
				
				
			}
		});
	    
	}
	
}
