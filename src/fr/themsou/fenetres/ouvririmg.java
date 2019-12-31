package fr.themsou.fenetres;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fr.themsou.devices.files;
import fr.themsou.main.main;

@SuppressWarnings("serial")
public class ouvririmg extends JPanel{
	
	public void paintComponent(Graphics g){
		
		
	
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 300);
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("Arial", 1, 17));
		g.drawString("Chemin de l'image :", 170, 20);
		
		JTextField chemin = new JTextField();
		chemin.setBounds(150, 30, 195, 20);
		chemin.setText(main.imgchemin);
	    add(chemin);
	    
	    g.drawString("Nom :", 225, 80);
	    
	    if(main.erreurimgOuvrir == true){
	    	g.setColor(Color.RED);
			g.setFont(new Font("Arial", 1, 25));
			g.drawString("Image introuvble", 150, 200);
			main.erreurimgOuvrir = false;
	    }
	    
	    JTextField nom = new JTextField();
		nom.setBounds(150, 90, 195, 20);
		nom.setText(main.imgnom);
	    add(nom);
	    
	    JButton ouvrir = new JButton("Ouvrir");
		ouvrir.setBounds(150, 140, 195, 20);
	    add(ouvrir);
	    
	    ouvrir.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				
				File file = new File(chemin.getText() + nom.getText());
				
				
				if(file.isFile()){
					
					main.img = new ImageIcon(chemin.getText() + nom.getText()).getImage();
					
					files.Jimgouv.dispose();
					
					main.imgnom = nom.getText();
					main.imgchemin = chemin.getText();
				}else{
					System.out.println("erreur");
					
					main.erreurimgOuvrir = true;
					main.imgouvrir.repaint();
				}
				
			}
		});
	    
	}
	
}
