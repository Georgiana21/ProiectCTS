package ichim.proiect.cts;

public class Film extends Produs{

	private int durata;
		
	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public Film(String denumire, double pret) {
		super(denumire, pret);
	}

	@Override
	public String detaliiProdus() {
		return "Film: "+this.denumire+", pret: "+this.pret+", durata: "+this.durata;
	}

}
