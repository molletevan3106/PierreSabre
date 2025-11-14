package histoire;

import personnages.Commerçants;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Humain prof=new Humain("Prof","kombucha",54);
		Commerçants marco=new Commerçants("Marco",20);
		Yakuza yaku= new Yakuza("Yaku le noir","whisky", 30,"Warsong");
		Ronin roro=new Ronin("Roro","shochu",60);
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
		System.out.println("");
		yaku.direBonjour();
		yaku.extorquer(marco);
		System.out.println("");
		roro.direBonjour();
		roro.donner(marco);
	}

}
