
public class Tigre extends Animal{
	
	public Tigre(int taille, int age, String nom, String espece) {
		super(taille, age, nom, espece);
	}
	public void sePresenter() {
		System.out.println("Le tigre mesure " + taille + "cm, il a " + age + " ans, il s'appelle " + nom + " et c'est " + espece + ".");
	}
}
