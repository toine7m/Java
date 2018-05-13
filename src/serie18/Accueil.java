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


public class Accueil extends JPanel{

	private JLabel accueil;
	
	public Accueil(){
		setLayout(new GridLayout(1, 0, 0, 0));
		accueil = new JLabel("<html><center><h1>Bienvenue sur cette application</h1> <h3><br\\>Je vous propose de réaliser certaines tâches comme:  <br\\><br\\>	- Lister différents contenus selon certains critères<br\\> - Ajouter ou supprimer différentes informations <br\\\\></h3><h2>Bonne visite !</h2></center></html>",SwingConstants.CENTER);
		add(accueil);		
	}
	
	private class Ecouteur implements ActionListener{
		// objet evenement creer par java quand on appuie sur un boutton
		public void actionPerformed(ActionEvent e){  
			
		}
	}
}
