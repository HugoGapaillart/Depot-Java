
public class Araigner extends Animal{
	
	private String couleur;
	private String venimeux;
	
	public Araigner(int taille, int age, String nom, String espece, String couleur, String venimeux) {
		super(taille, age, nom, espece);
		this.couleur = couleur;
		this.venimeux = venimeux;
	}
	public void sePresenter() {
		System.out.println("L'araigner mesure " + taille + "cm, elle a " + age + " ans, il s'appelle " + nom + " et c'est " + espece + ", elle est " + couleur + " et elle est " + venimeux + ".");
	}
}
