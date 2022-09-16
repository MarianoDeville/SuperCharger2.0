package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Administracion;
import vista.Principal;
import vista.RRHH;
import vista.Recepción;
import vista.Taller;


public class CtrlPrincipal implements ActionListener{
	
	private Principal ventanaPrincipal;

	public CtrlPrincipal(Principal vista) {
		
		this.ventanaPrincipal = vista;
		this.ventanaPrincipal.btnRecepcion.addActionListener(this);
		this.ventanaPrincipal.btnAdministracion.addActionListener(this);
		this.ventanaPrincipal.btnRRHH.addActionListener(this);
		this.ventanaPrincipal.btnSalir.addActionListener(this);
		this.ventanaPrincipal.btnTaller.addActionListener(this);
	}
	
	public void iniciar() {
		
		ventanaPrincipal.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == ventanaPrincipal.btnRecepcion) {

			Recepción ventanaRecepcion = new Recepción("Recepción");
			CtrlRecepcion ctrl = new CtrlRecepcion(ventanaRecepcion);
			ctrl.iniciar();
			ventanaRecepcion.setVisible(true);
		}
		
		if(e.getSource() == ventanaPrincipal.btnAdministracion) {
			
			Administracion ventanaAdministracion = new Administracion("Administración");
			CtrlAdministracion ctrlAdmin = new CtrlAdministracion(ventanaAdministracion);
			ctrlAdmin.iniciar();
		}
		
		if(e.getSource() == ventanaPrincipal.btnRRHH) {
			
			RRHH ventanaRRHH = new RRHH("Recursos humanos");
			CtrlRRHH ctrlRRHH = new CtrlRRHH(ventanaRRHH);
			ctrlRRHH.iniciar();
		}

		if(e.getSource() == ventanaPrincipal.btnTaller) {
			
			Taller ventanaAdministracion = new Taller("Taller");
			CtrlTaller ctrlTaller = new CtrlTaller(ventanaAdministracion);
			ctrlTaller.iniciar();
		}
		
		if(e.getSource() == ventanaPrincipal.btnSalir) {
			
			System.exit(0);
		}
	}
}
