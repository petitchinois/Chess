package piece;

public class Tour extends Piece {

    public Tour(int[][] position, String couleur) {
        super("T" + couleur, position, couleur);
    }

    @Override
    public String toString() {
        return this.getNom();
    }
}
