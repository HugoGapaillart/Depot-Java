
public class Animal {
	protected int taille;
	protected int age;
	protected String nom;
	protected String espece;
	
	public Animal(int taille, int age, String nom, String espece) {
		this.taille = taille;
		this.age = age;
		this.nom = nom;
		this.espece = espece;
	}
	
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEspece() {
		return espece;
	}
	public void setEspece(String espece) {
		this.espece = espece;
	}
	
	public void sePresenter() {
		System.out.println("Le loup mesure " + taille + "cm, il a " + age + " ans, il s'appelle " + nom + " et c'est " + espece + ".");
	}
}
