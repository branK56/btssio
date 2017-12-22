package aeronautique;

import controleur.Controleur;
import dao.Connexion;

/**
 * - Il faut commencer par faire le métier, puis regarder la classe Connexion,
 * puis le Design Pattern DAO sur la table VOL - Ensuite on étend aux autres
 * tables AVION et PILOTE - faire quelques vérifications de base sur la table
 * vol : lors du create, est-ce que les clés étrangères sont dans la table. Il
 * faut lever une exception précise dans le cas contraire. - Essayer des
 * requêtes plus complexes et les proposer dès le menu. - Algorithmique :
 * soigner l'affichage des réponses pour avoir un titre aux colonnes et qu'elles
 * soient de largeur fixe.
 * 
 * Si vous utilisez le type Money sous SQL Server Express, il faut utiliser
 * DECIMAL avec JDBC et java.math.BigDecimal pour java.
 * 
 * @author abi
 *
 */
public class Principale {

	public static void main(String[] args) {

		// new Controleur();
		// Connexion.fermer();

		// Connexion conect= new Connexion();
		// conect.getInstance();
		// Connexion.fermer();

		//initialisation();
		testAfficheEtoile();

	}


	public static void testAfficheEtoile() {
		Connexion.afficheSelectEtoile("PILOTE", "numPil>0");
		Connexion.fermer();
		
	}

	
	public static void initialisation() {
		String dropTablePilote = "DROP TABLE PILOTE;";
		String createTablePilote = "CREATE TABLE PILOTE\r\n" + 
				"(\r\n" + 
				"	numPil int primary key not NULL identity(1,1),\r\n" + 
				"	nomPil varchar(50) not NULL,\r\n" + 
				"	adr varchar(50) not NULL,\r\n" + 
				"	sal int not NULL \r\n" + 
				");";
		
		String dropTableAvion = "DROP TABLE AVION";
		String createTableAvion = "CREATE TABLE AVION\r\n" + 
				"(\r\n" + 
				"	numAv int primary key not NULL identity(1,1),\r\n" + 
				"	nomAv varchar(50) not NULL,\r\n" + 
				"	capacite int not NULL,\r\n" + 
				"	loc varchar(50) not NULL\r\n" + 
				");";
		
		String dropTableVol = "DROP TABLE VOL";
		String createTableVol ="CREATE TABLE VOL\r\n" + 
				"(\r\n" + 
				"	numVol int primary key not NULL identity(1,1),\r\n" + 
				"	numPil int foreign key REFERENCES PILOTE(numPil) not NULL, \r\n" + 
				"	numAv int foreign key REFERENCES AVION(numAv) not NULL,\r\n" + 
				"	villeDepart varchar(50) not NULL,\r\n" + 
				"	villeArrivee varchar(50) not NULL,\r\n" + 
				"	hDep SMALLDATETIME not NULL,\r\n" + 
				"	hArr SMALLDATETIME not NULL\r\n" + 
				");";
		String insertionValeurPilote = "INSERT INTO PILOTE (nomPil, adr, sal)\r\n" + 
				"VALUES	('Dupont','Paris','1850'),\r\n" + 
				"		('Durand','Lens','1850'),\r\n" + 
				"		('Martin','Rennes','1700'),\r\n" + 
				"		('Nadine','Vannes','2400'),\r\n" + 
				"		('Fred','Bordeaux','2105'),\r\n" + 
				"		('Jean-Marc','Nice','3400');";
		
		String insertionValeurAvion = "INSERT INTO AVION (nomAv,capacite,loc)\r\n" + 
				"VALUES	('Airbus','500','Rennes'),\r\n" + 
				"		('Boeing','350','Marseille'),\r\n" + 
				"		('Boeing','650','Paris'),\r\n" + 
				"		('Airbus','200','Strasbourg'),\r\n" + 
				"		('Airbus','620','Clermond-Ferrand'),\r\n" + 
				"		('ULM','6','Quiberon');";
		
		String insertionValeurVol = "INSERT INTO VOL --(numPil,numAv,villeDepart,villeArrivee,hDep,hArr)\r\n" + 
				"VALUES	(1,6,'Vannes','Lorient','27-11-2017 09:00:00','27-11-2017 12:30:00'),\r\n" + 
				"		(4,4,'Brest','Paris','27-11-2017 14:47:00','27-11-2017 16:14:00'),\r\n" + 
				"		(2,5,'Rennes','Clermond-Ferrand','27-11-2017 08:00:00','27-11-2017 12:00:00'),\r\n" + 
				"		(3,4,'Brest','Bordeaux','27-11-2017 10:15:00','27-11-2017 11:55:00'),\r\n" + 
				"		(4,3,'Paris','Biarritz','27-11-2017 09:00:00','27-11-2017 13:00:00'),\r\n" + 
				"		(5,2,'Strasbourg','Nice','27-11-2017 09:15:00','27-11-2017 17:00:00'),\r\n" + 
				"		(6,1,'Nice','Marseille','27-11-2017 09:25:00','27-11-2017 12:30:00'),\r\n" + 
				"		(5,2,'Marseille','Strasbourg','27-11-2017 09:00:00','27-11-2017 12:45:00'),\r\n" + 
				"		(4,3,'Biarritz','Paris','27-11-2017 10:00:00','27-11-2017 15:15:00'),\r\n" + 
				"		(3,4,'Bordeaux','Brest','27-11-2017 11:00:00','27-11-2017 16:15:00'),\r\n" + 
				"		(2,5,'Clermond-Ferrand','Rennes','27-11-2017 14:00:00','27-11-2017 17:30:00'),\r\n" + 
				"		(1,6,'Quiberon','Vannes','27-11-2017 15:00:00','27-11-2017 19:00:00');";
		
		
		
		Connexion.executeUpdate(dropTableVol);
		Connexion.executeUpdate(dropTablePilote);
		Connexion.executeUpdate(dropTableAvion);

		Connexion.executeUpdate(createTablePilote);
		Connexion.executeUpdate(createTableAvion);
		Connexion.executeUpdate(createTableVol);
		
		Connexion.executeUpdate(insertionValeurPilote);
		Connexion.executeUpdate(insertionValeurAvion);
		Connexion.executeUpdate(insertionValeurVol);
		
	
		Connexion.fermer();
		
	}
}
