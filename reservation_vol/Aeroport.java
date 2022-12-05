package gestionVol;

public class Aeroport{
	private String nom;
	private String ville;

	public Aeroport( String nom , String ville){

		this.nom = nom ;
		this.ville = ville;
		
	}

	public String getNom(){
		return this.nom;
	}

	public void setNom(String nom){
		this.nom = nom;
	}

	public String getVille(){
		return this.ville;
	}

	public void setVille(String ville){
		this.ville = ville;
	}

	@Override
	public String toString (){
		return "Aeroport de depart " + this.nom + " de la ville de " + this.ville ;
	}


	public String toString2 (){
		return " Aeroport d'escalle " + this.nom + " de la ville "+ this.ville ; 
	}



	public String toString1 (){
		return "Aeroport d'arriver  " + this.ville  ;
	}
}
