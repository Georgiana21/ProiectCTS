package ichim.proiect.cts;

public class ComandaNeachitata extends StareComanda{
	
	public static String MESAJ_NEACHITATA="Comanda nu este achitata!";

	@Override
	public void detaliiStare() {
		System.out.println(MESAJ_NEACHITATA);
	}

	@Override
	public String getStare() {
		return MESAJ_NEACHITATA;
	}

}
