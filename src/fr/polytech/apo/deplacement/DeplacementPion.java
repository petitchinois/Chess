package fr.polytech.apo.deplacement;

import fr.polytech.apo.piece.Piece;
import fr.polytech.apo.Jeu;


public class DeplacementPion extends Deplacement{
	
	Piece[][] tabP = Jeu.getTabPiece();
	
	public DeplacementPion(Piece p) {
		super(p);
		
		
		
	}

	

	@Override
	public int[] mouvement() {
		int[] pos = p.getPosition();
		pos[1]++;
		System.out.println(pos);
		return pos;
		
	}
	
	public void avancer() {
		if(p.getCouleur()=="B")
			p.setPosition(p.getX(), p.getY()-1);
		else
			p.setPosition(p.getX(), p.getY()+1);
	}
	
	public boolean[][] checkCase(){
		boolean[][] verif = new boolean[8][8];
		for(int i = 0; i<8;i++) {
			for(int j=0; j<8;j++) {
				verif[i][j]=false;
			}
		}
		
		
		if(tabP[p.getX()][p.getY()-1]==null) verif[p.getX()][p.getY()-1]=true;
		else if(tabP[p.getX()-1][p.getY()-1]!=null) verif[p.getX()-1][p.getY()-1] = true;
		else if(tabP[p.getX()+1][p.getY()-1]!=null) verif[p.getX()+1][p.getY()-1] = true;
		if(p.getY()==6) verif[p.getX()][p.getY()-2] = true;
		
		return verif;
	}

}
