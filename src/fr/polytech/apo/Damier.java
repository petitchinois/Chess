package fr.polytech.apo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JPanel;

public class Damier extends JPanel implements MouseListener{
	
	private char[][] grille = new char[10][10];
	private int largeurDamier=8, hauteurDamier=8;
	private int COTECASE = 75;
	private String[][] pieces = new String[10][10];

	
	
	public Damier() throws IOException{
		
		
		
		initTableau();
		
		setOpaque(false);
		//pour le placement du damier
		setLayout(new BorderLayout());
		this.addMouseListener(this);
		
		
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Color c = Color.white;

		for(int i = 1; i<=largeurDamier; i++){
			for(int j = 1; j<=hauteurDamier; j++){

				g.setColor(c);

				g.fillRect(50+(i-1)*COTECASE, 50+(j-1)*COTECASE, COTECASE, COTECASE);
				g.setColor(Color.black);
				//g.drawRect(50+(i-1)*COTECASE, 50+(j-1)*COTECASE, COTECASE, COTECASE);
				
				//methode pour inserer image
				g.drawString(pieces[i][j],i*COTECASE+10,j*COTECASE+20);
		
				if(c==Color.white) c=Color.gray;
				else c=Color.white;

			}
			if(c==Color.white) c=Color.gray;
			else c=Color.white;
		}
	}
	
	public void initTableau() {
		for(int i = 1; i<=largeurDamier; i++){
			for(int j = 1; j<=hauteurDamier; j++){
					pieces[i][j]="";
			}
		}
		for(int i = 1;i<=largeurDamier;i++) {
			pieces[i][2]="p_N";
			pieces[i][7]="p_B";
		}
		//pieces noires
		pieces[1][1]="t_N";
		pieces[8][1]="t_N";
		pieces[2][1]="c_N";
		pieces[7][1]="c_N";
		pieces[3][1]="f_N";
		pieces[6][1]="f_N";
		pieces[4][1]="q_N";
		pieces[5][1]="k_N";
		
		//pieces blanches
		pieces[1][8]="t_B";
		pieces[8][8]="t_B";
		pieces[2][8]="c_B";
		pieces[7][8]="c_B";
		pieces[3][8]="f_B";
		pieces[6][8]="f_B";
		pieces[4][8]="q_B";
		pieces[5][8]="k_B";
	}
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(e.getButton()==1){
			int x = 1+(e.getX()-50)/COTECASE;
			int y = 1+(e.getY()-50)/COTECASE;
			System.out.println(x+" "+y);
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
