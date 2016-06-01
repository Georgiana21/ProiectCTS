package ichim.proiect.cts;

public class PlataCardBRD extends PlataBRD{
	
	public static String MESAJ_PLATA="Plata efectuata cu cardul BRD";

	private String PIN;
	
	public void plateste(){
		System.out.println(MESAJ_PLATA);
	}

	public String getPIN() {
		return PIN;
	}

	public void setPIN(String pIN) {
		PIN = pIN;
	}
}
