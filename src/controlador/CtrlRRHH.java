package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.RRHH;

public class CtrlRRHH implements ActionListener{

	private RRHH ventanaRRHH;

	public CtrlRRHH(RRHH vista) {
		
		this.ventanaRRHH = vista;
		this.ventanaRRHH.btnVolver.addActionListener(this);
	}
	
	public void iniciar() {
		
		ventanaRRHH.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == ventanaRRHH.btnVolver) {
			
			ventanaRRHH.dispose();;
		}
	}
}
