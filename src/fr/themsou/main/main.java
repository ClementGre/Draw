package fr.themsou.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSlider;
import javax.swing.JTextField;
import fr.themsou.devices.*;
import fr.themsou.fenetres.Sauvegarder;
import fr.themsou.fenetres.ouvrir;
import fr.themsou.fenetres.ouvririmg;
import fr.themsou.panel.panel;
import fr.themsou.panel.menu;

public class main {
	


	public static JFrame fenetre;
	public static MouseListener MListener = new fr.themsou.devices.MouseListener();
	public static KeyListener KListener = new fr.themsou.devices.KeyListener();
	public static MouseWhelListener WListener = new fr.themsou.devices.MouseWhelListener();
	public static panel panel = new panel();
	public static menu menu = new menu();
	public static fr.themsou.panel.cadre cadre = new fr.themsou.panel.cadre();
	public static fr.themsou.devices.click click = new fr.themsou.devices.click();
	public static menuBar CmenuBar = new menuBar();
	public static Saisie saisie = new Saisie();
	public static boutons Boutons = new boutons();
	public static files files = new files();
	public static ouvrir ouvrir = new ouvrir();
	public static ouvririmg imgouvrir = new ouvririmg();
	public static Sauvegarder sauvegarder = new Sauvegarder();
	
	//public static BufferedWriter out;
	//public static BufferedReader in;
	
	public static JTextField text = new JTextField();
	public static JTextField text2 = new JTextField();
	public static JTextField text3 = new JTextField();
	public static JTextField text4 = new JTextField();
	public static JMenuBar menubar = new JMenuBar();
	public static JMenu menu1 = new JMenu("Fichier");
	public static JMenu menu2 = new JMenu("Modifier");
	public static JMenuItem menuarg1 = new JMenuItem("Sauvegarder");
	public static JMenuItem menuarg2 = new JMenuItem("Ouvrir");
	public static JMenuItem menuarg3 = new JMenuItem("Annuler l'action");
	public static JMenuItem menuarg4 = new JMenuItem("Réinitialiser");
	public static JSlider slider1 = new JSlider();
	public static JSlider slider2 = new JSlider();
	public static JButton bouton = new JButton("Placer");
	public static JButton bouton2 = new JButton("Ouvrir");
	
	public static Image img;
	
	public static boolean ctrl = false;
	
	public static int sx;
	public static int sy;
	
	public static int Mx;
	public static int My;
	public static int Mh = 120;
	public static boolean press = false;
	
	
	public static Color color = new Color(000, 000, 000);
	public static int zoom = 1;
	public static int size = 20;
	public static int mode = 1;
	public static boolean line = false;
	public static boolean Cube = false;
	public static int Cubex;
	public static int Cubey;
	public static int xline;
	public static int yline;
	public static ArrayList<String> object = new ArrayList<>();
	public static String word = "";
	public static Font font = new Font("Arial", 1, size);
	public static int fontSize = 20;
	public static int imgsize = 10;
	public static boolean bold = false;
	public static boolean italic = false;
	public static String nom = "sans_nom";
	public static String chemin = "C://user/you/";
	public static String imgnom = "sans_nom.png";
	public static String imgchemin = "C://user/you/";
	
	public static boolean erreurOuvrir = false;
	public static boolean erreurSauvegarder = false;
	public static boolean erreurimgOuvrir = false;
	
	public static int drawMode = 0;
	
	public static void main(String[] args){
	
		/*try {
			UIManager.setLookAndFeel(new NimbusLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}*/
		
		fenetre = new JFrame("sans_nom.txt - Draw");
		fenetre.setSize(1000, 600);
		fenetre.setResizable(true);
		fenetre.setLocationRelativeTo(null);
		fenetre.setVisible(true);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.addKeyListener(KListener);
		fenetre.addMouseListener(MListener);
		fenetre.addMouseWheelListener(WListener);
		fenetre.setContentPane(panel);
		
		
		
		sx = (int) fenetre.getSize().getWidth();
		sy = (int) fenetre.getSize().getHeight();
		
		
		
		text.setText("0");
		text2.setText("0");
		text3.setText("0");
		
		Saisie.paintDebut();
		boutons.paintboutons();
		boutons.setexecuteboutons();
		menuBar.paintmenu();
		menuBar.paintslider();
		menuBar.setlistener();
		
		fenetre.setSize(fenetre.getWidth() + 1, fenetre.getHeight());
		
		
		Run.run();
	}
}

