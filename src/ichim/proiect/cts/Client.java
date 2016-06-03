package ichim.proiect.cts;

public class Client {
	
	private String nume;
	private int varsta;
	private String telefon;
	private String email;
	private boolean esteFidel;
	private String adresa;
	private MetodaPlata metodaPlata;
	private Comanda comanda;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) throws ExceptieVarsta {
		if(varsta<14 || varsta>100)
			throw new ExceptieVarsta("Varsta trebuie sa fie in intervalul 14-100");
		this.varsta = varsta;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) throws ExceptieTelefon {
		if(telefon==null||
				(telefon!=null && (telefon.length()!=10 || !telefon.matches("[0-9]+"))))
			throw new ExceptieTelefon("Trebuie sa fie doar caractere numerice");
		this.telefon = telefon;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws ExceptieEmail {
		String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
		if(!email.contains(ePattern))
			throw new ExceptieEmail("Email invalid");
		this.email = email;
	}

	public boolean isEsteFidel() {
		return esteFidel;
	}

	public void setEsteFidel(boolean esteFidel) {
		this.esteFidel = esteFidel;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) throws ExceptieDenumireIncorecta {
		if(adresa==null ||
				(adresa!=null && adresa.length()<10))
			throw new ExceptieDenumireIncorecta("Trebuie sa aiba macar 10 caractere!");
		this.adresa = adresa;
	}

	public MetodaPlata getMetodaPlata() {
		return metodaPlata;
	}

	public void setMetodaPlata(MetodaPlata metodaPlata) {
		this.metodaPlata = metodaPlata;
	}

	public Comanda getComanda() {
		return comanda;
	}

	public void setComanda(Comanda comanda) {
		this.comanda = comanda;
	}

	public MetodaPlata achita(){
		return metodaPlata;
	}
}
