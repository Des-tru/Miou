package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private String[] villageois;
	private int nbVillageois = 0;
	

	public Village(String nom, Chef chef, String[] villageois, int nbVillageois) {
		super();
		this.nom = nom;
		this.chef = chef;
		this.villageois = villageois;
		this.nbVillageois = nbVillageois;
	}


	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	
	public String getNom() {
		return nom;
	}
	
}
