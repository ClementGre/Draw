package fr.themsou.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MouseInfo;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import fr.themsou.main.main;

@SuppressWarnings("serial")
public class panel extends JPanel{

	
	
	public void paintComponent(Graphics g){
		
		Graphics2D g2d = (Graphics2D)g;
		//System.out.println(main.ctrl);
		
		main.Mx = MouseInfo.getPointerInfo().getLocation().x-getLocationOnScreen().x;
		main.My = MouseInfo.getPointerInfo().getLocation().y-getLocationOnScreen().y;
////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////// SET COLOR ///////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
		int r = main.color.getRed();
		int gr = main.color.getGreen();
		int b = main.color.getBlue();
		
		if(!main.text.getText().isEmpty()) r = Integer.parseInt(main.text.getText());
			
		if(!main.text2.getText().isEmpty()) gr = Integer.parseInt(main.text2.getText());
		
		if(!main.text3.getText().isEmpty()) b = Integer.parseInt(main.text3.getText());
		
		if(b != main.color.getBlue() || gr != main.color.getGreen() || r != main.color.getRed()){
			main.color = new Color(r, gr, b);
		}
////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////// SAVE OBJET //////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
		if(main.press == true){
			
			g.setColor(main.color);
			if(main.Mx > 100){
				
				if(main.drawMode == 0){
					
					if(main.mode == 1) main.object.add(main.color.getRed() + "," + main.color.getGreen() + "," + main.color.getBlue() + "," + main.Mx + "," + main.My + "," + main.size + "," + "1");
					
					else if(main.mode == 2) main.object.add(main.color.getRed() + "," + main.color.getGreen() + "," + main.color.getBlue() + "," + main.Mx + "," + main.My + "," + main.size + "," + "2");
					
					else if(main.mode == 3) main.object.add(main.color.getRed() + "," + main.color.getGreen() + "," + main.color.getBlue() + "," + main.Mx + "," + main.My + "," + main.size + "," + "3");
						
					else if(main.mode == 4) main.object.add(main.color.getRed() + "," + main.color.getGreen() + "," + main.color.getBlue() + "," + main.Mx + "," + main.My + "," + main.size + "," + "4");
					
				}else if(main.drawMode == 2){
					if(!main.word.isEmpty()){
						main.object.add(main.color.getRed() + "," + main.color.getGreen() + "," + main.color.getBlue() + "," + main.Mx + "," + main.My + "," + main.word + "," + "6" + "," + main.font.getSize() + "," + main.font.getStyle() + "," + main.font.getName());		
					}
					
				}else if(main.drawMode == 1){
					if(main.img != null){
						double size = 1;
						if(main.imgsize < 10) size = Double.parseDouble("0." + main.imgsize);
						if(main.imgsize > 10) size = main.imgsize - 9;
						
						main.object.add(main.imgchemin + main.imgnom + "," + (int) (main.img.getWidth(null) * size) + "," + (int) (main.img.getHeight(null) * size) + "," + main.Mx + ","+main.My+",8,8");

					}
				}
					
				
				
									
				
			}
		}
		
////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////// DRAW OBJECT /////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
		g.setColor(Color.WHITE);
		g.fillRect(100, 0, 8000, 5000);
		
		int i = 1;
		
		while(main.object.size() >= i){
			
			i++;
			
			String[] object = main.object.get(i - 2).split(",");
			if(Integer.parseInt(object[6]) != 8){
				g.setColor(new Color(Integer.parseInt(object[0]), Integer.parseInt(object[1]), Integer.parseInt(object[2])));
			}
			
			
			
			if(Integer.parseInt(object[6]) == 1) g.fillRect(Integer.parseInt(object[3]) - Integer.parseInt(object[5])/2, Integer.parseInt(object[4]) - Integer.parseInt(object[5])/2, Integer.parseInt(object[5]), Integer.parseInt(object[5]));
			
			else if(Integer.parseInt(object[6]) == 2) g.drawRect(Integer.parseInt(object[3]) - Integer.parseInt(object[5])/2, Integer.parseInt(object[4]) - Integer.parseInt(object[5])/2, Integer.parseInt(object[5]), Integer.parseInt(object[5]));
			
			else if(Integer.parseInt(object[6]) == 3) g.fillOval(Integer.parseInt(object[3]) - Integer.parseInt(object[5])/2, Integer.parseInt(object[4]) - Integer.parseInt(object[5])/2, Integer.parseInt(object[5]), Integer.parseInt(object[5]));
			
			else if(Integer.parseInt(object[6]) == 4) g.drawOval(Integer.parseInt(object[3]) - Integer.parseInt(object[5])/2, Integer.parseInt(object[4]) - Integer.parseInt(object[5])/2, Integer.parseInt(object[5]), Integer.parseInt(object[5]));
		
			else if(Integer.parseInt(object[6]) == 5) g.drawLine(Integer.parseInt(object[3]), Integer.parseInt(object[4]), Integer.parseInt(object[5]), Integer.parseInt(object[7]));
				
			else if(Integer.parseInt(object[6]) == 6){
				g.setFont(new Font(object[9], Integer.parseInt(object[8]), Integer.parseInt(object[7])));
				
				g.drawString(object[5], Integer.parseInt(object[3]), Integer.parseInt(object[4]));;
			}else if(Integer.parseInt(object[6]) == 7){
				//main.Cubex + main.Cubey + lx + "7" + "1" + ly
				if(Integer.parseInt(object[7]) == 1) g.fillRect(Integer.parseInt(object[3]), Integer.parseInt(object[4]), Integer.parseInt(object[5]), Integer.parseInt(object[8]));
					
				else if(Integer.parseInt(object[7]) == 2) g.drawRect(Integer.parseInt(object[3]), Integer.parseInt(object[4]), Integer.parseInt(object[5]), Integer.parseInt(object[8]));
						
				else if(Integer.parseInt(object[7]) == 3) g.fillOval(Integer.parseInt(object[3]), Integer.parseInt(object[4]), Integer.parseInt(object[5]), Integer.parseInt(object[8]));
							
				else if(Integer.parseInt(object[7]) == 4) g.drawOval(Integer.parseInt(object[3]), Integer.parseInt(object[4]), Integer.parseInt(object[5]), Integer.parseInt(object[8]));
			
			}else if(Integer.parseInt(object[6]) == 8){
				Image img = new ImageIcon(object[0]).getImage();
				if(img != null) g2d.drawImage(img, Integer.parseInt(object[3]), Integer.parseInt(object[4]), Integer.parseInt(object[1]), Integer.parseInt(object[2]), null);
			}
				
				
		}
		
////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////// PRÉ VISUALISATION ///////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
		if(main.Mx > 100){
			g.setColor(main.color);
			
			if(main.drawMode == 0){
				
				if(main.mode == 1) g.fillRect(main.Mx - main.size/2, main.My - main.size/2, main.size, main.size);
				
				else if(main.mode == 2) g.drawRect(main.Mx - main.size/2, main.My - main.size/2, main.size, main.size);
				
				else if(main.mode == 3) g.fillOval(main.Mx - main.size/2, main.My - main.size/2, main.size, main.size);
				
				else if(main.mode == 4) g.drawOval(main.Mx - main.size/2, main.My - main.size/2, main.size, main.size);
				
				else if(main.mode == 5){
					if(main.line == true) g.drawLine(main.Mx, main.My, main.xline, main.yline);
				}
				
			}else if(main.drawMode == 1){
				if(main.img != null){
					double size = 1;
					if(main.imgsize < 10) size = Double.parseDouble("0." + main.imgsize);
					if(main.imgsize > 10) size = main.imgsize - 9;
					
					g2d.drawImage(main.img, main.Mx, main.My, (int) (main.img.getWidth(null) * size), (int) (main.img.getHeight(null) * size), null);
				}
				
				
			}else if(main.drawMode == 2){
				if(!main.word.isEmpty()){
					g.setFont(main.font);
					g.drawString(main.word, main.Mx, main.My);
				}
				
			}else if(main.drawMode == 3){
				if(main.Cube == true){
					if(main.mode == 1) g.fillRect(main.Cubex, main.Cubey, main.Mx - main.Cubex, main.My - main.Cubey);
					
					if(main.mode == 2) g.drawRect(main.Cubex, main.Cubey, main.Mx - main.Cubex, main.My - main.Cubey);
					
					if(main.mode == 3) g.fillOval(main.Cubex, main.Cubey, main.Mx - main.Cubex, main.My - main.Cubey);
					
					if(main.mode == 4) g.drawOval(main.Cubex, main.Cubey, main.Mx - main.Cubex, main.My - main.Cubey);
				}
				
			}
			
			
		}
		
		
		main.menu.TraceMenu(g);
		main.cadre.TraceCadre(g);
		
	}
	
	public static void setupPolice(){
		
		if(main.bold == true && main.italic == false) main.font = new Font("Arial", 1, main.fontSize);
		
		else if(main.bold == false && main.italic == true) main.font = new Font("Arial", 2, main.fontSize);
		
		else if(main.bold == true && main.italic == true) main.font = new Font("Arial", 3, main.fontSize);
		
		else if(main.bold == false && main.italic == false) main.font = new Font("Arial", 4, main.fontSize);
	}
	
}
