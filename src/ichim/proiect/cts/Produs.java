package ichim.proiect.cts;

public class Produs {

	String denumire;
	double pret;
	
	public String getDenumire() {
		return denumire;
	}
	
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public double getPret() {
		return pret;
	}
	public void setPret(double pret) {
		this.pret = pret;
	}
	public Produs(String denumire, double pret) {
		super();
		this.denumire = denumire;
		this.pret = pret;
	}
	
	
}
