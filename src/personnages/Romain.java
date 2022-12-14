package personnages;

public class Romain {
	private String nom;
	private int force;
	

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force > 0 : "force negative";
	}
	
	public String getNom() {
		return nom;
	}
	
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "? " + texte + "?.");
	}
	
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	
	public void recevoirCoup(int forceCoup) {
		assert force > 0 : "force du romain negative";
		int forceIni = force;
		force -= forceCoup;
		if (force > 0) {
		parler("A?e");
		} else {
		parler("J'abandonne...");
		}
		assert forceIni >= force : "La force n'a pas diminu?";
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
		
		
		
	}
	
	
	
}
