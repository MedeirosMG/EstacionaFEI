package fei.estaciona.interfaceGrafica.Setor;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Cursor;
import javax.swing.JProgressBar;
import java.awt.Component;
import javax.swing.border.EmptyBorder;

import fei.estaciona.setor.SetorA;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	private SetorA setor = new SetorA();
	private JPanel[] paineis = new JPanel[16];
	private JCheckBox[] tipos = new JCheckBox[16];
	private JProgressBar progressBar = new JProgressBar();
	
	public void preencheVagas()
	{
		boolean[] vagas = setor.vagas_Disponiveis();
		int progress = 0;
		for(int i = 0 ; i < 16 ; i++)
		{
			++progress;
			if(vagas[i])
			{
				paineis[i].setBackground(Color.green);
			}
			else
				paineis[i].setBackground(Color.red);
		}
		progress = (progress*100)/16;
		progressBar.setValue(progress);
	}
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
		
		// ------------------ CRIACAO DAS VAGAS ---------------------- 
		for(int i = 0 ; i< 16 ; i++)
		{
			paineis[i] = new JPanel();
			paineis[i].setBackground(Color.LIGHT_GRAY);
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
		
		// ---------------------- Elementos layout -------------------------------
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 330, 85, 1);
		panel_5.setBackground(Color.BLACK);
		add(panel_5);
		
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
		
		JButton btnRemoverVagas = new JButton("Liberar vaga(s)");
		btnRemoverVagas.setBounds(340, 110, 145, 23);
		add(btnRemoverVagas);
		
		JButton btnAdcionarVagas = new JButton("Preencher vaga(s)");
		btnAdcionarVagas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(getRootPane(), "Selecione as vagas que serão ocupadas", "Preenchimento de vagas", JOptionPane.INFORMATION_MESSAGE);
				for (JCheckBox tipo : tipos) {
					tipo.setEnabled(true);
					tipo.setVisible(true);
					tipo.setSelected(false);
				}
				btnAdcionarVagas.setVisible(false);
				btnRemoverVagas.setVisible(false);
				
				JButton botaoPreencher = new JButton("Ok");
				botaoPreencher.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						for(int i = 0 ; i <16 ; i++)
						{
							tipos[i].setEnabled(false);
							tipos[i].setVisible(false);
							
							if(tipos[i].isSelected())
							{
								paineis[i].setBackground(Color.red);
								setor.alterar_Disponibilidade_Vaga(false, i+1);
							}
							
							botaoPreencher.setVisible(false);
							btnAdcionarVagas.setVisible(true);
							btnRemoverVagas.setVisible(true);
						}
					}
				});
				botaoPreencher.setBounds(340, 82, 145, 23);
				add(botaoPreencher);
			}
		});
		btnAdcionarVagas.setBounds(340, 54, 145, 23);
		add(btnAdcionarVagas);
		
		JButton BotaoFiltrar = new JButton("Filtrar");
		BotaoFiltrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String []tipoVagasSeq = setor.tipoVagas();
				
				for (int i = 0 ; i < 16 ; i++) {
					
					tipos[i].setSelected(false);
					if(tipoVagasSeq[i] != null)
					{
						if(tipoVagasSeq[i].equals("Aluno") && Aluno.isSelected())
						{
							tipos[i].setSelected(true);
							tipos[i].setVisible(true);
						}
						else if(tipoVagasSeq[i].equals("Professor") && Professor.isSelected())
						{
							tipos[i].setSelected(true);
							tipos[i].setVisible(true);
						}
						if(tipoVagasSeq[i].equals("Deficiente") && Deficiente.isSelected())
						{
							tipos[i].setSelected(true);
							tipos[i].setVisible(true);
						}
					}
				}
			}
		});
		BotaoFiltrar.setBounds(168, 40, 71, 23);
		panelFiltro.add(BotaoFiltrar);
		
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
		
		
		// Carregamento das vagas e progressbar
		
		progressBar.setStringPainted(true);
		progressBar.setName("");
		progressBar.setForeground(new Color(0, 128, 0));
		progressBar.setBounds(268, 11, 272, 14);
		add(progressBar);
		preencheVagas();
	}
}
