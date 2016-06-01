package ichim.proiect.cts;

public class AdaptorPlataBanci extends PlataCardBCR{

	private PlataBRD plataBRD;
	
	public AdaptorPlataBanci(PlataBRD plataBRD){
		this.plataBRD=plataBRD;
	}
	
	public void efectueazaPlata(){
		plataBRD.plateste();
		System.out.print(" utilizand adaptor BCR");
	}
}
