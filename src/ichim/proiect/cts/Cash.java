package ichim.proiect.cts;

public class Cash extends MetodaPlata{
	
	public static String MESAJ_PLATA="Plata cash";

	private PlataCash plataCash;
	
	public Cash(PlataCash plataCash){
		this.plataCash=plataCash;
	}
	
	public PlataCash getPlataCash() {
		return plataCash;
	}

	public void setPlataCash(PlataCash plataCash) {
		this.plataCash = plataCash;
	}

	public void plata() throws ExceptiePINInvalid{
		super.plata();
		System.out.println(MESAJ_PLATA);
		plataCash.plateste();
	}
}
