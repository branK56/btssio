package aeronautique;

import java.util.GregorianCalendar;

/**
 * étape 0 : les classes métier : le vol
 * on regarde les types de la table VOL
 * @author abi
 *
 */

public class Vol {
	
	private Pilote pilote;
	private Avion avion;
	private String Ville_Dep;
	private String Ville_Arr;
	private GregorianCalendar H_Dep;
	private GregorianCalendar H_Arr;

	

	// Constructeur sur les champs.
	
	public Vol(Pilote pilote, Avion avion, String ville_Dep, String ville_Arr, GregorianCalendar h_Dep,
			GregorianCalendar h_Arr) {
		super();
		this.pilote = pilote;
		this.avion = avion;
		Ville_Dep = ville_Dep;
		Ville_Arr = ville_Arr;
		H_Dep = h_Dep;
		H_Arr = h_Arr;
	}



	public Pilote getPilote() {
		return pilote;
	}



	public void setPilote(Pilote pilote) {
		this.pilote = pilote;
	}



	public Avion getAvion() {
		return avion;
	}



	public void setAvion(Avion avion) {
		this.avion = avion;
	}



	public String getVille_Dep() {
		return Ville_Dep;
	}



	public void setVille_Dep(String ville_Dep) {
		Ville_Dep = ville_Dep;
	}



	public String getVille_Arr() {
		return Ville_Arr;
	}



	public void setVille_Arr(String ville_Arr) {
		Ville_Arr = ville_Arr;
	}



	public GregorianCalendar getH_Dep() {
		return H_Dep;
	}



	public void setH_Dep(GregorianCalendar h_Dep) {
		H_Dep = h_Dep;
	}



	public GregorianCalendar getH_Arr() {
		return H_Arr;
	}



	public void setH_Arr(GregorianCalendar h_Arr) {
		H_Arr = h_Arr;
	}



	
	@Override
	public String toString() {
		return "Vol [pilote=" + pilote + ", avion=" + avion + ", Ville_Dep=" + Ville_Dep + ", Ville_Arr=" + Ville_Arr
				+ ", H_Dep=" + H_Dep + ", H_Arr=" + H_Arr + "]";
	}
	

}
