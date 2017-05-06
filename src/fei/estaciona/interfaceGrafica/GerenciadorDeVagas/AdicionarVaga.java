package fei.estaciona.interfaceGrafica.GerenciadorDeVagas;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import fei.estaciona.setor.SetorFull;

public class AdicionarVaga extends JPanel {

	/**
	 * 
	 */
	private int numeroSetor;
	private SetorFull setor;
	private static final long serialVersionUID = 1L;
	private JPanel[] paineis = new JPanel[16];
	private JPanel[] layout = new JPanel[30];
	private JCheckBox[] tipos = new JCheckBox[16];
	JButton botaoPreencher = new JButton("Ok");

	/**
	 * Create the panel.
	 */
	public void preencheVagas()
	{
		int[] vagas = setor.vagas_Disponiveis();
		for(int i = 0 ; i < 16 ; i++)
		{
			if(vagas[i] != -1)
			{
				paineis[i].setBackground(Color.BLACK);
			}
		}
	}
	
	public AdicionarVaga(String nomeEditar, SetorFull novoSetor, int numSetor) {
		
		this.numeroSetor = 0;
		for(int j = 0; j < numSetor ; j++)
		{
			this.numeroSetor += 16;
		}
		this.setor = novoSetor;
		setBorder(new EmptyBorder(0, 0, 0, 0));
		setAlignmentY(Component.TOP_ALIGNMENT);
		setAlignmentX(Component.LEFT_ALIGNMENT);
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setMaximumSize(new Dimension(32000, 32000));
		setBackground(java.awt.Color.LIGHT_GRAY);
		setLayout(null);
		// ----------------- Criação dos checkbox -------------------
		
		for(int i = 0 ; i< 16 ; i++)
		{
			tipos[i] = new JCheckBox();
			tipos[i].setBackground(Color.LIGHT_GRAY);
			tipos[i].setEnabled(false);
			tipos[i].setVisible(false);
			add(tipos[i]);
			switch(i)
			{
				case 0:
					tipos[i].setBounds(63, 196, 22, 23);
					break;
				case 1:
					tipos[i].setBounds(63, 246, 22, 23);
					break;
				case 2:
					tipos[i].setBounds(63, 296, 22, 23);
					break;
				case 3:
					tipos[i].setBounds(63, 347, 22, 23);
					break;
				case 4:
					tipos[i].setBounds(195, 196, 22, 23);
					break;
				case 5:
					tipos[i].setBounds(195, 246, 22, 23);
					break;
				case 6:
					tipos[i].setBounds(195, 296, 22, 23);
					break;
				case 7:
					tipos[i].setBounds(195, 347, 22, 23);
					break;
				case 8:
					tipos[i].setBounds(340, 196, 22, 23);
					break;
				case 9:
					tipos[i].setBounds(340, 246, 22, 23);
					break;
				case 10:
					tipos[i].setBounds(340, 296, 22, 23);
					break;
				case 11:
					tipos[i].setBounds(340, 347, 22, 23);
					break;
				case 12:
					tipos[i].setBounds(465, 196, 22, 23);
					break;
				case 13:
					tipos[i].setBounds(465, 246, 22, 23);
					break;
				case 14:
					tipos[i].setBounds(465, 296, 22, 23);
					break;
				case 15:
					tipos[i].setBounds(465, 347, 22, 23);
					break;
					
			}
		}
		
		// ------------------ CRIACAO DAS VAGAS ---------------------- 
		for(int i = 0 ; i< 16 ; i++)
		{
			int[] ids = setor.idsVagas();
			paineis[i] = new JPanel();
			paineis[i].setBorder(BorderFactory.createLineBorder(Color.darkGray, 1));
			if(ids[i] == -1)
				paineis[i].setBackground(Color.LIGHT_GRAY);
			else
				paineis[i].setBackground(Color.green);
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
		btnInserirVaga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnEstudante.isSelected() || rdbtnProfessor.isSelected() || rdbtnDeficiente.isSelected())
				{
					int valida = 0;
					int[] ids = setor.idsVagas();
					for(int i = 0 ; i <16 ; i++)
					{
						tipos[i].setSelected(false);
						
						if(ids[i] == -1)
						{
							++valida;
							tipos[i].setVisible(true);
							tipos[i].setEnabled(true);
						}
						else
						{
							tipos[i].setVisible(false);
						}
					}
					
					if(valida != 0)
					{
						rdbtnEstudante.setEnabled(false);
						rdbtnProfessor.setEnabled(false);
						rdbtnDeficiente.setEnabled(false);
						btnInserirVaga.setVisible(false);
						botaoPreencher.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(getRootPane(), "Não existem mais espaços para vagas", "Informe", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				else
				{
					JOptionPane.showMessageDialog(getRootPane(), "Por favor selecione o tipo da vaga a adicionar", "Informe", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnInserirVaga.setBounds(207, 132, 109, 23);
		add(btnInserirVaga);
		
		botaoPreencher.setBounds(207, 132, 109, 23);
		add(botaoPreencher);
		botaoPreencher.setVisible(false);
		botaoPreencher.setFocusable(false);
		botaoPreencher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0 ; i <16 ; i++)
				{
					tipos[i].setEnabled(false);
					tipos[i].setVisible(false);
					
					if(tipos[i].isSelected() && rdbtnEstudante.isSelected())
					{
						setor.inserir_Nova_Vaga(1, (i+1) + numeroSetor , numeroSetor);
					}
					else if(tipos[i].isSelected() && rdbtnProfessor.isSelected())
					{
						setor.inserir_Nova_Vaga(2, (i+1) + numeroSetor, numeroSetor);
					}
					else if(tipos[i].isSelected() && rdbtnDeficiente.isSelected())
					{
						setor.inserir_Nova_Vaga(3, (i+1) + numeroSetor, numeroSetor);
					}
					
					botaoPreencher.setVisible(false);
					btnInserirVaga.setVisible(true);
					preencheVagas();
					rdbtnEstudante.setEnabled(true);
					rdbtnProfessor.setEnabled(true);
					rdbtnDeficiente.setEnabled(true);
				}
			}
		});
		
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
