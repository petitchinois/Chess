package piece;

import piece.Piece;

public class Pion extends Piece {

    public Pion(int[][] position,  String couleur) {
        super("P" + couleur, position,couleur);
    }

    @Override
    public String toString() {
        return this.getNom();
    }
}
