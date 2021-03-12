import java.util.List;
import java.util.ArrayList;

public class Classe {
	private String libelle;
	private List<Etudiant>etudiants;
	
	public Classe(String p_libelle) {
		libelle=p_libelle;
		etudiants = new ArrayList<>();
	}
	
	List<Etudiant>getEtudiants(){
		return etudiants;
	}
	
	public List<Etudiant> getEtudiant(int nbEtudiants) {
		return etudiants;
	}
	
	public void addEtudiant(Etudiant p_etudiant) {
		etudiants.add(p_etudiant);
	}
	
	public void removeEtudiant(int nombreEtudiant) {
		etudiants.remove(nombreEtudiant);
	}
	
	public void presentClasse() {
		System.out.println("Voici les personnes qui sont en " + libelle + ".");
		for(int i = 0; i < etudiants.size(); i++) {
			etudiants.get(i).sePresenter();
		}
	}
}