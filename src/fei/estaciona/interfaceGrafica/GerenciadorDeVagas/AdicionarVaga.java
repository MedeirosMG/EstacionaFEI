package fei.estaciona.interfaceGrafica.GerenciadorDeVagas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AdicionarVaga extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public AdicionarVaga() {
		setBorder(new EmptyBorder(0, 0, 0, 0));
		setAlignmentY(Component.TOP_ALIGNMENT);
		setAlignmentX(Component.LEFT_ALIGNMENT);
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setMaximumSize(new Dimension(32000, 32000));
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 104, 37);
		add(panel);
		
		JLabel lblSetorA = new JLabel("Setor A");
		lblSetorA.setForeground(Color.WHITE);
		lblSetorA.setFont(new Font("Segoe Print", Font.PLAIN, 17));
		panel.add(lblSetorA);
	}

}
