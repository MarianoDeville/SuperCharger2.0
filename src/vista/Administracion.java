package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class Administracion extends VentanaModelo {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btnEmitirInforme;
	public JButton btnGestionarLiquidaciones;
	public JButton btnVolver;

	public Administracion(String nombreVentana) {
		
		super(nombreVentana);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		btnEmitirInforme = new JButton("Emitir informe");
		sl_contentPane.putConstraint(SpringLayout.EAST, btnEmitirInforme, 220, SpringLayout.WEST, contentPane);

		sl_contentPane.putConstraint(SpringLayout.NORTH, btnEmitirInforme, 50, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnEmitirInforme, 30, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnEmitirInforme, 110, SpringLayout.NORTH, contentPane);
		contentPane.add(btnEmitirInforme);
						
		btnGestionarLiquidaciones = new JButton("Gestionar liquidaciones");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnGestionarLiquidaciones, 48, SpringLayout.SOUTH, btnEmitirInforme);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnGestionarLiquidaciones, 30, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnGestionarLiquidaciones, -243, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnGestionarLiquidaciones, 0, SpringLayout.EAST, btnEmitirInforme);
		contentPane.add(btnGestionarLiquidaciones);
		
		btnVolver = new JButton("Volver");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnVolver, -22, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnVolver, -22, SpringLayout.EAST, contentPane);
		contentPane.add(btnVolver);
	}

}
