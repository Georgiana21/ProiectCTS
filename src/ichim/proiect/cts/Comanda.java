package ichim.proiect.cts;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Comanda {
	
	public static String MESAJ_FINALIZARE_PLATA="Plata a fost efectuata";
	public static int NUMAR_CARACTERE_DENUMIRE=3;

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

	public void setDenumire(String denumire) throws ExceptieDenumireIncorecta {
		if(denumire==null || (denumire!=null && denumire.length()<NUMAR_CARACTERE_DENUMIRE))
			throw new ExceptieDenumireIncorecta(
					"Denumirea trebuie sa aiba cel putin "+NUMAR_CARACTERE_DENUMIRE+" caractere");
		this.denumire = denumire;
	}

	public void salvareComanda() throws FileNotFoundException{
		PrintWriter writer=new PrintWriter(denumire+".txt");
		writer.write(stareComanda.getStare());
		for(Produs produs : listaProduse)
			writer.write(produs.detaliiProdus());
		writer.close();
	}
	
	public void notificarePlata(){
		System.out.println(MESAJ_FINALIZARE_PLATA);
		stareComanda=new ComandaAchitata();
	}
	
	public double calculSumaDePlata(){
		double suma=0;
		for(Produs produs : listaProduse)
			suma+=produs.pretFinal();
		return Math.round(suma*100)/100.00;
	}
	
	public void detaliiComanda(){
		this.stareComanda.detaliiStare();
	}
}
