package aeronautique;

public class Pilote {
	private final int numPil;
	private String nomPil;
	private String adr;
	private final int sal;
	
	public Pilote(int numPil, String nomPil, String adr, int sal) {
		super();
		this.numPil = numPil;
		this.nomPil = nomPil;
		this.adr = adr;
		this.sal = sal;
	}
	public String getNomPil() {
		return nomPil;
	}
	public void setNomPil(String nomPil) {
		this.nomPil = nomPil;
	}
	public String getAdr() {
		return adr;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	public int getNumPil() {
		return numPil;
	}
	public int getSal() {
		return sal;
	}
	@Override
	public String toString() {
		return "Pilote [numPil=" + numPil + ", nomPil=" + nomPil + ", adr=" + adr + ", sal=" + sal + "]";
	}
	
	
	

}
