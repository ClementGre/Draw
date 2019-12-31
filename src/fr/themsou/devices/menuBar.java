package fr.themsou.devices;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import fr.themsou.main.main;
import fr.themsou.panel.panel;

@SuppressWarnings("serial")
public class menuBar extends JFrame{
	
	
	public static void setlistener(){
		
		main.slider1.addChangeListener(new ChangeListener(){

		      public void stateChanged(ChangeEvent event){
		    	  
		    	  if(main.drawMode == 0) main.size = ((JSlider) event.getSource()).getValue();
		    	  
		    	  else if(main.drawMode == 2){
		    		  main.fontSize = ((JSlider) event.getSource()).getValue();
		    		  panel.setupPolice();
		    	  }
		    	  
		      }

		    });
		main.slider2.addChangeListener(new ChangeListener(){

		      public void stateChanged(ChangeEvent event){
		    	  
		    		 main.imgsize = ((JSlider) event.getSource()).getValue();
		    		 
		    	  
		      }

		    });
		
		main.menuarg1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Sauvegarder");
				files.save();
			}
		});
		main.menuarg2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Ouvrir");
						files.open();
					}
				});
		main.menuarg3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Annuler l'action");
				boutons.CtrlZ();
			}
		});
		main.menuarg4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Réinitialiser");
				main.object = new ArrayList<>();
			}
		});
		
	}
	
	
	public static void paintmenu(){
		
		main.menubar.setBounds((int) main.fenetre.getSize().getWidth() - 243, 0, 235, 20);
		main.menubar.setAlignmentX(RIGHT_ALIGNMENT);
		main.menubar.setBackground(Color.GRAY);
		main.menubar.setForeground(Color.BLACK);
		main.panel.add(main.menubar);
		
		main.menubar.add(main.menu1);
		main.menubar.add(main.menu2);
		
        main.menu1.add(main.menuarg1);
        main.menu1.add(main.menuarg2);
        
        main.menu2.add(main.menuarg3);
        main.menu2.add(main.menuarg4);
        
        
       
		
	}
	
	public static void paintslider(){
		
		if(main.drawMode == 0 || main.drawMode == 2){
			main.slider1.setMinimum(0);
		    main.slider1.setMaximum(100);
		    main.slider1.setValue(main.size);
		    main.slider1.setBackground(Color.GRAY);
		    main.slider1.setForeground(Color.BLACK);
		    
		    main.slider1.setPaintTicks(true);
		    main.slider1.setPaintLabels(true);

		    main.slider1.setMinorTickSpacing(10);
		    main.slider1.setMajorTickSpacing(20);
		    
		    main.slider1.setBounds((int) main.fenetre.getSize().getWidth() -158, (int) main.fenetre.getSize().getHeight() -83, 150, 50);

		    main.panel.add(main.slider1);
		    
		}else if(main.drawMode == 1){
			
			main.slider2.setMinimum(1);
		    main.slider2.setMaximum(19);
		    main.slider2.setValue(main.imgsize);
		    main.slider2.setBackground(Color.GRAY);
		    main.slider2.setForeground(Color.BLACK);
		    
		    main.slider2.setPaintTicks(true);
		    main.slider2.setPaintLabels(true);

		    main.slider2.setMinorTickSpacing(1);
		    main.slider2.setMajorTickSpacing(9);
		    
		    main.slider2.setBounds((int) main.fenetre.getSize().getWidth() -158, (int) main.fenetre.getSize().getHeight() -83, 150, 50);

		    main.panel.add(main.slider2);
		}
		
	}

}
