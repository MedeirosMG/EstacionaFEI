package fei.estaciona.interfaceGrafica.Setor;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Cursor;
import javax.swing.JProgressBar;
import java.awt.Component;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GraficoSetorA extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public GraficoSetorA() {
		setBorder(new EmptyBorder(0, 0, 0, 0));
		setAlignmentY(Component.TOP_ALIGNMENT);
		setAlignmentX(Component.LEFT_ALIGNMENT);
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setMaximumSize(new Dimension(32000, 32000));
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JPanel vaga1 = new JPanel();
		vaga1.setBounds(10, 196, 49, 23);
		vaga1.setBackground(Color.LIGHT_GRAY);
		add(vaga1);
		
		JPanel vaga3 = new JPanel();
		vaga3.setBounds(10, 296, 49, 23);
		vaga3.setBackground(Color.LIGHT_GRAY);
		add(vaga3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 330, 85, 1);
		panel_5.setBackground(Color.BLACK);
		add(panel_5);
		
		JPanel vaga2 = new JPanel();
		vaga2.setBounds(10, 246, 49, 23);
		vaga2.setBackground(Color.LIGHT_GRAY);
		add(vaga2);
		
		JPanel vaga4 = new JPanel();
		vaga4.setBounds(10, 347, 49, 23);
		vaga4.setBackground(Color.LIGHT_GRAY);
		add(vaga4);
		
		JPanel vaga16 = new JPanel();
		vaga16.setBounds(491, 347, 49, 23);
		vaga16.setBackground(Color.LIGHT_GRAY);
		add(vaga16);
		
		JPanel vaga15 = new JPanel();
		vaga15.setBounds(491, 296, 49, 23);
		vaga15.setBackground(Color.LIGHT_GRAY);
		add(vaga15);
		
		JPanel vaga14 = new JPanel();
		vaga14.setBounds(491, 246, 49, 23);
		vaga14.setBackground(Color.LIGHT_GRAY);
		add(vaga14);
		
		JPanel vaga13 = new JPanel();
		vaga13.setBounds(491, 196, 49, 23);
		vaga13.setBackground(Color.LIGHT_GRAY);
		add(vaga13);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 280, 85, 1);
		panel_2.setBackground(Color.BLACK);
		add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 230, 85, 1);
		panel_3.setBackground(Color.BLACK);
		add(panel_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 180, 85, 1);
		panel_6.setBackground(Color.BLACK);
		add(panel_6);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(465, 330, 85, 1);
		panel_9.setBackground(Color.BLACK);
		add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(465, 280, 85, 1);
		panel_10.setBackground(Color.BLACK);
		add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(465, 230, 85, 1);
		panel_11.setBackground(Color.BLACK);
		add(panel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBounds(465, 180, 85, 1);
		panel_12.setBackground(Color.BLACK);
		add(panel_12);
		
		JPanel vaga12 = new JPanel();
		vaga12.setBounds(288, 347, 49, 23);
		vaga12.setBackground(Color.LIGHT_GRAY);
		add(vaga12);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(195, 180, 167, 1);
		panel_4.setBackground(new Color(0, 0, 0));
		add(panel_4);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBounds(195, 230, 167, 1);
		panel_18.setBackground(new Color(0, 0, 0));
		add(panel_18);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBounds(195, 330, 167, 1);
		panel_19.setBackground(new Color(0, 0, 0));
		add(panel_19);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBounds(195, 280, 167, 1);
		panel_20.setBackground(new Color(0, 0, 0));
		add(panel_20);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBounds(276, 180, 2, 201);
		panel_21.setBackground(new Color(0, 0, 0));
		add(panel_21);
		
		JPanel vaga8 = new JPanel();
		vaga8.setBounds(217, 347, 49, 23);
		vaga8.setBackground(Color.LIGHT_GRAY);
		add(vaga8);
		
		JPanel vaga11 = new JPanel();
		vaga11.setBounds(288, 296, 49, 23);
		vaga11.setBackground(Color.LIGHT_GRAY);
		add(vaga11);
		
		JPanel vaga7 = new JPanel();
		vaga7.setBounds(217, 296, 49, 23);
		vaga7.setBackground(Color.LIGHT_GRAY);
		add(vaga7);
		
		JPanel vaga6 = new JPanel();
		vaga6.setBounds(217, 246, 49, 23);
		vaga6.setBackground(Color.LIGHT_GRAY);
		add(vaga6);
		
		JPanel vaga5 = new JPanel();
		vaga5.setBounds(217, 196, 49, 23);
		vaga5.setBackground(Color.LIGHT_GRAY);
		add(vaga5);
		
		JPanel vaga9 = new JPanel();
		vaga9.setBounds(288, 196, 49, 23);
		vaga9.setBackground(Color.LIGHT_GRAY);
		add(vaga9);
		
		JPanel vaga10 = new JPanel();
		vaga10.setBounds(288, 246, 49, 23);
		vaga10.setBackground(Color.LIGHT_GRAY);
		add(vaga10);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setName("");
		progressBar.setForeground(new Color(0, 128, 0));
		progressBar.setValue(50);
		progressBar.setBounds(268, 11, 272, 14);
		add(progressBar);
		
		JPanel panelFiltro = new JPanel();
		panelFiltro.setBounds(20, 54, 249, 79);
		add(panelFiltro);
		panelFiltro.setLayout(null);
		
		JLabel lblFiltrarVagasPor = new JLabel("Filtrar vagas por :");
		lblFiltrarVagasPor.setBackground(Color.ORANGE);
		lblFiltrarVagasPor.setBounds(10, 11, 207, 14);
		panelFiltro.add(lblFiltrarVagasPor);
		
		JCheckBox Deficiente = new JCheckBox("Deficiente");
		Deficiente.setBounds(6, 28, 99, 14);
		panelFiltro.add(Deficiente);
		Deficiente.setSelected(true);
		
		JCheckBox Professor = new JCheckBox("Professor");
		Professor.setBounds(6, 44, 99, 14);
		panelFiltro.add(Professor);
		Professor.setSelected(true);
		
		JCheckBox Aluno = new JCheckBox("Aluno");
		Aluno.setBounds(6, 58, 99, 14);
		panelFiltro.add(Aluno);
		Aluno.setSelected(true);
		
		JButton BotaoFiltrar = new JButton("Filtrar");
		BotaoFiltrar.setBounds(168, 40, 71, 23);
		panelFiltro.add(BotaoFiltrar);
		
		JButton btnAdcionarVagas = new JButton("Adcionar vaga(s)");
		btnAdcionarVagas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAdcionarVagas.setBounds(340, 54, 135, 23);
		add(btnAdcionarVagas);
		
		JButton btnRemoverVagas = new JButton("Remover vaga(s)");
		btnRemoverVagas.setBounds(340, 110, 135, 23);
		add(btnRemoverVagas);
		
		JCheckBox checkVaga11 = new JCheckBox("New check box");
		checkVaga11.setBackground(Color.LIGHT_GRAY);
		checkVaga11.setBounds(340, 296, 22, 23);
		checkVaga11.setEnabled(false);
		add(checkVaga11);
		
		JCheckBox checkVaga12 = new JCheckBox("New check box");
		checkVaga12.setBackground(Color.LIGHT_GRAY);
		checkVaga12.setBounds(340, 347, 22, 23);
		checkVaga12.setEnabled(false);
		add(checkVaga12);
		
		JCheckBox checkVaga10 = new JCheckBox("New check box");
		checkVaga10.setBackground(Color.LIGHT_GRAY);
		checkVaga10.setBounds(340, 246, 22, 23);
		checkVaga10.setEnabled(false);
		add(checkVaga10);
		
		JCheckBox checkVaga9 = new JCheckBox("New check box");
		checkVaga9.setBackground(Color.LIGHT_GRAY);
		checkVaga9.setBounds(340, 196, 22, 23);
		checkVaga9.setEnabled(false);
		add(checkVaga9);
		
		JCheckBox checkVaga5 = new JCheckBox("New check box");
		checkVaga5.setBackground(Color.LIGHT_GRAY);
		checkVaga5.setBounds(195, 196, 22, 23);
		checkVaga5.setEnabled(false);
		add(checkVaga5);
		
		JCheckBox checkVaga6 = new JCheckBox("New check box");
		checkVaga6.setBackground(Color.LIGHT_GRAY);
		checkVaga6.setBounds(195, 246, 22, 23);
		checkVaga6.setEnabled(false);
		add(checkVaga6);
		
		JCheckBox checkVaga7 = new JCheckBox("New check box");
		checkVaga7.setBackground(Color.LIGHT_GRAY);
		checkVaga7.setBounds(195, 296, 22, 23);
		checkVaga7.setEnabled(false);
		add(checkVaga7);
		
		JCheckBox checkVaga8 = new JCheckBox("New check box");
		checkVaga8.setBackground(Color.LIGHT_GRAY);
		checkVaga8.setBounds(195, 347, 22, 23);
		checkVaga8.setEnabled(false);
		add(checkVaga8);
		
		JCheckBox checkVaga1 = new JCheckBox("New check box");
		checkVaga1.setBackground(Color.LIGHT_GRAY);
		checkVaga1.setBounds(63, 196, 22, 23);
		checkVaga1.setEnabled(false);
		add(checkVaga1);
		
		JCheckBox checkVaga2 = new JCheckBox("New check box");
		checkVaga2.setBackground(Color.LIGHT_GRAY);
		checkVaga2.setBounds(63, 246, 22, 23);
		checkVaga2.setEnabled(false);
		add(checkVaga2);
		
		JCheckBox checkVaga3 = new JCheckBox("New check box");
		checkVaga3.setBackground(Color.LIGHT_GRAY);
		checkVaga3.setBounds(63, 296, 22, 23);
		checkVaga3.setEnabled(false);
		add(checkVaga3);
		
		JCheckBox checkVaga4 = new JCheckBox("New check box");
		checkVaga4.setBackground(Color.LIGHT_GRAY);
		checkVaga4.setBounds(63, 347, 22, 23);
		checkVaga4.setEnabled(false);
		add(checkVaga4);
		
		JCheckBox checkVaga13 = new JCheckBox("New check box");
		checkVaga13.setBackground(Color.LIGHT_GRAY);
		checkVaga13.setBounds(465, 196, 22, 23);
		checkVaga13.setEnabled(false);
		add(checkVaga13);
		
		JCheckBox checkVaga14 = new JCheckBox("New check box");
		checkVaga14.setBackground(Color.LIGHT_GRAY);
		checkVaga14.setBounds(465, 246, 22, 23);
		checkVaga14.setEnabled(false);
		add(checkVaga14);
		
		JCheckBox checkVaga15 = new JCheckBox("New check box");
		checkVaga15.setBackground(Color.LIGHT_GRAY);
		checkVaga15.setBounds(465, 296, 22, 23);
		checkVaga15.setEnabled(false);
		add(checkVaga15);
		
		JCheckBox checkVaga16 = new JCheckBox("New check box");
		checkVaga16.setBackground(Color.LIGHT_GRAY);
		checkVaga16.setBounds(465, 347, 22, 23);
		checkVaga16.setEnabled(false);
		add(checkVaga16);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 104, 37);
		add(panel);
		
		JLabel lblSetorA = new JLabel("Setor A");
		lblSetorA.setForeground(Color.WHITE);
		lblSetorA.setFont(new Font("Segoe Print", Font.PLAIN, 17));
		panel.add(lblSetorA);
		
		JLabel lblDisponibilidade = new JLabel("Disponibilidade :");
		lblDisponibilidade.setBounds(157, 9, 104, 14);
		add(lblDisponibilidade);
		
		
	}
}
