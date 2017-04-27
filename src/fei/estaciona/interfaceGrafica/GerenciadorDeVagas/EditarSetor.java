package fei.estaciona.interfaceGrafica.GerenciadorDeVagas;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class EditarSetor extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public EditarSetor() {
		setBorder(new EmptyBorder(0, 0, 0, 0));
		setAlignmentY(Component.TOP_ALIGNMENT);
		setAlignmentX(Component.LEFT_ALIGNMENT);
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setMaximumSize(new Dimension(32000, 32000));
		setBackground(java.awt.Color.LIGHT_GRAY);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(java.awt.Color.GRAY);
		panel.setBounds(0, 0, 104, 37);
		add(panel);
		
		JLabel lblSetorA = new JLabel("Setor A");
		lblSetorA.setFont(new Font("Segoe Print", Font.PLAIN, 17));
		panel.add(lblSetorA);
		
		JLabel lblAdicionarVaga = new JLabel("Adicionar Vaga");
		lblAdicionarVaga.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAdicionarVaga.setBounds(10, 48, 124, 25);
		add(lblAdicionarVaga);
		
		JLabel lblTipo = new JLabel("Tipo: ");
		lblTipo.setBounds(20, 84, 46, 14);
		add(lblTipo);
		
		ButtonGroup grupo = new ButtonGroup(); 
		
		JRadioButton rdbtnEstudante = new JRadioButton("Aluno");
		grupo.add(rdbtnEstudante);
		rdbtnEstudante.setFocusable(false);
		rdbtnEstudante.setBackground(Color.LIGHT_GRAY);
		rdbtnEstudante.setBounds(72, 80, 109, 23);
		add(rdbtnEstudante);
		
		JRadioButton rdbtnProfessor = new JRadioButton("Professor");
		grupo.add(rdbtnProfessor);
		rdbtnProfessor.setFocusable(false);
		rdbtnProfessor.setBackground(Color.LIGHT_GRAY);
		rdbtnProfessor.setBounds(72, 106, 109, 23);
		add(rdbtnProfessor);
		
		JRadioButton rdbtnDeficiente = new JRadioButton("Deficiente");
		grupo.add(rdbtnDeficiente);
		rdbtnDeficiente.setFocusable(false);
		rdbtnDeficiente.setBackground(Color.LIGHT_GRAY);
		rdbtnDeficiente.setBounds(72, 132, 109, 23);
		add(rdbtnDeficiente);
		
		JButton btnInserirVaga = new JButton("Inserir Vaga");
		btnInserirVaga.setFocusable(false);
		btnInserirVaga.setBounds(207, 132, 173, 23);
		add(btnInserirVaga);
		
		JLabel lblRemoverVaga = new JLabel("Remover Vaga");
		lblRemoverVaga.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRemoverVaga.setBounds(10, 192, 124, 25);
		add(lblRemoverVaga);
		
		JLabel lblQuantidadeAAdicionar = new JLabel("Quantidade a adicionar:");
		lblQuantidadeAAdicionar.setBounds(207, 84, 145, 14);
		add(lblQuantidadeAAdicionar);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 16, 1));
		spinner.setBounds(351, 81, 29, 20);
		add(spinner);
		
	}
}
