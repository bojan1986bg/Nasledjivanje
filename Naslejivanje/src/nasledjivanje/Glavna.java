package nasledjivanje;

public class Glavna {

	public static void main (String [] args) {
		
		Svemirskiobjekat objekat = new Svemirskiobjekat("NGC 1290", 2000000); 
		
		
		objekat.dobrodosli("NGC 1290");
		 Planeta planeta = new Planeta("Zemlja", 678880, true);
		 
		
		 System.out.println(" Da li na planeti ima vode? Odgovor: " + planeta.voda);
		System.out.println( "Vi ste na planeti " + planeta.ime);		 
		planeta.dobrodosli(planeta.ime);
		

		
	}
}
