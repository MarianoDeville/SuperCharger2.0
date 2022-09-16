package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SpringLayout;

public class ListarTrabajos extends VentanaModelo {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollTabla;
	public JTable trabajos;
	public JButton btnImprimir;
	public JButton btnVolver;

	public ListarTrabajos(String nombreVentana) {

		super(nombreVentana);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);

		scrollTabla = new JScrollPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, scrollTabla, 29, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, scrollTabla, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, scrollTabla, -100, SpringLayout.SOUTH, contentPane);
		contentPane.add(scrollTabla);
		trabajos = new JTable();
	/*	trabajos.setModel(new DefaultTableModel(
			new Object[][] {
				
				{null, null, null},
			},
			new String[] {
				"Especialidad", "Actividad", "Tiempo"
			}
		));*/
		scrollTabla.setViewportView(trabajos);
		
		btnImprimir = new JButton("Imprimir");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, scrollTabla, -30, SpringLayout.NORTH, btnImprimir);
		contentPane.add(btnImprimir);
		
		btnVolver = new JButton("Volver");
		sl_contentPane.putConstraint(SpringLayout.EAST, scrollTabla, 0, SpringLayout.EAST, btnVolver);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnVolver, -10, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnImprimir, 0, SpringLayout.NORTH, btnVolver);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnImprimir, -22, SpringLayout.WEST, btnVolver);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnVolver, -10, SpringLayout.EAST, contentPane);
		contentPane.add(btnVolver);
	}
}
