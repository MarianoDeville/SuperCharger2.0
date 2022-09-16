package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Administracion;

public class CtrlAdministracion implements ActionListener{

	private Administracion ventanaAdministracion;

	public CtrlAdministracion(Administracion vista) {
		
		this.ventanaAdministracion = vista;
		this.ventanaAdministracion.btnEmitirInforme.addActionListener(this);
		this.ventanaAdministracion.btnGestionarLiquidaciones.addActionListener(this);
		this.ventanaAdministracion.btnVolver.addActionListener(this);
	}
	
	public void iniciar() {
		
		ventanaAdministracion.setVisible(true);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == ventanaAdministracion.btnVolver) {
			
			ventanaAdministracion.dispose();;
		}
	}

}
