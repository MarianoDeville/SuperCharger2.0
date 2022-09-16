package objetoAccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	protected Connection conexion;
	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	private static final String URL= "jdbc:mysql://localhost:3306/lecsys?serverTimezone=UTC";
	private static final String USUARIO = "aplicacion";
	private static final String CLAVE = "proyectoLEC";

	public void conectar() throws Exception {
		
		try {
			
			conexion = DriverManager.getConnection(URL,USUARIO,CLAVE);
			Class.forName(CONTROLADOR);
		} catch (Exception e) {
			
			System.err.println("Error al acceder a la base de datos.");
			System.err.println(URL);
		}
		return;
	}
	
	public void cerrar() throws SQLException {
		
		if(conexion != null && !conexion.isClosed()) {
			
			conexion.close();
		}
	}
}