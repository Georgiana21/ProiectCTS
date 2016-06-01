package ichim.proiect.cts;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Magazin {
	
	public static String MESAJ_PRODUS_INEXISTENT="Nu exista acest tip de produse!";
	
	private static Magazin instantaMagazin;

	private List<MetodaPlata> listaPlati=new ArrayList<MetodaPlata>();
	
	private Magazin(){}
	
	public static Magazin getInstantaMagazin(){
		if(instantaMagazin==null)
			instantaMagazin=new Magazin();
		return instantaMagazin;
	}
	
	public void adaugaPlata(MetodaPlata plata){
		listaPlati.add(plata);
	}
	
	public void eliminaPlata(MetodaPlata plata){
		listaPlati.remove(plata);
	}
	
	public Produs getProdus(TipProdus tip, String denumire,double pret) throws ExceptieProdusInexistent{
		Produs produs=null;
		switch(tip){
		case FILM:
			produs=new Film(denumire,pret);
			break;
		case CARTE:
			produs=new Carte(denumire,pret);
			break;
		case MUZICA:
			produs=new Muzica(denumire,pret);
			break;
		default:
			throw new ExceptieProdusInexistent(MESAJ_PRODUS_INEXISTENT);
		}
		return produs;
	}
	
	public void inregistreazaPlata() throws ExceptiePINInvalid{
		MetodaPlata metodaPlata=listaPlati.get(0);
		metodaPlata.plata();
		listaPlati.remove(metodaPlata);
	}
	
	public void finalizareComanda(Client client, MetodaPlata metodaPlata) throws FileNotFoundException, ExceptiePINInvalid{
		client.achita();
		this.incaseazaPlata(metodaPlata);
		client.getComanda().salvareComanda();
	}
	
	public void incaseazaPlata(MetodaPlata metodaPlata) throws ExceptiePINInvalid{
		metodaPlata.plata();
	}
}
