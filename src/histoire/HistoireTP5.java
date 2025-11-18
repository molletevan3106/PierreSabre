package histoire;

import personnages.Commerçants;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Yakuza;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commerçants marco = new Commerçants("Marco", 20);
		Commerçants chonin = new Commerçants("Chonin", 40);
		Commerçants kumi = new Commerçants("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		System.out.println("");
		akimoto.faireConnaissanceAvec(marco);
		akimoto.boire("thé");
		
		
	}

}
