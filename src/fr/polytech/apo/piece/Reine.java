package fr.polytech.apo.piece;

import java.util.ArrayList;

public class Reine extends Piece {
    public Reine(int x, int y, String couleur) {
        super("r" + couleur, x, y , couleur);
    }

    @Override
    public String toString() {
        return this.getNom();
    }
}
