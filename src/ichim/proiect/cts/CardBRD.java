package ichim.proiect.cts;

public class CardBRD extends MetodaPlata{

	public static String MESAJ_PLATA="Plata cu cardul BRD";
	
	private PlataBRD plataBRD;
	
	public CardBRD(PlataBRD plataBRD){
		this.plataBRD=plataBRD;
	}
	
	public void plata() throws ExceptiePINInvalid{
		super.plata();
		System.out.println(MESAJ_PLATA);
		plataBRD.plateste();
	}

	public PlataBRD getPlataBRD() {
		return plataBRD;
	}

	public void setPlataBRD(PlataBRD plataBRD) {
		this.plataBRD = plataBRD;
	}
	
}
