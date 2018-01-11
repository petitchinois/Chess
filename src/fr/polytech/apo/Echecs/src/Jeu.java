import piece.*;

public class Jeu {
    private Grille grille = new Grille();

    public Jeu(Grille grille) {
        this.grille = grille;
        Initialiser();
    }

    public void Initialiser(){

        for(int i = 0; i< Grille.getTaille(); i++) {
            Pion pionn = new Pion(new int[i][1], "N");
            Pion pionb = new Pion(new int[i][6], "B");
            grille.getTabGrille()[i][1] = pionn.toString();
            grille.getTabGrille()[i][6] = pionb.toString();
        }

        for (int i=0; i<Grille.getTaille(); i+=7){
            Tour tourb = new Tour(new int[i][7], "B");
            Tour tourn = new Tour(new int[i][0], "N");
            grille.getTabGrille()[i][7]= tourb.toString();
            grille.getTabGrille()[i][0] = tourn.toString();
        }

        for (int i=1; i<Grille.getTaille(); i+=5){
            Cavalier cavalierb = new Cavalier(new int[i][0], "B");
            Cavalier cavaliern = new Cavalier(new int[i][7], "N");
            grille.getTabGrille()[i][7] = cavalierb.toString();
            grille.getTabGrille()[i][0] = cavaliern.toString();
        }

        for (int i=2; i<Grille.getTaille(); i+=3){
            Fou foub = new Fou(new int[i][7], "B");
            Fou foun = new Fou(new int[i][0], "N");
            grille.getTabGrille()[i][7] = foub.toString();
            grille.getTabGrille()[i][0] = foun.toString();
        }

        Roi roib = new Roi(new int[3][7],"B");
        Roi roin = new Roi(new int[3][0],"N");
        grille.getTabGrille()[3][7] = roib.toString();
        grille.getTabGrille()[3][0] = roin.toString();

        Reine reineb = new Reine(new int[4][7],"B");
        Reine reinen = new Reine(new int[4][0],"N");
        grille.getTabGrille()[4][7] = reineb.toString();
        grille.getTabGrille()[4][0] = reinen.toString();

    }

}
