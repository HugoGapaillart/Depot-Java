import java.util.List;
import java.util.ArrayList;

public class Etudiant {
	public 	String nom;
	public 	String prenom;
	public 	int age;
	public 	String classe;
	private List<Chien> chiens;
	private List<Demon> demons;
	
	
	public Etudiant(String p_nom, String p_prenom, int p_age, String p_classe) {
		nom = p_nom;
		prenom = p_prenom;
		age = p_age;
		classe = p_classe;
		chiens = new ArrayList<>();
		demons = new ArrayList<>();
		
	}
	
	public void sePresenter() {
		System.out.println("Bonjour, je m'appelle " + nom + " " + prenom + " j'ai " + age + " ans, je suis en " + classe + ".");
		for(int i = 0; i < chiens.size(); i++) {
			chiens.get(i).sePresenter();
		}
		for(int i = 0; i < demons.size(); i++) {
			demons.get(i).presenter();
		}
		
	}
	//ajouter un chien a l'etudiant
	public void ajouterChien(Chien p_chien) {
		chiens.add(p_chien);
	}
	//retirer un chien a l'etudiant
	public void retirerChien(int numeroChien) {
		chiens.remove(numeroChien);
	}
	//ajouter un demon a l'etudiant
	public void ajouterDemon(Demon p_demon) {
		demons.add(p_demon);
	}
}
