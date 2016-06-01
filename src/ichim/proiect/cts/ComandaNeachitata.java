package ichim.proiect.cts;

public class ComandaNeachitata extends StareComanda{

	@Override
	public void detaliiStare() {
		System.out.println("Comanda nu este achitata!");
	}

	@Override
	public String getStare() {
		return "Comanda nu este achitata!";
	}

}
