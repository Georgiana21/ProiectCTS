package ichim.proiect.cts;

public class ClientBuilder {

	private Client client;
	
	public ClientBuilder(String nume){
		this.client=new Client();
		this.client.setNume(nume);
	}
	
	public ClientBuilder adaugaVarsta(int varsta) throws ExceptieVarsta{
		this.client.setVarsta(varsta);
		return this;
	}
	
	public ClientBuilder adaugaTelefon(String telefon) throws ExceptieTelefon{
		this.client.setTelefon(telefon);
		return this;
	}
	
	public ClientBuilder adaugaEmail(String email) throws ExceptieEmail{
		this.client.setEmail(email);
		return this;
	}
	
	public ClientBuilder esteFidel(){
		this.client.setEsteFidel(true);
		return this;
	}
	 
	public ClientBuilder adaugaAdresa(String adresa) throws ExceptieDenumireIncorecta{
		this.client.setAdresa(adresa);
		return this;
	}
	
	public Client build(){
		return this.client;
	}
}
