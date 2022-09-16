package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ConsultarAgenda extends VentanaModelo {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollTabla;
	public JTable agenda;
	public JComboBox<String> comboBoxEspecialidad;
	public JComboBox<String> comboBoxMes;
	public JComboBox<String> comboBoxDia;
	public JTextField txtNombreApellido;
	public JButton btnVolver;
	public JButton btnAgendar;
	
	public ConsultarAgenda(String nombreVentana) {

		super(nombreVentana);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		scrollTabla = new JScrollPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, scrollTabla, 57, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, scrollTabla, -108, SpringLayout.SOUTH, contentPane);
		contentPane.add(scrollTabla);
		agenda = new JTable();
		sl_contentPane.putConstraint(SpringLayout.WEST, scrollTabla, 11, SpringLayout.WEST, contentPane);
		scrollTabla.setViewportView(agenda);
		

		JLabel lblEspecialidad = new JLabel("Especialidad:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblEspecialidad, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblEspecialidad, 11, SpringLayout.WEST, contentPane);
		contentPane.add(lblEspecialidad);
		
		comboBoxEspecialidad = new JComboBox<String>();
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBoxEspecialidad, -3, SpringLayout.NORTH, lblEspecialidad);
		sl_contentPane.putConstraint(SpringLayout.WEST, comboBoxEspecialidad, 14, SpringLayout.EAST, lblEspecialidad);
		contentPane.add(comboBoxEspecialidad);
		
		JLabel lblFecha = new JLabel("Fecha:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblFecha, 0, SpringLayout.NORTH, lblEspecialidad);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblFecha, 23, SpringLayout.EAST, comboBoxEspecialidad);
		contentPane.add(lblFecha);
		
		comboBoxMes = new JComboBox<String>();
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBoxMes, -3, SpringLayout.NORTH, lblEspecialidad);
		sl_contentPane.putConstraint(SpringLayout.WEST, comboBoxMes, 6, SpringLayout.EAST, lblFecha);
		contentPane.add(comboBoxMes);
		
		comboBoxDia = new JComboBox<String>();
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBoxDia, -3, SpringLayout.NORTH, lblEspecialidad);
		sl_contentPane.putConstraint(SpringLayout.WEST, comboBoxDia, 6, SpringLayout.EAST, comboBoxMes);
		contentPane.add(comboBoxDia);
		
		btnVolver = new JButton("Volver");
		sl_contentPane.putConstraint(SpringLayout.EAST, scrollTabla, 0, SpringLayout.EAST, btnVolver);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnVolver, -31, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnVolver, -10, SpringLayout.EAST, contentPane);
		contentPane.add(btnVolver);
		
		btnAgendar = new JButton("Agendar");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnAgendar, 0, SpringLayout.NORTH, btnVolver);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnAgendar, -50, SpringLayout.WEST, btnVolver);
		contentPane.add(btnAgendar);
		
		JLabel lblNombreApellido = new JLabel("Nombre y apellido del cliente:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNombreApellido, 19, SpringLayout.SOUTH, scrollTabla);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNombreApellido, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblNombreApellido);
		
		txtNombreApellido = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtNombreApellido, 0, SpringLayout.NORTH, lblNombreApellido);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtNombreApellido, 6, SpringLayout.EAST, lblNombreApellido);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtNombreApellido, 400, SpringLayout.EAST, lblNombreApellido);
		contentPane.add(txtNombreApellido);
		txtNombreApellido.setColumns(10);
	}
}
