package objetoAccesoDatos;

import java.sql.PreparedStatement;

public class ConsultarAgendaDAO extends Conexion {
	
	public void registrarPersona () throws Exception {
		
		try {
			
			this.conectar();
			PreparedStatement st = this.conexion.prepareStatement("INSERT INTO turnos (nombre) VALUEs(?)");
			st.setString(1, "pepito pistolero");
			st.executeUpdate();
		} catch (Exception e) {
			
			System.err.println(e);
		} finally {
			
			this.cerrar();
		}
		
		
	}

}
