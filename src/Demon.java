
public class Demon {
	private int taille;
	private String nom;
	private String capacite;
	
	public Demon (int p_taille, String p_nom , String p_capacite){
		taille = p_taille;
		nom = p_nom;
		capacite = p_capacite;
		
	}
	public void presenter() {
		System.out.println("Mon demon fait " + taille + " m, il s'appelle " + nom + "et il peut " + capacite);
	}

}
