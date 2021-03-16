
public class Serpent extends Animal{
	
	private String couleur;
	private String venimeux;
	
	public Serpent(int taille, int age, String nom, String espece, String couleur, String venimeux) {
		super(taille, age, nom, espece);
		this.couleur = couleur;
		this.venimeux = venimeux;
	}
	public void sePresenter() {
		System.out.println("Le serpent mesure " + taille + "cm, il a " + age + " ans,  il s'appelle " + nom + " et c'est " + espece + ", il est " + couleur + " et il est " + venimeux + ".");
	}
	
}
