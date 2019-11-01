package nasledjivanje;

public class Svemirskiobjekat {
	
	public String ime;
	public double zapremina;
	
	
	
	public Svemirskiobjekat(String ime, double zapremina) {
		this.ime = ime;
		this.zapremina = zapremina; 
	}
	
	
	
	public void dobrodosli(String ime) {
		System.out.println("Dobrodosli na svemirski objekat " + ime);
	}

}
