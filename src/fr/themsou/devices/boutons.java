package fr.themsou.devices;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import fr.themsou.main.main;

@SuppressWarnings("serial")
public class boutons  extends JFrame{

	public static void CtrlZ(){
		System.out.println("remove");
		if(main.object.size() >= 2){
			boolean isfinish = false;
			try{
				while(main.object.get(main.object.size() - 1).toString().equals(main.object.get(main.object.size() - 2).toString())){
					System.out.println("remove 1");
					main.object.remove(main.object.size() - 1);
					isfinish = true;
				}
			}catch(ArrayIndexOutOfBoundsException err){
				if(main.object.size() >= 1){
					System.out.println("remove 2");
					main.object.remove(main.object.size() - 1);
				}
			}
			
			if(isfinish == false){
				if(main.object.size() >= 1){
					System.out.println("remove 3");
					main.object.remove(main.object.size() - 1);
				}
			}
			
		}else{
			if(main.object.size() >= 1){
				System.out.println("remove 4");
				main.object.remove(main.object.size() - 1);
			}
		}
	}
	
	
	public static void setexecuteboutons(){
		
		
		
		main.bouton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				main.word = main.text4.getText();
				
				
			}});
		main.bouton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				files.openPicture();
				
				
			}});
		
	}
	
	
	public static void paintboutons(){
		
		
		main.panel.setLayout(null);
		
		
		int Mh = main.Mh;
		if(main.drawMode == 2){
			
			main.bouton.setBounds(10, Mh + 265, 80, 15);
			main.panel.add(main.bouton);
			
		}else if(main.drawMode == 1){
			main.bouton2.setBounds(10, Mh - 80, 80, 15);
			main.panel.add(main.bouton2);
			
			
			
			
		}
       
	}
	   
}





