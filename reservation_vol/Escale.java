package gestionVol;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Escale {

    // on gere les escalles ici en etudiant le vole la durer et en retournant le temps d'escalle
    // et toute les informations concernant l'escalle 

    private Aeroport aeroport;
    private Date depart;
    private Date arrivee;
    private Duration duree;

    
    public Escale (Aeroport aeroport, Date depart, Date arrivee) {
        this.aeroport = aeroport;
        this.arrivee = arrivee;
        this.depart = depart;
        this.duree = Duration.of(arrivee.getTime() - depart.getTime(), ChronoUnit.MILLIS); 
    }

    // la methode tostring nous aides juste a afficher toutes informations 
    
    @Override
    public String toString() {
        String escale = "";
        escale += "\n\n\tESCALE\n";
        escale += "\n Aeroport : " + this.aeroport.toString() + "\n";
        escale += "\n Date d'arrivee : " + this.arrivee.toString() + "\n";
        escale += "\n Date de depart : " + this.depart.toString() + "\n";
        escale += "\n Duree : " + this.duree.toString().substring(2) + "\n";
        return escale;
    }
}
