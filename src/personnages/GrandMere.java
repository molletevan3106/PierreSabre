package personnages;

import java.util.Random;

public class GrandMere extends Humain {
	private TypeHumain[] types= TypeHumain.values();
	public GrandMere(String nom, int quantite_argent) {
		super(nom, " tisane", quantite_argent);
	}
	
	@Override
	protected void memoriser(Humain humain) {
	if (nbConnaissance>=5) {
		parler("Oh ma tete ! Je ne peux plus retenir le nom d'une personne suplémentaire !");
	}
	super.memoriser(humain);
	}
	public void ragoter() {
		for (int i = 0; i <5; i++) {
			Humain personne=this.memoire[i];
			if (personne instanceof Traitre) {
				parler("Je sais que "+personne.getNom()+" est un traitre. Petit chenapan !");
			} else {
				parler("Je crois que "+personne.getNom()+" est "+humainHasard()+".");
			}
			
		}
	}
	private String humainHasard() {
		Random random=new Random();
		TypeHumain type = types[random.nextInt(types.length)];
		return type.toString();
		
		
	}
}
