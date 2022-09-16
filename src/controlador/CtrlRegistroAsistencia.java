package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.RegistroAsistencia;

public class CtrlRegistroAsistencia implements ActionListener {

	private RegistroAsistencia ventanaAsistencia;
	
	public CtrlRegistroAsistencia(RegistroAsistencia vista) {
		
		this.ventanaAsistencia = vista;
		this.ventanaAsistencia.btnRegistrar.addActionListener(this);
		this.ventanaAsistencia.btnVolver.addActionListener(this);
	}
	
	public void iniciar() {
		
		ventanaAsistencia.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		

		if(e.getSource() == ventanaAsistencia.btnRegistrar) {
			
	/*		RegistroAsistencia ventanaRegistro = new RegistroAsistencia("");
			CtrlVentRecepcion ctrl = new CtrlVentRecepcion(ventanaRegistro);
			ctrl.iniciar();
			ventanaRecepcion.setVisible(true);*/
			
		}
		
		if(e.getSource() == ventanaAsistencia.btnVolver) {
			
			ventanaAsistencia.dispose();;
		}
	}
}