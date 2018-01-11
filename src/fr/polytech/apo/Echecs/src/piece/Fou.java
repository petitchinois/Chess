package piece;

public class Fou extends Piece {
    public Fou(int[][] position, String couleur) {
        super("F" + couleur, position, couleur);
    }

    @Override
    public String toString() {
        return this.getNom();
    }
}
