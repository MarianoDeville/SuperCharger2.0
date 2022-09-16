package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.ListarTrabajos;

public class CtrlListarTrabajos implements ActionListener {

	private ListarTrabajos ventanaListarTrabajos;
	
	public CtrlListarTrabajos(ListarTrabajos vista) {
		
		this.ventanaListarTrabajos = vista;
		this.ventanaListarTrabajos.btnImprimir.addActionListener(this);
		this.ventanaListarTrabajos.btnVolver.addActionListener(this);
	}
	
	public void iniciar() {
		
		ventanaListarTrabajos.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == ventanaListarTrabajos.btnImprimir) {
			
	/*		ConsultarAgenda ventanaAgenda = new ConsultarAgenda("Agenda");
			CtrlConsultaAgenda ctrl = new CtrlConsultaAgenda(ventanaAgenda);
			ctrl.iniciar();
			ventanaAgenda.setVisible(true);*/
		}

		
		if(e.getSource() == ventanaListarTrabajos.btnVolver) {
			
			ventanaListarTrabajos.dispose();;
		}
	}
}