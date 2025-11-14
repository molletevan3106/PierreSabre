package personnages;

public class Commerçants extends Humain {

	public Commerçants(String nom, int quantite_argent) {
		super(nom, "thé", quantite_argent);
		// TODO Auto-generated constructor stub
	}
	public int seFaireExtorquer() {
		parler("J’ai tout perdu! Le monde est trop injuste..");
		int argent_perdu = this.getQuantite_argent();
		this.perdreArgent(argent_perdu);
		return argent_perdu;
	}
	public  void recevoir(int argent) {
		if (argent>0) {
		parler(argent+" sous ! Je te remercie généreux donateur!");
		this.gagnerArgent(argent);
		}else{
			argent=0;
			parler(argent+" sous ! Me prend tu pour un idiot! Donne moi de l'argent Ronin!");
		}
	}
}
