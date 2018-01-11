package fr.polytech.apo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.FlowLayout;


public class Fenetre extends JFrame implements ActionListener{
	
	protected static final int LARGEUR = 1000;
	protected static final int HAUTEUR = 800;
	
	//Constructeur de classe Fenetre, on fixe uniquement la taille
	public Fenetre() {
		setTitle("Jeu d'échecs");
		setSize(LARGEUR,HAUTEUR);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	


}
