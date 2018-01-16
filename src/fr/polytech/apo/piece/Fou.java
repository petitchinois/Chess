package fr.polytech.apo.piece;

import java.util.ArrayList;

public class Fou extends Piece {
    public Fou(int x, int y, String couleur) {
        super("F" + couleur, x, y, couleur);
    }

    @Override
    public String toString() {
        return this.getNom();
    }
}
