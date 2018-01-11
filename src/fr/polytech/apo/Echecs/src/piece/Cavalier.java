package piece;

public class Cavalier extends Piece {
    public Cavalier(int[][] position, String couleur) {
        super("C" + couleur, position, couleur);
    }

    @Override
    public String toString() {
        return this.getNom();
    }
}
