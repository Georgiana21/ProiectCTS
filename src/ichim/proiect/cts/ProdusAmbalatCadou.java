package ichim.proiect.cts;

public class ProdusAmbalatCadou extends ProdusAmbalat{

	public ProdusAmbalatCadou(Produs produs) {
		super(produs);
	}

	public double pretFinal(){
		return produsDecorat.pretFinal()+5;
	}
}
