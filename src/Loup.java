
public class Loup extends Animal{
	
	public Loup(int taille, int age, String nom, String espece) {
		super(taille, age, nom, espece);
	}
	public void sePresenter() {
		System.out.println("Le loup mesure " + taille + "cm, il a " + age + " ans, il s'appelle " + nom + " et c'est " + espece + ".");
	}
}
