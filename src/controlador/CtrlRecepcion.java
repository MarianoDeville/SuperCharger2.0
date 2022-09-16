package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.ConsultarAgenda;
import vista.ListarTrabajos;
import vista.Recepción;
import vista.RegistroAsistencia;

public class CtrlRecepcion implements ActionListener {

	private Recepción ventanaRecepcion;
	
	public CtrlRecepcion(Recepción vista) {
		
		this.ventanaRecepcion = vista;
		this.ventanaRecepcion.btnConsultarAgenda.addActionListener(this);
		this.ventanaRecepcion.btnRegistrarAsistencia.addActionListener(this);
		this.ventanaRecepcion.btnListarTrabajos.addActionListener(this);
		this.ventanaRecepcion.btnVolver.addActionListener(this);
	}
	
	public void iniciar() {
		
		ventanaRecepcion.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == ventanaRecepcion.btnConsultarAgenda) {
			
			ConsultarAgenda ventanaAgenda = new ConsultarAgenda("Agenda");
			CtrlConsultaAgenda ctrl = new CtrlConsultaAgenda(ventanaAgenda);
			ctrl.iniciar();
			ventanaAgenda.setVisible(true);
		}
		
		if(e.getSource() == ventanaRecepcion.btnRegistrarAsistencia) {
			
			RegistroAsistencia ventanaRegistro = new RegistroAsistencia("Confirmar asistencia");
			CtrlRegistroAsistencia ctrl = new CtrlRegistroAsistencia(ventanaRegistro);
			ctrl.iniciar();
			ventanaRegistro.setVisible(true);
		}
		
		if(e.getSource() == ventanaRecepcion.btnListarTrabajos) {
			
			ListarTrabajos ventanaListarTrabajos = new ListarTrabajos("Listado de trabajos");
			CtrlListarTrabajos ctrl = new CtrlListarTrabajos(ventanaListarTrabajos);
			ctrl.iniciar();
			ventanaListarTrabajos.setVisible(true);
		}
		
		if(e.getSource() == ventanaRecepcion.btnVolver) {
			
			ventanaRecepcion.dispose();;
		}
	}
}