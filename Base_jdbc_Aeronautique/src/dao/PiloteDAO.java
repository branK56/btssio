package dao;

import aeronautique.Pilote;

public abstract class PiloteDAO extends DAO<Pilote> {

	private static final String TABLE="Pilote";
	private static final String CLE_PRIMAIRE = "numPil";
	
	@Override
	public boolean create(Pilote pilote) {
		boolean succes = true;
		try {
			String requete = "INSERT INTO "+TABLE +" (nompil, adr, sal) VALUES (?, ?, ?,)";
			PrivateStatement stmt = connection.createStatement();
					
		}
	}
}
