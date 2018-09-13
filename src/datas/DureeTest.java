package datas;
public class DureeTest{
	public static void main (String[] args){
		//Test unitaire du constructeur 1
		System.out.println ("==Test du constructeur 1==");
		testConstructeurDuree1();
		
		//Test unitaire du constructeur 2
		System.out.println ("==Test du constructeur 2==");
		testConstructeurDuree2();

		//Test unitaire du constructeur 3
		System.out.println ("==Test du constructeur 3==");
		testConstructeurDuree3();

		//Test unitaire de l'accesseur getLeTemps
		System.out.println ("==Test de getLeTemps()==");
		testGetLeTemps();
		
		//Test unitaire de l'accesseur compareA
		/*System.out.println ("==Test de compareA()==");
		testCompareA();*/

		//Test unitaire de la méthode enTexte
		/*System.out.println ("==Test de enTexte()==");
		testEnJHMS();*/
	}
	
	private static void testConstructeurDuree1(){
		System.out.println ("Test cas normal");
		Duree d = new Duree(3000);
		long t = d.getLeTemps();
		if (t==3000){
			System.out.println ("Test reussi");
		}else{
			System.out.println ("Echec du test");
		}
		
		System.out.println ("Test cas d'erreur");
		Duree d1 = new Duree(-1000);
		
		System.out.println ("Test cas limite");
		Duree d2 = new Duree(0);
	}

	private static void testConstructeurDuree2(){
		System.out.println ("Test cas normal");
		Duree d = new Duree(3,3,3);
		long t = d.getLeTemps();
		if (t==10983000){
			System.out.println ("Test reussi");
		}else{
			System.out.println ("Echec du test");
		}
	}

	private static void testConstructeurDuree3(){
		System.out.println ("Test cas normal");
		Duree d1 = new Duree(500);
		Duree d2 = new Duree(d1);
		long t = d2.getLeTemps();
		if (t==500){
			System.out.println ("Test reussi");
		}else{
			System.out.println ("Echec du test");
		}

	}

	private static void testGetLeTemps(){
		System.out.println ("Test cas normal");
		Duree d = new Duree(5000);
		if(d.getLeTemps()==5000){
			System.out.println ("Test reussi");
		}else{
			System.out.println ("Echec du test");
		}
	}
	
/*	private static void testCompareA(){
		System.out.println ("Test cas normal");
		System.out.println ("Test cas d'erreur");
		System.out.println ("Test cas limite");
	}

	private static void testEnTexte(){
		System.out.println ("Test cas normal");
		System.out.println ("Test cas d'erreur");
		System.out.println ("Test cas limite");
	}

	private static void testAjoute(){
		System.out.println ("Test cas normal");
		System.out.println ("Test cas d'erreur");
		System.out.println ("Test cas limite");
	}*/

}