package ichim.proiect.cts;

import java.util.ArrayList;
import java.util.List;

public abstract class MetodaPlata {

	private List<Comanda> colectieComenzi=new ArrayList<Comanda>();
	
	public void plata() throws ExceptiePINInvalid{
		notificareComenzi();
	}
	
	public void adaugaComanda(Comanda comanda){
		this.colectieComenzi.add(comanda);
	}
	
	public void eliminaComanda(Comanda comanda){
		this.colectieComenzi.remove(comanda);
	}
	
	public void notificareComenzi(){
		for(Comanda comanda : colectieComenzi)
			comanda.notificarePlata();
	}
}
