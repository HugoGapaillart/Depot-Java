
public class Chien {
	public 	int taille;
	public 	int age;
	public 	String nom;
	public 	String race;
	
	public Chien(int p_taille, int p_age ,String p_nom, String p_race) {
		taille=p_taille;
		age=p_age;
		nom=p_nom;
		race=p_race;
	}
	public void sePresenter() {
		System.out.println("Mon chien fait " + taille + " cm, il a " + age + " ans, il s'appelle " + nom + " et c'est un " + race + ".");
	}
	
	//permet de tester en affichant ce que l'on veut.
	/*public String toString() {
		return nom + " " + race;
	}*/
}
