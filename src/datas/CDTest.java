package datas;
public class CDTest{
	public static void main (String[] args){

		//Test unitaire du constructeur 1
		System.out.println ("==Test du constructeur 1==");
		testConstructeurCD1();
		
		//Test unitaire du constructeur 2
		System.out.println ("==Test du constructeur 2==");
		testConstructeurCD2();

		//Test unitaire de l'accesseur getNbrePlages
		System.out.println ("==Test de getNbrePlages()==");
		testGetNbrePlages();

		//Test unitaire de la methode privee graverCD 2
		System.out.println ("==Test de graverCD(leFich)==");
		testGraverCD2();
	}

	private static void testConstructeurCD1(){
		System.out.println ("Test cas normal");
		CD cd = new CD("Test","Test");
		System.out.println(cd.toString());
		if(cd.getNbrePlages()==4){
				System.out.println ("Test reussi");
		}else{
			System.out.println ("Echec du test");
		}
	}

	private static void testConstructeurCD2(){
		System.out.println ("Test cas normal");
		CD cd = new CD("monCD.txt");
	}

	private static void testGetNbrePlages(){
		System.out.println ("Test cas normal");
	}

	private static void testGraverCD2(){
		System.out.println ("Test cas normal");
	}
}