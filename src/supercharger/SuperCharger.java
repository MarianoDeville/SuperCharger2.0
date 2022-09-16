package supercharger;

import controlador.CtrlPrincipal;
import vista.Principal;

public class SuperCharger {

	public static void main(String[] args) {
		
		Principal vista = new Principal("Ventana principal");
		CtrlPrincipal ctrl = new CtrlPrincipal(vista);
		ctrl.iniciar();
	}
}
