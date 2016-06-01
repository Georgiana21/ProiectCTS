package ichim.proiect.cts;

public abstract class Produs {
	
	public static double TVA=0.24;

	String denumire;
	double pret;
	
	public Produs(){
		
	}
	
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
	
	public double pretFinal(){
		return pret*(1+TVA);
	}
	
	public abstract String detaliiProdus();
}
