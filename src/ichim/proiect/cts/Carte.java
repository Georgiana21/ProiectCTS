package ichim.proiect.cts;

public class Carte extends Produs{

	private String gen;
	
	public String getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
	}

	public Carte(String denumire, double pret) {
		super(denumire, pret);
	}

	@Override
	public String detaliiProdus() {
		return "Carte: "+this.denumire+", pret: "+this.pret+", gen: "+this.gen;
	}

}
