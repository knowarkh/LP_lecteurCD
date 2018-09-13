package datas;
public class Plage{
	/**
	Attributs de classe
	*/
	private Duree laDuree;
	private String leTitre;
	private String lInterprete;

	/**
	Constructeur d'une plage correspondant à un morceau
	*/
	public Plage(Duree duree, String titre, String interprete){
		this.laDuree=duree;
		this.leTitre=titre;
		this.lInterprete=interprete;
	}

	/**
	Accesseur renvoyant la durée
	*/
	public Duree getLaDuree(){
		return this.laDuree;
	}

	/**
	Accesseur renvoyant le titre du morceau
	*/
	public String getLeTitre(){
		return this.leTitre;
	}

	/**
	Accesseur renvoyant l'interprete(s)
	*/
	public String getLInterprete(){
		return this.lInterprete;
	}

	/**
	Accesseur renvoyant un texte décrivant la plage
	@return description de la plage en format texte 
	*/
	public String getFicheComplete(){
		String rep1="Description de la plage de musique :\n";
		String[] decoup = null;
  		String str = this.toString();
  		decoup=str.split(" - ");
		String rep2="Titre : "+decoup[0]+"\n";
		String rep3="Interprete : "+decoup[1]+"\n";
		String rep4="Duree : "+decoup[2]+"\n";
		return rep1+rep2+rep3+rep4;
	}

	/**
	Accesseur renvoyant un résumé textuel de la plage
	@return ligne de texte décrivant la plage
	*/
	@Override
	public String toString(){
		return this.leTitre+" - "+this.lInterprete+" - "+this.laDuree.enTexte('S');
	}
}