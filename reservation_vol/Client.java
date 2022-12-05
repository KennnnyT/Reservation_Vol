
package gestionVol;


import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


// la classe client permet de nous aider a comprendre comment une reservation 
// pourait se derouler sur le point de vue d'un client  

public class Client {

    
    private String nom;

    private String achat;

    private String contact;    

    // on cree une liste histoire de gerer l'ordre de stockage 

    //private ArrayList<Reservation> reservations = new ArrayList<Reservation>();


    
    public Client( String nom ){
        this.nom = nom;
    }
    
    public void setName( String nom ){
        this.nom = nom; 
    }


    public String getName() {
        return this.nom;
    }

    public String getContact(){
        return this.contact;
    }

    public String getaAchat(){
        return this.achat;
    }


    
    public void setPayment( String achat ){
        this.achat = achat;
    }

    public void setContact( String contact ){
        this.contact = contact;
    }
    


  
    
    @Override
    public String toString(){
        String client = "";
        client += "\n\tClient\n";
        client += "\n Nom : " + this.nom;
        return client;
    }
}
