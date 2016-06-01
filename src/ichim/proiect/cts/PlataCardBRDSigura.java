package ichim.proiect.cts;

public class PlataCardBRDSigura extends PlataBRD{
	
	public static String MESAJ_VERIFICARE="Se verifica PIN-ul...";
	public static String MESAJ_PIN_INCORECT="Pinul introdus nu este corect!";
	
	private PlataBRD plataBRD;
	
	public PlataCardBRDSigura(PlataBRD plataBRD){
		this.plataBRD=plataBRD;
	}
	
	private boolean verificaPIN(){
		System.out.println(MESAJ_VERIFICARE);
		return true;
	}
	
	public void plateste() throws ExceptiePINInvalid{
		if(verificaPIN())
			this.plataBRD.plateste();
		else
			throw new ExceptiePINInvalid(MESAJ_PIN_INCORECT);
	}
}
