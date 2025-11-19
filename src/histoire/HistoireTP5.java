package histoire;

import personnages.Commerçants;
import personnages.GrandMere;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitre;
import personnages.Yakuza;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commerçants marco = new Commerçants("Marco", 20);
		Commerçants chonin = new Commerçants("Chonin", 40);
		Commerçants kumi = new Commerçants("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
		Traitre masako = new Traitre("Miyamoto", "Masako", "whisky", 100);
		GrandMere grandMere = new GrandMere("Grand-Mère", 10);
//		marco.faireConnaissanceAvec(roro);
//		marco.faireConnaissanceAvec(yaku);
//		marco.faireConnaissanceAvec(chonin);
//		marco.faireConnaissanceAvec(kumi);
//		marco.listerConnaissance();
//		roro.listerConnaissance();
//		yaku.listerConnaissance();
//		
//		akimoto.faireConnaissanceAvec(marco);
//		akimoto.boire("thé");
//		masako.faireLeGentil();
//		masako.ranconner(kumi);
//		masako.ranconner(chonin);
//		masako.ranconner(marco);
//		akimoto.faireConnaissanceAvec(masako);
//		masako.ranconner(kumi);
//		masako.faireConnaissanceAvec(yaku);
//		masako.faireLeGentil();
//		masako.faireConnaissanceAvec(roro);
		grandMere.faireConnaissanceAvec(akimoto);
		grandMere.faireConnaissanceAvec(yaku);
		grandMere.faireConnaissanceAvec(masako);
		grandMere.faireConnaissanceAvec(kumi);
		grandMere.faireConnaissanceAvec(marco);
		grandMere.faireConnaissanceAvec(chonin);
		grandMere.ragoter();

	}

}
