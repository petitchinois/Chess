package piece;

public class Roi extends Piece {
    public Roi(int[][] position, String couleur) {
        super("R" + couleur, position, couleur);
    }

    @Override
    public String toString() {
        return this.getNom();
    }
}
