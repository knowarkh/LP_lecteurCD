package datas;

/**
La classe Duree
@author ColletArnaud
*/
public class Duree{
	/**
	Attribut exprimé en millisecondes
	*/
	private long leTemps;
	
	//---Surcharge constructeur---
	/**
	Premier constructeur de la classe
	*/
	public Duree(long millisec){
		if (millisec>0){
			this.leTemps=millisec;
		}else{
			System.out.println("Duree impossible");
		}
	}
	
	/**
	Second constructeur de la classe
	*/
	public Duree(int heures, int minutes, int secondes){
		if(heures>=0 && minutes>=0 && secondes>=0){
			this.leTemps = heures*3600000 + minutes*60000 + secondes*1000;
		}else{
			System.out.println("Duree impossible");
		}
	}
	
	/**
	Troisieme constructeur de la classe
	*/
	public Duree(Duree autreDuree){
		long d = autreDuree.getLeTemps();
		if(d>0){
			this.leTemps=d;
		}else{
			System.out.println("Duree impossible");
		}			
	}
	
	/**
	Accesseur retournant la valeur de la duréé courante en millisec
	@return la durée en millisec
	*/
	public long getLeTemps(){
		return this.leTemps;
	}
	
	/**
	Accesseur effectuant la comparaison entre la durée courante et une autre durée
	@param autreDuree
	@return un entier prenant -1,0,1
	*/
	public int compareA(Duree autreDuree){
		int rep=0;
		if(this.getLeTemps()<autreDuree.getLeTemps()){
			rep=-1;
		}else if(this.getLeTemps()>autreDuree.getLeTemps()){
			rep=1;
		}
		return rep;
	}
	
	/**
	Accesseur renvoyant sous la forme d'une chaine de caracteres la duree courante
	@param mode 
	@return la durée sous la forme d'une chaine de characteres
	*/
	public String enTexte(char mode){
		String rep="";
		int res[]= this.enJHMS();
		switch (mode){
			case 'J':
				rep=res[0]+" jours "+res[1]+" h";
				break;
			case 'H':
				rep=res[1]+":"+res[2]+":"+res[3];
				break;
			case 'S':
				rep=res[3]+"."+res[4]+" sec";
				break;
			case 'M':
				rep=res[4]+" millisec";
				break;
			default:
				System.out.println("Erreur");
		}
		return rep;
	}
	
	/**
	Modificateur ajoutant une durée à la durée courante
	@param autreDuree
	*/
	public void ajoute(Duree autreDuree){
		this.leTemps += autreDuree.getLeTemps();
	}
	
	/**
	Methode privee découpant la durée courante en intervalles
	@return un tableau d'entiers
	*/
	private int[] enJHMS(){

		int[] rep = new int[5];
		int t = (int) this.leTemps;
		int jours=0;
		int heures=0;
		int minutes=0;
		int secondes=0;
		int millisecondes=0;

		millisecondes=t%1000;
		t=t/1000;
		secondes=t%60;
		t=t/60;
		minutes=t%60;
		t=t/60;
		heures=t%24;
		t=t/24;
		jours=t;

		rep[0] = jours;
		rep[1] = heures;
		rep[2] = minutes;
		rep[3] = secondes;
		rep[4] = millisecondes;

		return rep;
	}
}