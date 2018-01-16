package fr.polytech.apo.piece;

import java.util.ArrayList;

public class Tour extends Piece {

    public Tour(int x, int y, String couleur) {
        super("T" + couleur, x, y, couleur);
    }

    @Override
    public String toString() {
        return this.getNom();
    }
}
