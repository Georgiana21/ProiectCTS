package ichim.proiect.cts;

public class Muzica extends Produs{
	
	private String album;
	
	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public Muzica(String denumire, double pret) {
		super(denumire, pret);
	}

}
