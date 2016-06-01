package ichim.proiect.cts;

public class CardBRD extends MetodaPlata{

	private PlataBRD plataBRD;
	
	public void plata(){
		super.plata();
		System.out.println("Plata cu cardul BRD");
		plataBRD.plateste();
	}

	public PlataBRD getPlataBRD() {
		return plataBRD;
	}

	public void setPlataBRD(PlataBRD plataBRD) {
		this.plataBRD = plataBRD;
	}
	
}
