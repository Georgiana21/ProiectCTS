package ichim.proiect.cts;

public class ClientBuilder {

	private Client client;
	
	public ClientBuilder(String nume){
		this.client.setNume(nume);
	}
	
	public ClientBuilder adaugaVarsta(int varsta){
		this.client.setVarsta(varsta);
		return this;
	}
	
	public ClientBuilder adaugaTelefon(String telefon){
		this.client.setTelefon(telefon);
		return this;
	}
	
	public ClientBuilder adaugaEmail(String email){
		this.client.setEmail(email);
		return this;
	}
	
	public ClientBuilder esteFidel(){
		this.client.setEsteFidel(true);
		return this;
	}
	 
	public ClientBuilder adaugaAdresa(String adresa){
		this.client.setAdresa(adresa);
		return this;
	}
	
	public Client build(){
		return this.client;
	}
}
