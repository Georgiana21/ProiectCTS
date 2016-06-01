package ichim.proiect.cts;

public class ComandaAchitata extends StareComanda{

	public static String MESAJ_ACHITATA="Comanda a fost achitata!";
	
	@Override
	public void detaliiStare() {
		System.out.println(MESAJ_ACHITATA);
	}

	@Override
	public String getStare() {
		return MESAJ_ACHITATA;
	}

}
