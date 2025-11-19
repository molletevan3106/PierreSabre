package personnages;

public class Humain {
	private String nom;
	private String boisson_fav;
	private int quantite_argent;
	protected int nbConnaissance=0;
	protected int MAX_CONNAISSANCE=30;
	protected Humain[] memoire=new Humain[MAX_CONNAISSANCE];
	
	public Humain(String nom, String boisson_fav, int quantite_argent) {
		this.nom = nom;
		this.boisson_fav = boisson_fav;
		this.quantite_argent = quantite_argent;
	}
	
	public String getNom() {
		return nom;
	}
	public int getQuantite_argent() {
		return quantite_argent;
	}
	
	protected void parler(String texte) {
	        System.out.println("(" + nom + ") - " + texte);
	}
	
	public void direBonjour() {
	      parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson_fav + ".");
	}
	
	public void boire() {
	        parler("Mmmm, un bon verre de " + boisson_fav + " ! GLOUPS !");
	}
	
	public void acheter(String bien,int prix) {
		if (quantite_argent>=prix) {
			parler("J'ai "+quantite_argent+" sous en poche. Je vais pouvoir m'offrir "+bien+" a� "+prix+" sous.");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que "+quantite_argent+" sous en poche. Je ne peux meme pas m'offrir "+bien+" à "+prix+" sous.");
		}
	}
	
	protected void gagnerArgent(int gain) {
		quantite_argent+=gain;
	}
	
	protected void perdreArgent(int perte) {
		quantite_argent-=perte;
	}
	
	public void faireConnaissanceAvec(Humain humain) {
		this.direBonjour();
		humain.repondre(this);
		this.memoriser(humain);
		
	}

	protected void memoriser(Humain humain) {
		if (nbConnaissance<MAX_CONNAISSANCE) {
			this.memoire[nbConnaissance]=humain;
			this.nbConnaissance+=1;
		} else {
			nbConnaissance=MAX_CONNAISSANCE;
			for (int i = 1; i < nbConnaissance; i++) {
				memoire[i-1]=memoire[i];
			}
			memoire[nbConnaissance-1]=humain;
		}
		
	}

	private void repondre(Humain humain) {
		this.direBonjour();
		this.memoriser(humain);
	}
	
	public void listerConnaissance() {
		parler("Je connais beaucoup de monde dont :");
		for (int i = 0; i <(nbConnaissance-1); i++) {
			Humain humain = this.memoire[i];
			System.out.println(humain.getNom()+", ");
		}
		System.out.println(memoire[nbConnaissance-1].getNom());
	
	}
	
	
	
}
