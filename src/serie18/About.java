package Serie18;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;


public class About extends JPanel{

	private JLabel about;
	
	public About(){
		setLayout(new GridLayout(1, 0, 0, 0));
		about = new JLabel("<html><center><h2>Projet réalisé par Mazy Ludovic et Massinon Antoine dans le cadre du cours de Programmation Orientée Objets 2017-2018</center></h2></html>",SwingConstants.CENTER);
		add(about);		
	}
	
	private class Ecouteur implements ActionListener{
		// objet evenement creer par java quand on appuie sur un boutton
		public void actionPerformed(ActionEvent e){  
			
		}
	}
}
