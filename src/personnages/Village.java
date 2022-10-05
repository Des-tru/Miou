package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}


	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
		nbVillageois++;
	}
	
	
	public Gaulois trouverHabitant(int num) {
		return villageois[num];
	}
	
	
	public void afficherVillageois() {
		System.out.println("Dans village du chef "+chef.getNom()+" vivent les légendaires gaulois :");
		for (int i=0 ; i < nbVillageois ; i++) {
			System.out.println("- "+trouverHabitant(i).getNom());
		}
	}
	
	public String getNom() {
		return nom;
	}

	
	public static void main(String[] args) {
		Village irreductible = new Village("Village des Irréductibles",30);
		Chef Abraracourcix = new Chef("Abraracourcix", 6);
		irreductible.setChef(Abraracourcix);
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obelix", 25);
		irreductible.ajouterHabitant(asterix);
		irreductible.ajouterHabitant(obelix);
		irreductible.afficherVillageois();
		
		
		
		
		
	}
	
	
}
