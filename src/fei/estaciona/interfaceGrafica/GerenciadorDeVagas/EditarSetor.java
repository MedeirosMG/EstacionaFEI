package fei.estaciona.interfaceGrafica.GerenciadorDeVagas;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;

public class EditarSetor extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel[] paineis = new JPanel[16];
	private JPanel[] layout = new JPanel[30];

	/**
	 * Create the panel.
	 */
	public EditarSetor(String nomeEditar) {
		
		setBorder(new EmptyBorder(0, 0, 0, 0));
		setAlignmentY(Component.TOP_ALIGNMENT);
		setAlignmentX(Component.LEFT_ALIGNMENT);
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setMaximumSize(new Dimension(32000, 32000));
		setBackground(java.awt.Color.LIGHT_GRAY);
		setLayout(null);
		
		// ------------------ CRIACAO DAS VAGAS ---------------------- 
		for(int i = 0 ; i< 16 ; i++)
		{
			paineis[i] = new JPanel();
			paineis[i].setBackground(Color.LIGHT_GRAY);
			paineis[i].setBorder(BorderFactory.createLineBorder(Color.darkGray, 1));  
			add(paineis[i]);
			switch(i)
			{
				case 0:
					paineis[i].setBounds(10, 196, 49, 23);
					break;
				case 1:
					paineis[i].setBounds(10, 246, 49, 23);
					break;
				case 2:
					paineis[i].setBounds(10, 296, 49, 23);
					break;
				case 3:
					paineis[i].setBounds(10, 347, 49, 23);
					break;
				case 4:
					paineis[i].setBounds(217, 196, 49, 23);
					break;
				case 5:
					paineis[i].setBounds(217, 246, 49, 23);
					break;
				case 6:
					paineis[i].setBounds(217, 296, 49, 23);
					break;
				case 7:
					paineis[i].setBounds(217, 347, 49, 23);
					break;
				case 8:
					paineis[i].setBounds(288, 196, 49, 23);
					break;
				case 9:
					paineis[i].setBounds(288, 246, 49, 23);
					break;
				case 10:
					paineis[i].setBounds(288, 296, 49, 23);
					break;
				case 11:
					paineis[i].setBounds(288, 347, 49, 23);
					break;
				case 12:
					paineis[i].setBounds(491, 196, 49, 23);
					break;
				case 13:
					paineis[i].setBounds(491, 246, 49, 23);
					break;
				case 14:
					paineis[i].setBounds(491, 296, 49, 23);
					break;
				case 15:
					paineis[i].setBounds(491, 347, 49, 23);
					break;
					
			}
		}

		// ---------------------- Criação do layout -------------------------------
		
		for(int i = 0 ; i< 13 ; i++)
		{
			layout[i] = new JPanel();
			layout[i].setBackground(Color.BLACK);
			add(layout[i]);
			switch(i)
			{
				case 1:
					layout[i].setBounds(0, 280, 85, 1);		
					break;
				case 2:
					layout[i].setBounds(0, 230, 85, 1);
					break;
				case 3:
					layout[i].setBounds(195, 180, 167, 1);
					break;
				case 4:
					layout[i].setBounds(0, 330, 85, 1);
					break;
				case 5:
					layout[i].setBounds(0, 180, 85, 1);
					break;
				case 6:
					layout[i].setBounds(465, 330, 85, 1);
					break;
				case 7:
					layout[i].setBounds(465, 280, 85, 1);
					break;
				case 8:
					layout[i].setBounds(465, 230, 85, 1);
					break;
				case 9:
					layout[i].setBounds(465, 180, 85, 1);
					break;
				case 10:
					layout[i].setBounds(195, 230, 167, 1);
					break;
				case 11:
					layout[i].setBounds(195, 330, 167, 1);
					break;
				case 12:
					layout[i].setBounds(195, 280, 167, 1);
					break;
				case 13:
					layout[i].setBounds(276, 180, 2, 201);
					break;
			}
		}
		
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
		btnInserirVaga.setBounds(207, 132, 109, 23);
		add(btnInserirVaga);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setForeground(Color.GRAY);
		panel.setBounds(0, 0, 104, 37);
		add(panel);
		
		JLabel lblNewLabel = new JLabel(nomeEditar);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe Print", Font.PLAIN, 17));
		panel.add(lblNewLabel);
		
	}
}
