package fr.polytech.apo.piece;

import java.util.ArrayList;

public class Piece {
    private String nom;
    protected Piece[][] tabPiece = new Piece[8][8]; 
    private String couleur;
    private int coordX;
    private int coordY;

    public Piece(String nom, int x, int y, String couleur) {
        this.nom = nom;
        this.coordX = x;
        this.coordY = y;
        this.couleur = couleur;
        ajouterTab();
    }

    public String getNom() {
    	
        return nom;
    }
    
    public void ajouterTab() {
    	tabPiece[this.coordX][this.coordY]=this;
    }

    public int[] getPosition() {
    	
        int[] pos = new int[2];
        pos[0] = coordX;
        pos[1] = coordY;
        return pos; 
    }
    public int getX() {
    	return this.coordX;
    }
    public int getY() {
    	return this.coordY;
    }
    

    public String getCouleur() {
        return couleur;
    }
    
    public void setPosition(int x, int y) {
    	this.coordX = x; 
    	this.coordY = y;
    }
}
