package fr.polytech.apo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import fr.polytech.apo.deplacement.*;
import fr.polytech.apo.piece.Piece;
import fr.polytech.apo.piece.Pion;

public class Damier extends JPanel implements MouseListener{
	
	//private char[][] grille = new char[10][10];
	private int largeurDamier=8, hauteurDamier=8;
	private int COTECASE = 75;
	//private String[][] pieces = new String[10][10];
	private Grille gr = new Grille();
	private Jeu jeu = new Jeu(gr);
	
	//chargement des icones
	final BufferedImage imagePN = ImageIO.read(new File("img/pn.png"));
	final BufferedImage imagePB = ImageIO.read(new File("img/pb.png"));
	final BufferedImage imageTB = ImageIO.read(new File("img/tb.png"));
	final BufferedImage imageTN = ImageIO.read(new File("img/tn.png"));
	final BufferedImage imageFN = ImageIO.read(new File("img/fn.png"));
	final BufferedImage imageFB = ImageIO.read(new File("img/fb.png"));
	final BufferedImage imageCB = ImageIO.read(new File("img/cb.png"));
	final BufferedImage imageCN = ImageIO.read(new File("img/cn.png"));
	final BufferedImage imageREB = ImageIO.read(new File("img/reb.png"));
	final BufferedImage imageREN = ImageIO.read(new File("img/ren.png"));
	final BufferedImage imageRB = ImageIO.read(new File("img/Rb.png"));
	final BufferedImage imageRN = ImageIO.read(new File("img/Rn.png"));
	private BufferedImage im = null;
	private boolean[][] checkDeplacement = new boolean[8][8];
	

	
	
	public Damier() throws IOException{
		
		
		
		//initTableau();
		
		setOpaque(false);
		//pour le placement du damier
		setLayout(new BorderLayout());
		this.addMouseListener(this);
		
		
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Color c = Color.white;

		for(int i = 0; i<largeurDamier; i++){
			for(int j = 0; j<hauteurDamier; j++){

				g.setColor(c);

				g.fillRect(50+(i)*COTECASE, 50+(j)*COTECASE, COTECASE, COTECASE);
				g.setColor(Color.black);
				//g.drawRect(50+(i-1)*COTECASE, 50+(j-1)*COTECASE, COTECASE, COTECASE);
				
				//methode pour inserer image
				
				Piece piece = jeu.getPiece(i,j);
				if(piece!=null) {
						
				switch(piece.toString()) {
				case "PB":
					im = imagePB;
					break;
				case "PN":
					im = imagePN;
					break;
				case "FB":
					im = imageFB;
					break;
				case "FN":
					im = imageFN;
					break;
				case "CB":
					im = imageCB;
					break;
				case "CN":
					im = imageCN;
					break;
				case "TB":
					im = imageTB;
					break;
				case "TN":
					im = imageTN;
					break;
				case "rB":
					im = imageREB;
					break;
				case "rN":
					im = imageREN;
					break;
				case "RB":
					im = imageRB;
					break;
				case "RN":
					im = imageRN;
					break;
				default:
					im = null;
					break;
				
				
				}
				}else {
					im = null;
				}
			
				g.drawImage(im, (i+1)*COTECASE-10,(j+1)*COTECASE-5, null);
				//g.drawString(gr.getTabGrille()[i][j],(i+1)*COTECASE+10,(j+1)*COTECASE+20);
				
				
				if(checkDeplacement[i][j]) {
					
					g.drawString("----", (i+1)*COTECASE-10,(j+1)*COTECASE-5);
				
				}

		
				if(c==Color.white) c=Color.gray;
				else c=Color.white;
				
				
			}
			if(c==Color.white) c=Color.gray;
			else c=Color.white;
		}
	}
	
	public void choixCase(int x, int y) {
		
		switch(jeu.getPiece(x, y).toString()) {
		
		case "PB":
			//Pion p1 = new Pion(x, y, "B");
			//DeplacementPion d = new DeplacementPion(p1);
			//gr.getTabGrille()[p1.getPosition()[0]][p1.getPosition()[1]] = p1.toString();
			
			checkDeplacement = new DeplacementPion(jeu.getPiece(x, y)).checkCase();
			//jeu.setPiece(jeu.getPiece(x,y).getX(), jeu.getPiece(x, y).getY(), jeu.getPiece(x, y));
			break;
		case "PN":
			new DeplacementPion(jeu.getPiece(x, y));
			jeu.setPiece(jeu.getPiece(x,y).getX(), jeu.getPiece(x, y).getY(), jeu.getPiece(x, y));
			break;
		case "FB":
		
			break;
		case "FN":
			
			break;
		case "CB":
			
			break;
		case "CN":
			
			break;
		case "TB":
			
			break;
		case "TN":
			
			break;
		case "rB":
			
			break;
		case "rN":
			
			break;
		case "RB":
			
			break;
		case "RN":
			
			break;
		default:
			
			break;
		
		}
		//jeu.setPieceVide(x,y);
		
		
	}
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(e.getButton()==1){
			int x = (e.getX()-50)/COTECASE;
			int y = (e.getY()-50)/COTECASE;
			System.out.println(x+" "+y);
			choixCase(x,y);
			
			
			//Pion p1 = new Pion(x, y, "B");
			
			repaint();
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
