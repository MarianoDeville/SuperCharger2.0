package modelo;

import objetoAccesoDatos.ConsultarAgendaDAO;

public class DtosConsultarAgenda {
	
	private String dias[];
	private String meses[];
	private Object tabla[][];
	private String nombreApellido;
	private ConsultarAgendaDAO agenda;
	
	public String [] getDias(int mes) {
		
		int n=31;
		
		if(mes == 2) 
			
			n = 28;
		if(mes == 4 || mes == 6 ||mes == 9 ||mes == 11 )
			
			n = 30;
		
		this.dias = new String[n];
		
		for(int i=0; i < n; i++ ) {
			
			dias[i] = i + 1 + "";
		}
			
		return dias;
	}
	
	public String [] getMeses() {
		
		meses = new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		return meses;
	}
	
	public String [] getEspecialidades() {
		
		agenda = new ConsultarAgendaDAO();
		String especialidades [][] = agenda.areasTrabajo("nombreArea", "Taller");
		String respuesta[] = new String [especialidades.length];

		for(int i=0 ; i < especialidades.length ; i++) {
			
			respuesta[i] = especialidades[i][2];
		}
		return respuesta;
	}
	
	public Object [][] getTabla(String especialidad) {

		tabla = new Object[9][3];
		
		for(int i = 0 ;i < 9 ;i++) {
			
			tabla[i][0] = i + 8 + ":00";
			
			if(especialidad.equals("Frenos"))
				
				tabla[i][1] = "Libre";
			else
				
				tabla[i][1] = "Ocupado";
			
			tabla[i][2] = false;
		}
		return tabla;
	}
	
	public String getNombreApellido() {
		
		return nombreApellido; 
	}
	
	public void setNombreApellido(String nombre) {
		
		nombreApellido = nombre;
	}
	
	public void agendarCita(String argumento[]) {
		
		System.out.println("Guardo en la base de datos la cita:");
		System.out.println("	Nombre: " + argumento[4]);
		System.out.println("	Hora: " + argumento[0]);
		System.out.println("	Día: " + argumento[1]);
		System.out.println("	Mes: " + argumento[2]);
		System.out.println("	Especialidad: " + argumento[3]);
	}

}
