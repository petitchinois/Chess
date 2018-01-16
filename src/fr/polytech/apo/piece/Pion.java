package fr.polytech.apo.piece;

import java.util.ArrayList;

//import fr.polytech.apo.piece.Piece;

public class Pion extends Piece {

    public Pion(int x, int y,  String couleur) {
        super("P" + couleur, x, y,couleur);
    }

    @Override
    public String toString() {
        return this.getNom();
    }
}
