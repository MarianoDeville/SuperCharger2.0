package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JButton;

public class Principal extends VentanaModelo {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btnRecepcion;
	public JButton btnAdministracion;
	public JButton btnTaller;
	public JButton btnRRHH;
	public JButton btnSalir;

	public Principal(String nombreVentana) {
		
		super(nombreVentana);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		btnRecepcion = new JButton("Recepción");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnRecepcion, 50, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnRecepcion, 30, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnRecepcion, 110, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnRecepcion, 180, SpringLayout.WEST, contentPane);
		contentPane.add(btnRecepcion);
		
		btnAdministracion = new JButton("Administración");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnAdministracion, 50, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnAdministracion, 200, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnAdministracion, 110, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnAdministracion, 350, SpringLayout.WEST, contentPane);
		contentPane.add(btnAdministracion);
		
		btnTaller = new JButton("Taller");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnTaller, 40, SpringLayout.SOUTH, btnRecepcion);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnTaller, 0, SpringLayout.WEST, btnRecepcion);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnTaller, 100, SpringLayout.SOUTH, btnRecepcion);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnTaller, 0, SpringLayout.EAST, btnRecepcion);
		contentPane.add(btnTaller);
		
		btnRRHH = new JButton("Recursos humanos");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnRRHH, 40, SpringLayout.SOUTH, btnAdministracion);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnRRHH, 0, SpringLayout.WEST, btnAdministracion);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnRRHH, 100, SpringLayout.SOUTH, btnAdministracion);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnRRHH, 0, SpringLayout.EAST, btnAdministracion);
		contentPane.add(btnRRHH);
		
		btnSalir = new JButton("Salir");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnSalir, -34, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnSalir, -35, SpringLayout.EAST, contentPane);
		contentPane.add(btnSalir);
	}
}
