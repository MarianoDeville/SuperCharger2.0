package vista;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class RegistroAsistencia extends VentanaModelo {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollTablaAsistencia;
	private JScrollPane scrollClientes;
	public JTable asistencia;
	public JTable clientes;
	public JButton btnVolver;
	public JButton btnRegistrar;
	public JTextField txtBusquedaCliente;
	public JLabel lblCliente;

	public RegistroAsistencia(String nombreVentana) {
		
		super(nombreVentana);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		scrollTablaAsistencia = new JScrollPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, scrollTablaAsistencia, 23, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, scrollTablaAsistencia, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, scrollTablaAsistencia, -224, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, scrollTablaAsistencia, -10, SpringLayout.EAST, contentPane);
		contentPane.add(scrollTablaAsistencia);
		asistencia = new JTable();
		scrollTablaAsistencia.setViewportView(asistencia);
		
		JCheckBox chckbxNuevoCliente = new JCheckBox("Nuevo cliente");
		chckbxNuevoCliente.setSelected(false);
		sl_contentPane.putConstraint(SpringLayout.NORTH, chckbxNuevoCliente, 10, SpringLayout.SOUTH, scrollTablaAsistencia);
		sl_contentPane.putConstraint(SpringLayout.WEST, chckbxNuevoCliente, 10, SpringLayout.WEST, contentPane);
		contentPane.add(chckbxNuevoCliente);
		
		lblCliente = new JLabel("Cliente:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblCliente, 4, SpringLayout.NORTH, chckbxNuevoCliente);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblCliente, 40, SpringLayout.EAST, chckbxNuevoCliente);
		contentPane.add(lblCliente);
		
		txtBusquedaCliente = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtBusquedaCliente, 11, SpringLayout.SOUTH, scrollTablaAsistencia);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtBusquedaCliente, 25, SpringLayout.EAST, lblCliente);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtBusquedaCliente, 231, SpringLayout.EAST, lblCliente);
		contentPane.add(txtBusquedaCliente);
		txtBusquedaCliente.setColumns(10);
		
		scrollClientes = new JScrollPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, scrollClientes, 280, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, scrollClientes, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, scrollClientes, -50, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, scrollClientes, -10, SpringLayout.EAST, contentPane);
		contentPane.add(scrollClientes);
		clientes = new JTable();
		scrollClientes.setViewportView(clientes);

		btnVolver = new JButton("Volver");
		sl_contentPane.putConstraint(SpringLayout.EAST, btnVolver, -10, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnVolver, -10, SpringLayout.SOUTH, contentPane);
		contentPane.add(btnVolver);
		
		btnRegistrar = new JButton("Registrar");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnRegistrar, 0, SpringLayout.NORTH, btnVolver);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnRegistrar, -50, SpringLayout.WEST, btnVolver);
		contentPane.add(btnRegistrar);
	}
}
