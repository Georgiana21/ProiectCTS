package ichim.proiect.cts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		Pattern pattern =Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(email);
        if(!matcher.matches())
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
