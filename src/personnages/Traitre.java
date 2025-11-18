package personnages;

public class Traitre extends Samourai {
	private int niveauTraitrise=0;
	public Traitre(String seigneur, String nom, String boisson_fav, int quantite_argent) {
		super(seigneur, nom, boisson_fav, quantite_argent);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : "+niveauTraitrise+". Chut!");
	}
	public void ranconner(Commerçants commercants) {
		if (niveauTraitrise<3) {
			int argentCommercant=commercants.getQuantite_argent();
			int argentRanconner=argentCommercant*2/10;
			commercants.perdreArgent(argentRanconner);
			niveauTraitrise+=1;
			this.gagnerArgent(argentRanconner);
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi " +argentRanconner+" sous ou gare à toi !");
			commercants.parler("Tout de suite grand "+this.getNom()+".");
		} else {
			parler("Mince je ne peux plus rançonner personne sinon un samourai risque de me demasquer!");
		}
	}
}
