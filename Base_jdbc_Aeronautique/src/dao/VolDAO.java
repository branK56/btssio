package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.GregorianCalendar;

import aeronautique.Vol;

/**
 * �tape 2 : le patron de conception DAO, le lien vers notre table PILOTE
 * On �tend la classe DAO avec un Pilote
 * @author abi
 *
 */
public class VolDAO extends DAO<Vol> {

	// 2 constantes de classe : le nom de la table, la cl� primaire


	/* !!! DATES : pour les bases de donn�es, on passera par java.sql.Timestamp 
	 * Pour le find :
	 * GregorianCalendar hArr = new GregorianCalendar();
	 * hArr.setTimeInMillis (rs.getTimestamp("harr").getTime());
	 * Pour le create :
	 * Timestamp ts = new Timestamp (vol.gethDep().getTimeInMillis());
	 * pst.setTimestamp(3,ts);
	 * 
	 * NB : les mois dans le constructeur de Gregorian Calendar vont de 0 � 11.
	 * 
	 * En utilisant SimpleDateFormat, on peut avoir un affichage avec des termes fran�ais.
	 * SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy zzzz G", Locale.FRENCH);
	 * 
	 */

	
	/**
	 * On donne un vol en entr�e qu'on va �crire dans la base de donn�es
	 * La requ�te � utiliser est un INSERT INTO
	 * On utilise encore TimeStamp
	 */
	@Override
	public boolean create(Vol obj) {

		boolean succes=true;
		try {
			// TODO Le prepared Statement pr�pare notre requete.
			// On peut utiliser les m�thodes setInt, setTimestamp, setString...
			// Puis on utilise executeUpdate

			// Ensuite, il faut remettre � jour l'identifiant de l'objet java,
			// g�n�r� automatiquement par la base de donn�es
		} catch (SQLException e) {
			succes=false;
			e.printStackTrace();
		}
		return succes;
	}

	/**
	 * On donne un vol en entr�e qu'on va supprimer de la base de donn�es
	 * La requ�te � utiliser est un DELETE FROM
	 * 
	 */
	@Override
	public boolean delete(Vol obj) {
		boolean succes=true;
		int id = obj.getNumVol();
		try {
			// TODO prepared Statement et executeUpdate
		} catch (SQLException e) {
			succes = false;
			e.printStackTrace();
		} 
		return succes;		
	}

	/**
	 * On donne un vol en entr�e qu'on va mettre � jour dans la base de donn�es
	 * La requ�te � utiliser est un UPDATE SET
	 * 
	 */
	@Override
	public boolean update(Vol obj) {
		boolean succes=true;


		try {
			// TODO requete, preparedStatement, setInt, setString, setTimeStamp etc. puis executeUpdate
		} catch (SQLException e) {
			succes = false;
			e.printStackTrace();
		} 
		return succes;	
	}

	/**
	 * On donne un identifiant entier en entr�e qu'on cherche dans la base de donn�es
	 * La requ�te � utiliser est un SELECT FROM WHERE avec la cl� primaire
	 * 
	 */
	@Override
	public Vol find(int id) {
		Vol vol = null;
		try {
			// TODO manipulation d'un resultSet, cr�ation d'un objet Vol
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vol;
	}



}
