package ichim.proiect.cts;

public class CardBCR extends MetodaPlata{

	private PlataCardBCR plataBCR;
	
	public void plata(){
		super.plata();
		System.out.println("Plata card BCR");
		plataBCR.efectueazaPlata();
	}

	public PlataCardBCR getPlataBCR() {
		return plataBCR;
	}

	public void setPlataBCR(PlataCardBCR plataBCR) {
		this.plataBCR = plataBCR;
	}
	
}
