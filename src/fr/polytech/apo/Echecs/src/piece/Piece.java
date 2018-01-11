package piece;

public class Piece {
    private String nom;
    private int[][] position;
    private String couleur;

    public Piece(String nom, int[][] position, String couleur) {
        this.nom = nom;
        this.position = position;
        this.couleur = couleur;
    }

    public String getNom() {
        return nom;
    }

    public int[][] getPosition() {
        return position;
    }

    public String getCouleur() {
        return couleur;
    }
}
