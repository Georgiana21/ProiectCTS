package ichim.proiect.cts;

public class ProdusAmbalatSimplu extends ProdusAmbalat{

	public ProdusAmbalatSimplu(Produs produs) {
		super(produs);
	}

	public double pretFinal(){
		return produsDecorat.pretFinal()+2;
	}
}