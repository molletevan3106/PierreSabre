package personnages;

import java.util.Random;

public class Traitre extends Samourai {
	private int niveauTraitrise=0;
	public Traitre(String seigneur, String nom, String boisson_fav, int quantite_argent) {
		super(seigneur, nom, boisson_fav, quantite_argent);
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traitre et mon niveau de traitrise est : "+niveauTraitrise+". Chut!");
	}
	
	public void ranconner(Commerçants commercants) {
		if (niveauTraitrise<3) {
			int argentCommercant=commercants.getQuantite_argent();
			int argentRanconner=argentCommercant*2/10;
			commercants.perdreArgent(argentRanconner);
			niveauTraitrise+=1;
			this.gagnerArgent(argentRanconner);
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi " +argentRanconner+" sous ou gare � toi !");
			commercants.parler("Tout de suite grand "+this.getNom()+".");
		} else {
			parler("Mince je ne peux plus rançonner personne sinon un samourai risque de me demasquer!");
		}
	}
	
	public void faireLeGentil() {
		if (nbConnaissance<1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne! Snif.");
		} else {
			Random random=new Random();
			int ami=random.nextInt(nbConnaissance);
			Humain Ami=this.memoire[ami];
			int don=this.getQuantite_argent()*1/20;
			String nomAmi=Ami.getNom();
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec "+nomAmi+".");
			parler("Bonjour l'ami! Je voudrais vous aider en vous donnant "+don+" sous.");
			Ami.gagnerArgent(don);
			this.perdreArgent(don);
			Ami.parler("Merci "+ this.getNom()+". Vous etes quelqu'un de bien.");
			if (niveauTraitrise>1) {
				niveauTraitrise-=1;
			} 
			
			
		}
	}
	
}
