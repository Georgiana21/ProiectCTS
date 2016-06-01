package ichim.proiect.cts;

public class Cash extends MetodaPlata{

	private PlataCash plataCash;
	
	public PlataCash getPlataCash() {
		return plataCash;
	}

	public void setPlataCash(PlataCash plataCash) {
		this.plataCash = plataCash;
	}

	public void plata(){
		super.plata();
		System.out.println("Plata cash");
		plataCash.plateste();
	}
}
