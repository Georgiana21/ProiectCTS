package ichim.proiect.cts;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Comanda {

	private String denumire;
	private StareComanda stareComanda;
	private List<Produs> listaProduse=new ArrayList<Produs>();
	
	public Comanda(String denumire){
		this.denumire=denumire;
		this.stareComanda=new ComandaNeachitata();
	}
	
	public void adaugaProdus(Produs produs){
		this.listaProduse.add(produs);
	}
	
	public void eliminaProdus(Produs produs){
		this.listaProduse.remove(produs);
	}
	
	public StareComanda getStareComanda() {
		return stareComanda;
	}

	public void setStareComanda(StareComanda stareComanda) {
		this.stareComanda = stareComanda;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public void salvareComanda() throws FileNotFoundException{
		PrintWriter writer=new PrintWriter(denumire+".txt");
		writer.write(stareComanda.getStare());
		for(Produs produs : listaProduse)
			writer.write(produs.detaliiProdus());
	}
	
	public void notificarePlata(){
		System.out.println("Plata a fost efectuata");
		stareComanda=new ComandaNeachitata();
	}
	
	public double calculSumaDePlata(){
		double suma=0;
		for(Produs produs : listaProduse)
			suma+=produs.pretFinal();
		return suma;
	}
	
	public void detaliiComanda(){
		this.stareComanda.detaliiStare();
	}
}
