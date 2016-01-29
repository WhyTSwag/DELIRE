package requests;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Requests {
	
	ResultSet savedRequest;
	
	//affiche les donn�es d'un patient
	public static void SELECT_PATIENT(Statement st, int id) throws SQLException {
		String sql="SELECT* FROM Patients WHERE patient_id=" + "'" + id + "';";
		System.out.println(sql);
		ResultSet set = st.executeQuery(sql);
	}
	
	//Filtre de recherche (nom, pr�nom, pathologie, adresse, etc�) 
	public static void SEARCH_DMP_BY_ID(Statement st, int id) throws SQLException {
		String sql="";
		System.out.println(sql);
		ResultSet set = st.executeQuery(sql);
	}
	
	
	// ======================================
	// =            Dossier  Ajouts         =
	// ======================================
	
	//affiche le DMP d'un patient par son ID , il faudra v�rifier qu'il n'est pas d�ja cr��
	public static void ADD_DMP(Statement st, int id) throws SQLException {
		String sql="";
		System.out.println(sql);
		ResultSet set = st.executeQuery(sql);
	}
	
	// Ajoute � la partie Prescription du dossier les ID du DMP et de la prescription
	public static void ADD_DMP_Prescription(Statement st, int DMP_ID, int PRESC_ID) throws SQLException {
		String sql="INSERT INTO Partie_Prescription VALUES ('"+ DMP_ID + "','" + PRESC_ID + "');";
		System.out.println(sql);
		ResultSet set = st.executeQuery(sql);
	}
	
	public static void ADD_DMP_Episode(Statement st, int DMP_ID, int EPISODE_ID) throws SQLException {
		String sql="INSERT INTO Partie_Prescription VALUES ('"+ DMP_ID + "','" + EPISODE_ID + "');";
		System.out.println(sql);
		ResultSet set = st.executeQuery(sql);
	}
	
	public static void ADD_DMP_Antecedent(Statement st, int DMP_ID, int ANTECEDENT_ID) throws SQLException {
		String sql="INSERT INTO Partie_Prescription VALUES ('"+ DMP_ID + "','" + ANTECEDENT_ID + "');";
		System.out.println(sql);
		ResultSet set = st.executeQuery(sql);
	}
	
	public static void ADD_DMP_Elements(Statement st, int DMP_ID, int ELEMENTS_ID) throws SQLException {
		String sql="INSERT INTO Partie_Prescription VALUES ('"+ DMP_ID + "','" + ELEMENTS_ID + "');";
		System.out.println(sql);
		ResultSet set = st.executeQuery(sql);
	}
	
	public static void ADD_DMP_Doc(Statement st, int DMP_ID, int DOC_ID) throws SQLException {
		String sql="INSERT INTO Partie_Prescription VALUES ('"+ DMP_ID + "','" + DOC_ID + "');";
		System.out.println(sql);
		ResultSet set = st.executeQuery(sql);
	}
	
	// ======================================
	// =            Dossier  SELECT         =
	// ======================================
		
	
	// ======================================
	// =            Description             =
	// ======================================

	public static void ADD_Prescription(Statement st, int id, String libelle, String dosage, String date_deb, String date_fin, int personnel_ID, String created) throws SQLException {
		String sql="INSERT INTO Prescriptions VALUES ('"+ id + "','" + libelle + "','" + dosage + "','" + date_deb + "','" + date_fin + "','" + personnel_ID + "','" + created + "');";
		System.out.println(sql);
		ResultSet set = st.executeQuery(sql);
	}
		
	public static void SELECT_Prescription(Statement st, int id) throws SQLException {
		String sql="";
		System.out.println(sql);
		ResultSet set = st.executeQuery(sql);
	}
	
	// ======================================
	// =            Episode 	              =
	// ======================================
	
	public static void ADD_Episode(Statement st, int id, String libelle, String date_deb, String date_derniere, String note, int personnel_ID, String created) throws SQLException {
		String sql="INSERT INTO Prescriptions VALUES ('"+ id + "','" + libelle + "','" + date_deb + "','" + date_derniere + "','" + note + "','" + personnel_ID + "','" + created + "');";
		System.out.println(sql);
		ResultSet set = st.executeQuery(sql);
	}
		
	public static void SELECT_Episode(Statement st, int id) throws SQLException {
		String sql="";
		System.out.println(sql);
		ResultSet set = st.executeQuery(sql);
	}
	
	// ======================================
	// =            Antecedent              =
	// ======================================
	
	public static void ADD_Antecedent(Statement st, int id, String libelle, String date_deb, String date_fin, String note, int personnel_ID, String created) throws SQLException {
		String sql="INSERT INTO Prescriptions VALUES ('"+ id + "','" + libelle + "','" + date_deb + "','" + date_fin + "','" + note + "','" + personnel_ID + "','" + created + "');";
		System.out.println(sql);
		ResultSet set = st.executeQuery(sql);
	}
		
	public static void SELECT_Antecedent(Statement st, int id) throws SQLException {
		String sql="";
		System.out.println(sql);
		ResultSet set = st.executeQuery(sql);
	}
	
	// ======================================
	// =            Elements Suivis         =
	// ======================================
	
	public static void ADD_Elements(Statement st, int id, String date_deb, String examen_type, String examen_libelle, int personnel_ID) throws SQLException {
		String sql="INSERT INTO Prescriptions VALUES ('"+ id + "','" + date_deb + "','" + examen_type + "','" + examen_libelle + "','" + personnel_ID + "');";
		System.out.println(sql);
		ResultSet set = st.executeQuery(sql);
	}
		
	public static void SELECT_Elements(Statement st, int id) throws SQLException {
		String sql="";
		System.out.println(sql);
		ResultSet set = st.executeQuery(sql);
	}
	
	// ======================================
	// =            Documents 	          =
	// ======================================
	public static void ADD_Doc(Statement st, int id, String contenu, float size_file, String created, int docType_ID) throws SQLException {
		String sql="INSERT INTO Prescriptions VALUES ('"+ id + "','" + contenu + "','" + size_file + "','" + created + "','" + docType_ID + "');";
		System.out.println(sql);
		ResultSet set = st.executeQuery(sql);
	}
		
	public static void SELECT_Doc(Statement st, int id) throws SQLException {
		String sql="";
		System.out.println(sql);
		ResultSet set = st.executeQuery(sql);
	}
}
