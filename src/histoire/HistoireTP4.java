package histoire;

import personnages.Commerçants;
import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Humain prof=new Humain("Prof","kombucha",54);
		Commerçants marco=new Commerçants("Marco",20);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		System.out.println("");
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
	}

}
