package qliqs;

import java.sql.*;
 
public class BBDDManager {
	private String db = "qliqs";
	private String login = "admin";
	private String pwd = "Qliqs";
	private String url =  "jdbc:mysql://18.191.57.108/" + db 	;
	private Connection conexion;

	public BBDDManager() {
		try {
			System.out.println(url);
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(url, login, pwd);
			System.out.println("-> Conexión con MySQL establecida");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver JDBC No encontrado");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error al conectarse a la BD");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error general de Conexión");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		BBDDManager bbdd = new BBDDManager();
	}
}
