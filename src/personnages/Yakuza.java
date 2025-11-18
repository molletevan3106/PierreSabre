package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation=0; 
	
	public Yakuza(String nom, String boisson_fav, int quantite_argent, String clan) {
		super(nom, boisson_fav, quantite_argent);
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commerçants victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(victime.getNom()+", si tu tiens � la vie donne moi ta bourse !");
		int argentVictime=victime.seFaireExtorquer();
		this.gagnerArgent(argentVictime);
		parler("J'ai pique les "+argentVictime+" de "+victime.getNom()+" ce qui me fait "+this.getQuantite_argent()+" sous dans ma poche. Hi! Hi!");
		reputation+=1;
	}
	public int perdre() {
		int argentdefaite=this.getQuantite_argent();
		this.reputation-=1;
		parler("J'ai perdu mon duel et mes "+argentdefaite+" sous, snif... J'ai d�shonor� le clan de "+this.clan);
		return argentdefaite;
	}
	public void gagner(int gain) {
		this.gagnerArgent(gain);
		this.reputation+=1;
		parler("Ce ronin pensait vraiment battre "+this.getNom()+" du clan de "+this.clan+" ? Je l'ai d�pouill� de ses "+gain+" sous.");
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de "+clan+".");
	}
	
}
