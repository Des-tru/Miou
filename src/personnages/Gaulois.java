package personnages;

public class Gaulois {
	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}
	public int getEffetPotion() {
		return effetPotion;
	}
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}
	private String nom;
	private int force;
	private int effetPotion = 1;
}
