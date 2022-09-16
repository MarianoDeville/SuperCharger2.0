package vista;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

public abstract class VentanaModelo extends JFrame {

	private static final long serialVersionUID = 1L;

	public VentanaModelo(String nombreVentana) {
		
		setTitle(nombreVentana);
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\Java\\Eclipse\\Supercharger\\Imagenes\\Logo.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(10, 10, 600, 500);
		setMinimumSize(new Dimension(600, 500));
	}
}
