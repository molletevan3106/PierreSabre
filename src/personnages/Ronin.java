package personnages;

public class Ronin extends Humain {
	
	private int honneur=1;
	public Ronin(String nom, String boisson_fav, int quantite_argent) {
		super(nom, boisson_fav, quantite_argent);
		
	}
	
	public void donner(Commerçants beneficiaire) {
	int don_argent=this.getQuantite_argent()*10/100;
	parler(beneficiaire.getNom()+" prends ces "+don_argent+" sous.");
	beneficiaire.recevoir(don_argent);
	this.perdreArgent(don_argent);
	}

}
