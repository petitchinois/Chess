package piece;

public class Reine extends Piece {
    public Reine(int[][] position, String couleur) {
        super("r" + couleur, position, couleur);
    }

    @Override
    public String toString() {
        return this.getNom();
    }
}
