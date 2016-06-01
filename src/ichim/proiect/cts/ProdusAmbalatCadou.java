package ichim.proiect.cts;

public class ProdusAmbalatCadou extends ProdusAmbalat{
	
	public static double PRET_AMBALAJ=5;
	public static String MESAJ_AMBALAT=", ambalat pentru cadou";

	public ProdusAmbalatCadou(Produs produs) {
		super(produs);
	}

	public double pretFinal(){
		return produsDecorat.pretFinal()+PRET_AMBALAJ;
	}

	@Override
	public String detaliiProdus() {
		return produsDecorat.detaliiProdus()+MESAJ_AMBALAT;
	}
}
