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
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		int argent_victime=victime.seFaireExtorquer();
		this.gagnerArgent(argent_victime);
		parler("J'ai pique les "+argent_victime+" de "+victime.getNom()+" ce qui me fait "+this.getQuantite_argent()+" sous dans ma poche. Hi! Hi!");
		reputation+=1;
	}
	public int perdre() {
		int argent_defaite=this.getQuantite_argent();
		this.reputation-=1;
		parler("J’ai perdu mon duel et mes "+argent_defaite+" sous, snif... J'ai déshonoré le clan de "+this.clan);
		return argent_defaite;
	}
	public void gagner(int gain) {
		this.gagnerArgent(gain);
		this.reputation+=1;
		parler("Ce ronin pensait vraiment battre "+this.getNom()+" du clan de "+this.clan+" ? Je l'ai dépouillé de ses "+gain+" sous.");
	}
	@Override
	public void direBonjour() {
		// TODO Auto-generated method stub
		super.direBonjour();
		parler("Mon clan est celui de "+clan+".");
	}
	
}
