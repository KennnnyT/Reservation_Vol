package gestionVol;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Vol{

	private String numero;
	private Aeroport depart;
	private Aeroport arrivee;
	private Compagnie compagnie;
	private Date dateDepart;
	private Date dateArrivee;
	private Escale escale;

	public Vol(){

	}
	
	public Duration duree() {
		if(this.dateDepart != null && this.dateArrivee != null) {	
			return Duration.of(dateArrivee.getTime() - dateDepart.getTime(), ChronoUnit.MILLIS);
		}
		return null;
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}
	
	public Compagnie getCompagnie(){
		return this.compagnie;
	}

	public void setCompagnie(Compagnie compagnie){
		if(compagnie != null) {
			compagnie.addVolWithoutBidirectionnal(this);
		}
		
		if(this.compagnie != null) {
			this.compagnie.removeVolWithoutBidirectionnal(this);
		}
		this.compagnie = compagnie;
	}
	
	protected void setCompagnieWithoutBidirectionnal(Compagnie compagnie){
		this.compagnie = compagnie;
	}

	public String getNumero(){
		return this.numero;
	}

	public void setNumero(String numero){
		this.numero = numero;
	}

	public Aeroport getDepart(){
		return this.depart;
	}

	public void setDepart(Aeroport depart){
		this.depart = depart;
	}

	public Aeroport getArrivee(){
		return this.arrivee;
	}

	public void setArrivee(Aeroport arrivee){
		this.arrivee = arrivee;
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			return ((Vol) obj).getNumero().equals(this.numero);
		}catch(Exception e){
			return false;
		}
	}

	public Escale getEscale() {
		return escale;
	}

	public void setEscale(Escale escale) {
		this.escale = escale;
	}
}
