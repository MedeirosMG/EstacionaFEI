package fei.estaciona.interfaceGrafica.Setor;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Cursor;

import javax.swing.JProgressBar;

import java.awt.Component;

import javax.swing.border.EmptyBorder;

import fei.estaciona.Log.GeraLog;
import fei.estaciona.setor.SetorFull;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GraficoSetor extends JPanel {

	/**
	 * 
	 */
	private SetorFull setor;
	private static final long serialVersionUID = 1L;
	
	private JPanel[] paineis = new JPanel[16];
	private JPanel[] layout = new JPanel[30];
	private JCheckBox[] tipos = new JCheckBox[16];
	private JProgressBar progressBar = new JProgressBar();
	private static GeraLog log = new GeraLog();
	private JButton botaoPreencher = new JButton("Ok");
	private JButton btnAdcionarVagas = new JButton("Preencher vaga(s)");
	private JButton btnRemoverVagas = new JButton("Liberar vaga(s)");
	
	private JCheckBox Deficiente = new JCheckBox("Deficiente");
	private JCheckBox Aluno = new JCheckBox("Aluno");
	private JCheckBox Professor = new JCheckBox("Professor");
	
	public void preencheVagas()
	{
		int[] vagas = setor.vagas_Disponiveis();
		
		String []tipoVagasSeq = setor.tipoVagas();
		int progress = 0;
		int total = 0;
		
		for(int i = 0 ; i < 16 ; i++)
		{
			paineis[i].setBackground(Color.LIGHT_GRAY);
			
			if(tipoVagasSeq[i] != null)
			{
				++total;
				if(tipoVagasSeq[i].equals("Aluno") && Aluno.isSelected())
				{
					if(vagas[i] != -1)
					{
						if(vagas[i] == 1)
						{
							++progress;
							paineis[i].setBackground(Color.green);
						}
						else
						{
							paineis[i].setBackground(Color.red);
						}
					}
				}
				else if(tipoVagasSeq[i].equals("Professor") && Professor.isSelected())
				{
					if(vagas[i] != -1)
					{
						if(vagas[i] == 1)
						{
							++progress;
							paineis[i].setBackground(Color.green);
						}
						else
						{
							paineis[i].setBackground(Color.red);
						}
					}
				}
				if(tipoVagasSeq[i].equals("Deficiente") && Deficiente.isSelected())
				{
					if(vagas[i] != -1)
					{
						if(vagas[i] == 1)
						{
							++progress;
							paineis[i].setBackground(Color.green);
						}
						else
						{
							paineis[i].setBackground(Color.red);
						}
					}
				}
			}
		}
		
		if(total != 0)
			progress = (progress*100)/total;
					
		progressBar.setValue(progress);
	}
	/**
	 * Create the panel.
	 */
	public GraficoSetor(String nomeSetor, SetorFull novoSetor) {
		
		this.setor = novoSetor;
		setBorder(new EmptyBorder(0, 0, 0, 0));
		setAlignmentY(Component.TOP_ALIGNMENT);
		setAlignmentX(Component.LEFT_ALIGNMENT);
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setMaximumSize(new Dimension(32000, 32000));
		setBackground(Color.LIGHT_GRAY);
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
		
		// ----------------------- Criação dos checkbox tipos ---------------------------
		
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
		
		// -------------------- Painel filtro de vagas ----------------------------
		
		JPanel panelFiltro = new JPanel();
		panelFiltro.setBounds(20, 54, 249, 79);
		add(panelFiltro);
		panelFiltro.setLayout(null);
		
		JLabel lblFiltrarVagasPor = new JLabel("Filtrar vagas por :");
		lblFiltrarVagasPor.setBackground(Color.ORANGE);
		lblFiltrarVagasPor.setBounds(10, 11, 207, 14);
		panelFiltro.add(lblFiltrarVagasPor);
		
		Deficiente.setBounds(6, 28, 99, 14);
		panelFiltro.add(Deficiente);
		Deficiente.setSelected(true);
		
		Professor.setBounds(6, 44, 99, 14);
		panelFiltro.add(Professor);
		Professor.setSelected(true);
		
		Aluno.setBounds(6, 58, 99, 14);
		panelFiltro.add(Aluno);
		Aluno.setSelected(true);
		
		// ---------------- BOTAO FILTRAR -----------------------
		JButton BotaoFiltrar = new JButton("Filtrar");
		BotaoFiltrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				preencheVagas();
			}
		});
		BotaoFiltrar.setBounds(168, 40, 71, 23);
		BotaoFiltrar.setFocusable(false);
		panelFiltro.add(BotaoFiltrar);
		
		// -------------------------- Menu de uso de vagas ---------------------------
		
		// Preencher
		botaoPreencher.setBounds(340, 82, 145, 23);
		add(botaoPreencher);
		botaoPreencher.setVisible(false);
		botaoPreencher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0 ; i <16 ; i++)
				{
					tipos[i].setEnabled(false);
					tipos[i].setVisible(false);
					int [] ids = setor.idsVagas();
					
					if(tipos[i].isSelected() && setor.verifica_disponibilidade_vaga(ids[i]))
					{
						setor.alterar_Disponibilidade_Vaga(false, ids[i]);
						tipos[i].setSelected(false);
					}
					else if(tipos[i].isSelected() && !setor.verifica_disponibilidade_vaga(ids[i]))
					{
						setor.alterar_Disponibilidade_Vaga(true, ids[i]);
						tipos[i].setSelected(false);
					}
					
					preencheVagas();
					botaoPreencher.setVisible(false);
					btnAdcionarVagas.setVisible(true);
					btnRemoverVagas.setVisible(true);
				}
			}
		});
		
		//Remover
		btnRemoverVagas.setBounds(340, 110, 145, 23);
		add(btnRemoverVagas);
		btnRemoverVagas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int valida = 0;
				int[] ids = setor.idsVagas();
				for(int i = 0 ; i < 16 ; i++)
				{
					tipos[i].setSelected(false);
					if(ids[i] != -1)
					{
						if(!setor.verifica_disponibilidade_vaga(ids[i]))
						{
							++valida;
							tipos[i].setEnabled(true);
							tipos[i].setVisible(true);
							tipos[i].setSelected(false);
						}
						else
						{
							tipos[i].setVisible(false);
						}
					}
					else
					{
						tipos[i].setVisible(false);
					}
				}
				
				if(valida != 0)
				{
					btnAdcionarVagas.setVisible(false);
					btnRemoverVagas.setVisible(false);
					botaoPreencher.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(getRootPane(), "Não existem vagas para liberar", "Informe", JOptionPane.INFORMATION_MESSAGE);
					log.escreveLog("ERROR --------------- Não existem vagas para liberar ");
				}
			}
		});
		
		//Adicionar
		btnAdcionarVagas.setBounds(340, 54, 145, 23);
		add(btnAdcionarVagas);
		btnAdcionarVagas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int valida = 0;
				int[] ids = setor.idsVagas();
				for(int i = 0 ; i < 16 ; i++)
				{
					tipos[i].setSelected(false);
					if(ids[i] != -1 && setor.verifica_disponibilidade_vaga(ids[i]))
					{
						++valida;
						tipos[i].setEnabled(true);
						tipos[i].setVisible(true);
						tipos[i].setSelected(false);
					}
					else
					{
						tipos[i].setVisible(false);
					}
				}
				if(valida != 0)
				{
					btnAdcionarVagas.setVisible(false);
					btnRemoverVagas.setVisible(false);
					botaoPreencher.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(getRootPane(), "Não existem vagas para preencher", "Informe", JOptionPane.INFORMATION_MESSAGE);
					log.escreveLog("ERROR --------------- Não existem vagas para preencher ");
				}
			}
		});
		
		//----------------- Painel com nome do setor  ------------------
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 104, 37);
		add(panel);
		
		JLabel lblSetor = new JLabel(nomeSetor);
		lblSetor.setForeground(Color.WHITE);
		lblSetor.setFont(new Font("Segoe Print", Font.PLAIN, 17));
		panel.add(lblSetor);
		
		JLabel lblDisponibilidade = new JLabel("Disponibilidade :");
		lblDisponibilidade.setBounds(157, 9, 104, 14);
		add(lblDisponibilidade);
		
		// ------------------- Carregamento das vagas e progressbar -----------
		
		progressBar.setStringPainted(true);
		progressBar.setName("");
		progressBar.setForeground(new Color(0, 128, 0));
		progressBar.setBounds(268, 11, 272, 14);
		add(progressBar);
		preencheVagas();
	}
}
