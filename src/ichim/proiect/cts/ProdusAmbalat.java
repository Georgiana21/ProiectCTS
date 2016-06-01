package ichim.proiect.cts;

public abstract class ProdusAmbalat extends Produs{

	protected Produs produsDecorat;
	
	public ProdusAmbalat(Produs produs){
		this.produsDecorat=produs;
	}
}
