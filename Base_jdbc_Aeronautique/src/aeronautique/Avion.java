package aeronautique;

public class Avion {
	private final int numAv;
	private String nomAv;
	private final int capacite;
	private String loc;
	
	public Avion(int numAv, String nomAv, int capacite, String loc) {
		super();
		this.numAv = numAv;
		this.nomAv = nomAv;
		this.capacite = capacite;
		this.loc = loc;
	}

	public String getNomAv() {
		return nomAv;
	}

	public void setNomAv(String nomAv) {
		this.nomAv = nomAv;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public int getNumAv() {
		return numAv;
	}

	public int getCapacite() {
		return capacite;
	}

	@Override
	public String toString() {
		return "Avion [numAv=" + numAv + ", nomAv=" + nomAv + ", capacite=" + capacite + ", loc=" + loc + "]";
	}


	
}
