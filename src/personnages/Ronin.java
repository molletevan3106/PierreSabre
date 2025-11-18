package personnages;

public class Ronin extends Humain {
	
	private int honneur=1;
	public Ronin(String nom, String boisson_fav, int quantite_argent) {
		super(nom, boisson_fav, quantite_argent);
		
	}
	
	public void donner(Commerçants beneficiaire) {
	int donargent=this.getQuantite_argent()*10/100;
	parler(beneficiaire.getNom()+" prends ces "+donargent+" sous.");
	beneficiaire.recevoir(donargent);
	this.perdreArgent(donargent);
	}
	public void provoquer(Yakuza adversaire) {
		int force=2*this.honneur;
		int reputation=adversaire.getReputation();
		parler("Je t'ai retrouv� vermine, tu vas payer pour ce que tu as fait � ce pauvre marchand!");
		if (force>=reputation) {
			parler("Je t�ai eu petit yakusa!");
			int argent_yakusa=adversaire.perdre();
			this.gagnerArgent(argent_yakusa);
			this.honneur+=1;;
		} else {
			this.honneur-=1;;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			int argent_perdue=this.getQuantite_argent();
			this.perdreArgent(argent_perdue);
			adversaire.gagner(argent_perdue);
		}
	}

}