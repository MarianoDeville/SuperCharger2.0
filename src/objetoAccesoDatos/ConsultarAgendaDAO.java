package objetoAccesoDatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConsultarAgendaDAO extends Conexion {
	
	public void registrarPersona () {
		
		try {
			
			this.conectar();
			PreparedStatement st = this.conexion.prepareStatement("INSERT INTO turnos (nombre) VALUEs(?)");
			st.setString(1, "pepito pistolero");
			st.executeUpdate();
		} catch (Exception e) {
			
			System.err.println(e.getMessage());
		} finally {
			
			this.cerrar();
		}
	}
	
	public String [][] areasTrabajo(String campo, String valor)  {
		
		String respuesta[][] = null;
		String armoStatement = "SELECT * FROM areatrabajo WHERE " + campo + " = '" + valor + "' GROUP BY especialidad";

		try {

			this.conectar();
			Statement stm = this.conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stm.executeQuery(armoStatement);
			rs.last();	
			respuesta = new String[rs.getRow()][3];
			rs.beforeFirst();
			int i=0;

			while (rs.next()) {
				
				respuesta[i][0] = rs.getInt(1) + "";
				respuesta[i][1] = rs.getString(2);
				respuesta[i][2] = rs.getString(3);
				respuesta[i][2] = rs.getString(4);
				i++;
			}
			
		} catch (Exception e) {
			
			System.err.println(e.getMessage());
		}finally {
			
			this.cerrar();
		}
		return respuesta;
	}
	

}
