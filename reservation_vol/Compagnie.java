package gestionVol;

import java.util.ArrayList;
import java.util.Collection;

public class Compagnie {
	private String nom;
	private Collection<Vol> vols = new ArrayList<>();

	public Compagnie(){
	}

	public String getNom(){
		return this.nom;
	}

	public void setNom(String nom){
		this.nom = nom;
	}

	public Collection<Vol> getVols(){
		return this.vols;
	}

	public void setVols(Collection<Vol> vols){
		for(Vol v : this.vols) {
			v.setCompagnieWithoutBidirectionnal(null);
		}
		
		this.vols = vols;
		
		if(this.vols != null) {
			for(Vol v : this.vols) {
				v.setCompagnieWithoutBidirectionnal(this);
			}
		}
	}

	public void addVol(Vol vol){
		vol.setCompagnieWithoutBidirectionnal(this);
		this.vols.add(vol);
	}

	public void removeVol(Vol vol){
		vol.setCompagnieWithoutBidirectionnal(null);
		this.vols.remove(vol);
	}
	
	protected void setVolsWithoutBidirectionnal(Collection<Vol> vols){
		this.vols = vols;
	}

	protected void addVolWithoutBidirectionnal(Vol vol){
		this.vols.add(vol);
	}

	protected void removeVolWithoutBidirectionnal(Vol vol){
		this.vols.remove(vol);
	}
}
