package ichim.proiect.cts;

public class ComandaAchitata extends StareComanda{

	@Override
	public void detaliiStare() {
		System.out.println("Comanda a fost achitata!");
	}

	@Override
	public String getStare() {
		return "Comanda a fost achitata!";
	}

}
