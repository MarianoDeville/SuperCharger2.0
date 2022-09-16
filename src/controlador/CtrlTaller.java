package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Taller;

public class CtrlTaller implements ActionListener{

	private Taller ventanaTaller;

	public CtrlTaller(Taller vista) {
		
		this.ventanaTaller = vista;
		this.ventanaTaller.btnCargarFicha.addActionListener(this);
		this.ventanaTaller.btnVolver.addActionListener(this);
	}
	
	public void iniciar() {
		
		ventanaTaller.setVisible(true);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == ventanaTaller.btnVolver) {
			
			ventanaTaller.dispose();;
		}
	}

}