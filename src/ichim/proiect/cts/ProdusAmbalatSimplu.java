package ichim.proiect.cts;

public class ProdusAmbalatSimplu extends ProdusAmbalat{
	
	public static double PRET_AMBALAJ=2;
	public static String MESAJ_AMBALAT=", ambalat simplu";

	public ProdusAmbalatSimplu(Produs produs) {
		super(produs);
	}

	public double pretFinal(){
		return produsDecorat.pretFinal()+2;
	}

	@Override
	public String detaliiProdus() {
		return produsDecorat.detaliiProdus()+MESAJ_AMBALAT;
	}
}
