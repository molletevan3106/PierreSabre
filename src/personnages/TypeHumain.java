package personnages;

public enum TypeHumain {
	HUMAIN("un habitant"),
	YAKUZA("un yakuza"),
	COMMERCANTS("un commerçants"),
	RONIN("un ronin"),
	SAMOURAI("un samourai"),
	GRANDMERE("une grand-mère");
	
	
	private String nom;
	
	TypeHumain(String nom) {
		 this.nom=nom;
	}
	
	@Override
	public String toString() {
		return nom;
	}
	
}
