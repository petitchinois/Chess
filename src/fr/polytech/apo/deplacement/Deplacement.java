package fr.polytech.apo.deplacement;
import fr.polytech.apo.piece.*;

public abstract class Deplacement {
	

	protected Piece p;
	
	public Deplacement(Piece p) {
		this.p = p;
		
	}
	
	public abstract int[] mouvement();

}
