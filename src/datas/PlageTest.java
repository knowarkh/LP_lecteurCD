package datas;
public class PlageTest{
	public static void main (String[] args){

		//Test unitaire du constructeur
		System.out.println ("==Test du constructeur==");
		testConstructeurPlage();

		//Test unitaire de l'accesseur toString()
		System.out.println ("==Test de toString()==");
		testToString();

		//Test unitaire de l'accesseur getFicheComplete()
		System.out.println ("==Test de getFicheComplete()==");
		testGetFicheComplete();
	}

	private static void testConstructeurPlage(){
		System.out.println ("Test cas normal");
	}

	private static void testToString(){
		System.out.println ("Test cas normal");
		Duree d = new Duree(500);
		Plage p = new Plage(d, "With You", "Bazin");
		System.out.println (p.toString());
	}

	private static void testGetFicheComplete(){
		System.out.println ("Test cas normal");
		Duree d = new Duree(500);
		Plage p = new Plage(d, "With You", "Bazin");
		System.out.println (p.getFicheComplete());
	}
}