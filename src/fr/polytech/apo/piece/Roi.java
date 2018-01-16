package fr.polytech.apo.piece;

import java.util.ArrayList;

public class Roi extends Piece {
    public Roi(int x, int y, String couleur) {
        super("R" + couleur, x, y, couleur);
    }

    @Override
    public String toString() {
        return this.getNom();
    }
}
