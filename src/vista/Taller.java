package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class Taller extends VentanaModelo {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btnCargarFicha;
	public JButton btnVolver;

	public Taller(String nombreVentana) {
		
		super(nombreVentana);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		btnCargarFicha = new JButton("Cargar ficha");
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCargarFicha, 220, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCargarFicha, 50, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCargarFicha, 30, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnCargarFicha, 110, SpringLayout.NORTH, contentPane);
		contentPane.add(btnCargarFicha);
		
		btnVolver = new JButton("Volver");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnVolver, -22, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnVolver, -22, SpringLayout.EAST, contentPane);
		contentPane.add(btnVolver);
	}

}
