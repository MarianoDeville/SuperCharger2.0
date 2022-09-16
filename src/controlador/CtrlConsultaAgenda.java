package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import modelo.DtosConsultarAgenda;
import vista.ConsultarAgenda;

public class CtrlConsultaAgenda implements ActionListener {

	private ConsultarAgenda ventanaConsultarAgenda;
	private DtosConsultarAgenda datos;
	private DefaultTableModel tablaModelo;
	private Object tabla[][];
	private String titulo[];
	
	public CtrlConsultaAgenda(ConsultarAgenda vista) {
		
		this.ventanaConsultarAgenda = vista;
		this.ventanaConsultarAgenda.btnAgendar.addActionListener(this);
		this.ventanaConsultarAgenda.btnVolver.addActionListener(this);
		this.ventanaConsultarAgenda.comboBoxEspecialidad.addActionListener(this);
		this.ventanaConsultarAgenda.comboBoxDia.addActionListener(this);
		this.ventanaConsultarAgenda.comboBoxMes.addActionListener(this);
	}
	
	public void iniciar() {
		
		datos = new DtosConsultarAgenda();

		ventanaConsultarAgenda.comboBoxEspecialidad.setModel(new DefaultComboBoxModel<String>(datos.getEspecialidades()));
		ventanaConsultarAgenda.comboBoxMes.setModel(new DefaultComboBoxModel<String>(datos.getMeses()));
		ventanaConsultarAgenda.comboBoxDia.setModel(new DefaultComboBoxModel<String>(datos.getDias(ventanaConsultarAgenda.comboBoxMes.getSelectedIndex()+1)));
		
		tabla = datos.getTabla((String)ventanaConsultarAgenda.comboBoxEspecialidad.getSelectedItem());
		titulo = new String[] {"Hora", "Disponibilidad", "Sel."};
		tablaModelo = new DefaultTableModel(tabla, titulo){

			private static final long serialVersionUID = 1L;
			
			boolean[] columnEditables = new boolean[] {
					false, false, true
			};
			
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
			
			public Class<?> getColumnClass(int column) {
				
		        if(column == 2)
		        	return Boolean.class;
		        else
		        	return String.class;
		    }
		};
		
		ventanaConsultarAgenda.agenda.setModel(tablaModelo);
		ventanaConsultarAgenda.setVisible(true);
	}
	
	public void actualizar(String campo) {
		
		if(campo == "Días") {
		
			ventanaConsultarAgenda.comboBoxDia.setModel(new DefaultComboBoxModel<String>(datos.getDias(this.ventanaConsultarAgenda.comboBoxMes.getSelectedIndex()+1)));
		}

		tabla = datos.getTabla((String)ventanaConsultarAgenda.comboBoxEspecialidad.getSelectedItem());
		tablaModelo.setDataVector(tabla, titulo);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == ventanaConsultarAgenda.comboBoxMes) {

			actualizar("Días");
		}
		
		if(e.getSource() == ventanaConsultarAgenda.comboBoxDia) {

			actualizar("Tabla");
		}
		
		if(e.getSource() == ventanaConsultarAgenda.comboBoxEspecialidad) {

			actualizar("Tabla");
		}

		if(e.getSource() == ventanaConsultarAgenda.btnAgendar) {
			
			for(int i = 0; i < tablaModelo.getRowCount(); i++) {
				
				if((boolean) tablaModelo.getValueAt(i, 2)) {
					
					String argumento[] = new String[5];
					
					argumento[0] = (String) tablaModelo.getValueAt(i, 0);
					argumento[1] = (String) ventanaConsultarAgenda.comboBoxDia.getSelectedItem();
					argumento[2] = (String) ventanaConsultarAgenda.comboBoxMes.getSelectedItem();
					argumento[3] = (String) ventanaConsultarAgenda.comboBoxEspecialidad.getSelectedItem();
					argumento[4] = ventanaConsultarAgenda.txtNombreApellido.getText();
					
					if((String) tablaModelo.getValueAt(i, 1) == "Libre")
						datos.agendarCita(argumento);
					else
						System.out.println("El lugar no está libre");
					break;
				}
			}
		}

		if(e.getSource() == ventanaConsultarAgenda.btnVolver) {
			
			ventanaConsultarAgenda.dispose();
		}
	}
}