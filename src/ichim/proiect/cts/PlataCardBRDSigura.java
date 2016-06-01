package ichim.proiect.cts;

public class PlataCardBRDSigura extends PlataBRD{

	private PlataBRD plataBRD;
	
	public PlataCardBRDSigura(PlataBRD plataBRD){
		this.plataBRD=plataBRD;
	}
	
	private boolean verificaPIN(){
		System.out.println("Se verifica PIN-ul...");
		return true;
	}
	
	public void plateste() throws ExceptiePINInvalid{
		if(verificaPIN())
			this.plataBRD.plateste();
		else
			throw new ExceptiePINInvalid("Pinul introdus nu este corect!");
	}
}
