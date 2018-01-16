package fr.polytech.apo.piece;

import java.util.ArrayList;

public class Cavalier extends Piece {
    public Cavalier(int x, int y, String couleur) {
        super("C" + couleur, x, y, couleur);
    }

    @Override
    public String toString() {
        return this.getNom();
    }
}
