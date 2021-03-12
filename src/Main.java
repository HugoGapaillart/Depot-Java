import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] arg) {
		
		/*delarer valeur 
		int maVar = 8;
		int maVar2 = 12;
		System.out.println(maVar + maVar2);*/
		
		/*declarer chaine de caractere
		String vincent = "Petits poussins jaune rageux";
		System.out.println(vincent);*/
		
		/*MaClasse.java
		MaClasse monObj = new MaClasse(16);
		MaClasse monObj2 = new MaClasse(24);
		System.out.println(monObj.maProp);
		System.out.println(monObj2.maProp);*/

		/*Etudiant.java
		Etudiant hugo = new Etudiant ("Gapaillart", "Hugo", 20, "BSIO1");
		hugo.sePresenter();*/
		
		/*Chien.java
		Chien petit = new Chien (30, 8, "Pilou" , "Yorkshire");
		petit.sePresenter();*/
		
		Chien petit = new Chien (30, 3, "Pilou" , "Yorkshire");
		Chien moyen = new Chien (45, 5, "Chienchien", "Fox Terier");
		Chien grand = new Chien (60, 7, "Galoway" , "Border collie");
		Etudiant hugo = new Etudiant ("Gapaillart", "Hugo", 20, "BSIO");
		Etudiant vincent = new Etudiant ("Lierman", "Vincent", 18, "BSIO");
		Etudiant ronan = new Etudiant ("Henry", "Ronan", 20, "BSIO");
		Classe BSIO = new Classe ("BTS SIO");
		Classe DUT = new Classe ("DUT");
		
		
		List<Chien>chenil = new ArrayList<Chien>();
		chenil.add(petit);
		chenil.add(grand);
		/*hugo.ajouterChien(petit);
		hugo.ajouterChien(grand);*/
		ronan.ajouterChien(petit);
		vincent.ajouterChien(moyen);
		/*hugo.retirerChien(0);*/
		
		/*hugo.sePresenter();*/
		
		/*for (int i = 0; i < chenil.size(); i++) {
			System.out.println(chenil.get(i));
		}*/
		
		BSIO.addEtudiant(vincent);
		BSIO.addEtudiant(ronan);
		DUT.addEtudiant(hugo);
		
		//BSIO.presentClasse();
		//DUT.presentClasse();
		
		Demon demon = new Demon (2, "Dracks", "tirer des boules de feu");
		hugo.ajouterDemon(demon);
		hugo.sePresenter();
		
		
	}
}