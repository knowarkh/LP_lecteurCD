package datas;
import java.util.ArrayList;
import java.io.*;

/**
La classe CD
@author ColletArnaud
*/
public class CD{
	/**
	Attributs de classe
	*/
	private String leTitreCD;
	private String lInterpreteCD;
	private ArrayList<Plage> lesPlages;

	/**
	Premier constructeur d'un CD (en 2 temps)
	*/
	public CD(String interpreteCD, String titreCD){
		this.lesPlages = new ArrayList<Plage>();
		this.lInterpreteCD=interpreteCD;
		this.leTitreCD=titreCD;
		this.graverCD();
	}

	/**
	Second constructeur d'un CD (à partir d'un fichier contenant toutes les informations)
	@param leFich nom du fichier texte à lire
	*/
	public CD(String leFich){
		this.graverCD(leFich);
	}

	/**
	Accesseur renvoyant le nbre de plages gravées sur le CD
	@return le nbre total de plages
	*/
	public int getNbrePlages(){
		return this.lesPlages.size();
	}

	/**
	Accesseur renvoyant le titre du CD
	@return le titre
	*/
	public String getLeTitreCD(){
		return this.leTitreCD;
	}

	/**
	Accesseur renvoyant le(les) interpretes du CD
	@return le(les) interpretes
	*/
	public String getLInterpreteCD(){
		return this.lInterpreteCD;
	}

	/**
	Accesseur qui calcule et renvoie la durée totale du CD
	@return la duree totale
	*/
	public Duree getDureeTotale(){
		Duree d = new Duree(0);
		for(int i = 0; i < this.getNbrePlages(); i++){
			d.ajoute(this.lesPlages.get(i).getLaDuree());
		}
		return d;
	}

	/**
	Accesseur renvoyant la plage n° index du CD
	@param index numero de la plage à renvoyer
	@return la plage recherchee
	*/
	public Plage getUnePlage(int index){
		Plage plage = new Plage(null, null, null);
		for(int i = 0; i < this.getNbrePlages(); i++){
			if (i==index-1){
				plage = this.lesPlages.get(i);
			}
		}
		return plage;
	}

	/**
	Methode privee gravant le CD (version simplifiée)
	*/
	private void graverCD(){
		Duree d1 = new Duree(0,3,30);
		Duree d2 = new Duree(0,4,10);
		Duree d3 = new Duree(0,5,40);
		Duree d4 = new Duree(0,3,50);
		Plage p1 = new Plage(d1,"title1","singer1");
		Plage p2 = new Plage(d2,"title2","singer1");
		Plage p3 = new Plage(d3,"title3","singer1");
		Plage p4 = new Plage(d1,"title4","singer2");
		this.lesPlages.add(p1);
		this.lesPlages.add(p2);
		this.lesPlages.add(p3);
		this.lesPlages.add(p4);
	}

	/**
	Methode privee gravant le CD à partir d'un fichier texte
	@param leFich fichier texte à lire
	*/
	private void graverCD(String leFich){
		this.lesPlages = new ArrayList<Plage>();
		boolean eof=false;

		String header;
		String[] decoup = null;
		String[] decoup2 = null;

		String tmp;
		BufferedReader tampon;
		try{
			tampon=new BufferedReader(new FileReader(leFich));

			header=tampon.readLine();
  			decoup=header.split(" / ");
  			this.leTitreCD=decoup[0];
			this.lInterpreteCD=decoup[1];
			
			while(!eof){
				tmp = tampon.readLine();
				
				if (tmp==null){
					eof=true;
				}
				else{
				
					decoup2=tmp.split(" / ");
					Duree d = new Duree(0,Integer.parseInt(decoup2[2]),Integer.parseInt(decoup2[3]));
                    Plage p = new Plage(d, decoup2[0], decoup2[1]);
                    lesPlages.add(p);
				}
			}
			tampon.close();
		}
		catch(FileNotFoundException e){
			System.out.println ("Le fichier n'a pas été trouvé "+e.getMessage());
		}
		catch(IOException e){
			System.out.println ("Erreur lors de la lecture "+e.getMessage());
		}	
	}
}