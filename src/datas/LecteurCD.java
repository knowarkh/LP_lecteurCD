package datas;

/**
La classe LecteurCD
@author ColletArnaud
*/
public class LecteurCD {

    /**
    Attributs de classe
    */
    private boolean estCharge;
    private CD leCdCourant;
    private int indexPlage;
  
    /**
    Constructeur d'un lecteur CD
    */
    public LecteurCD(){
        this.estCharge=false;
        this.leCdCourant=null;
    }

    /**
    Accesseur renvoyant le temps total du CD chargé
    @return le temps total en chaine
    */
    public String getTempsTotal(){
        //Duree d = new Duree (this.leCdCourant.getDureeTotale());
        //return d.enTexte('H');
        return this.leCdCourant.getDureeTotale().enTexte('H');
    }

    /**
    Accesseur renvoyant le nbre de plages du CD
    @return le nbre de plages (-1 si aucun CD chargé)
    */
    public int getNbrePlages(){
        int rep=-1;
        if(estCharge()){
            rep=this.leCdCourant.getNbrePlages();
        }
        return rep;
    }

    /**
    Accesseur renvoyant l'index de la plage du CD en cours de lecture (compris entre 1 et nbPlages)
    @return l'index de la plage courante (0 si aucun CD chargé)
    */
    public int getIndexCourant(){
        int rep=0;
        if(estCharge()){
            rep=this.indexPlage;
        }
        return rep;
    }

    /**
    Accesseur renvoyant la plage en cours de lecture
    @return la plage courante (null si aucun CD chargé)
    */
    public Plage getPlageCourante(){
        return this.leCdCourant.getUnePlage(this.indexPlage);
    }

    /**
    Accesseur renvoyant vrai si le lecteur contient un CD
    @return booleen
    */
    public boolean estCharge(){
        return this.estCharge;
    }

    /**
    Accesseur renvoyant le CD chargé dans le lecteur
    @return le CD courant (null si aucun CD chargé) 
    */
    public CD getCD(){
        return this.leCdCourant;
    }

    /**
    Modificateur forcant le lecteur à se décharger
    */
    public void setDecharger(){
        this.estCharge=false;
        this.leCdCourant=null;
    }

    /**
    Modificateur chargeant un CD (version simplifiée)
    */
    public void chargerUnCd(){
        this.leCdCourant = new CD("lArtiste","leTitre");
        this.estCharge=true;
    }

    /**
    Modificateur chargeant un CD (CD construit à partir d'un fichier)
    @param leFich le nom du fichier à lire
    */
    public void chargerUnCd(String leFich){
        this.leCdCourant = new CD(leFich);
        this.estCharge=true;
    }
    
    /**
    Modificateur simulant la touche STOP
    */
    public void stop(){
        if(this.estCharge()){
            this.indexPlage=1;
        }
    }

    /**
    Modificateur simulant la touche PLAY
    */
    public void play(){
        if(this.estCharge()){
            this.indexPlage=1;
        }
    }

    /**
    Modificateur simulant la touche NEXT
    */
    public void next(){
        if(this.estCharge()){
            this.indexPlage++;
        }
    }

    /**
    Modificateur simulant la touche PREVIOUS
    */
    public void previous(){
        if(this.estCharge()){
            this.indexPlage--;
        }
    }
}