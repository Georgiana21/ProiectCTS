package ichim.proiect.cts;

public class AdaptorPlataBanci extends PlataCardBCR{

	public static String MESAJ_SUPLIMENTAR=" utilizand adaptor BCR";
	
	private PlataBRD plataBRD;
	
	public AdaptorPlataBanci(PlataBRD plataBRD){
		this.plataBRD=plataBRD;
	}
	
	public void efectueazaPlata() throws ExceptiePINInvalid{
		plataBRD.plateste();
		System.out.print(MESAJ_SUPLIMENTAR);
	}
}
