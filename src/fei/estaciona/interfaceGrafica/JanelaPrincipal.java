package fei.estaciona.interfaceGrafica;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fei.estaciona.interfaceGrafica.GerenciadorDeVagas.EditarSetor;
import fei.estaciona.interfaceGrafica.Login.Login;
import fei.estaciona.interfaceGrafica.Setor.GraficoSetor;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private GraficoSetor[] setores = new GraficoSetor[6];
	private EditarSetor[] adicionarVaga = new EditarSetor[6];
	Login login = new Login();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void alteraVisibilidade(int setor, int tipo)
	{
		for(int i = 0 ; i < 6 ; ++i)
		{
			if(tipo == 1)
			{
				adicionarVaga[i].setVisible(false);
				if(setor == i+1)
				{
					setores[i].setVisible(true);
					setores[i].updateUI();
				}
				else
					setores[i].setVisible(false);
			}
			else if(tipo == 2)
			{
				setores[i].setVisible(false);
				if(setor == i+1)
				{
					adicionarVaga[i].setVisible(true);
					adicionarVaga[i].updateUI();
				}
				else
					adicionarVaga[i].setVisible(false);
			}
		}
	}
	public JanelaPrincipal()  {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 459);
		getContentPane().setLayout(null);
		
		
		// --------------------- Criação dos botoes setores ---------------------
		
		for(int i = 0 ; i <6 ; ++i)
		{
			String[] nomes = {"Setor A", "Setor B", "Setor C", "Setor D", "Setor E", "Setor F"};
			setores[i] = new GraficoSetor(nomes[i]);
		}
		
		// ---------------------- Criação dos botoes adicionarVaga --------------------
		
		for(int i = 0 ; i <6 ; ++i)
		{
			String[] nomes = {"Setor A", "Setor B", "Setor C", "Setor D", "Setor E", "Setor F"};
			adicionarVaga[i] = new EditarSetor(nomes[i]);
		}
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnSetorA = new JMenu("Setor A");
		menuBar.add(mnSetorA);
		
		JMenuItem mntmVagasDisponiveis = new JMenuItem("Vagas disponiveis");
		mntmVagasDisponiveis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(login.isVisible())
				{
					JOptionPane.showMessageDialog(getRootPane(), "Por favor realize o login antes de acessar as funções", "Login não localizado", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					getContentPane().add(setores[0]);
					alteraVisibilidade(1,1);
					setores[0].setSize(getContentPane().getMaximumSize());
				}
			}
		});
		mnSetorA.add(mntmVagasDisponiveis);
		
		JMenuItem mntmAdicionarVaga = new JMenuItem("Editar Setor A");
		mntmAdicionarVaga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(login.isVisible())
				{
					JOptionPane.showMessageDialog(getRootPane(), "Por favor realize o login antes de acessar as funções", "Login não localizado", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					getContentPane().add(adicionarVaga[0]);
					alteraVisibilidade(1,2);
					adicionarVaga[0].setSize(getContentPane().getMaximumSize());
				}
			}
		});
		mnSetorA.add(mntmAdicionarVaga);
		
		JMenu mnSetorB = new JMenu("Setor B");
		menuBar.add(mnSetorB);
		
		JMenuItem mntmVagasDisponiveis_1 = new JMenuItem("Vagas disponiveis");
		mntmVagasDisponiveis_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(login.isVisible())
				{
					JOptionPane.showMessageDialog(getRootPane(), "Por favor realize o login antes de acessar as funções", "Login não localizado", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					getContentPane().add(setores[1]);
					alteraVisibilidade(2,1);
					setores[1].setSize(getContentPane().getMaximumSize());
				}
			}
		});
		mnSetorB.add(mntmVagasDisponiveis_1);
		
		JMenu mnSetorC = new JMenu("Setor C");
		menuBar.add(mnSetorC);
		
		JMenuItem mntmVagasDisponiveis_2 = new JMenuItem("Vagas disponiveis");
		mntmVagasDisponiveis_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(login.isVisible())
				{
					JOptionPane.showMessageDialog(getRootPane(), "Por favor realize o login antes de acessar as funções", "Login não localizado", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					getContentPane().add(setores[2]);
					alteraVisibilidade(3,1);
					setores[2].setSize(getContentPane().getMaximumSize());
				}
			}
		});
		mnSetorC.add(mntmVagasDisponiveis_2);
		
		JMenu mnSetorD = new JMenu("Setor D");
		menuBar.add(mnSetorD);
		
		JMenuItem mntmVagasDisponiveis_3 = new JMenuItem("Vagas disponiveis");
		mntmVagasDisponiveis_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(login.isVisible())
				{
					JOptionPane.showMessageDialog(getRootPane(), "Por favor realize o login antes de acessar as funções", "Login não localizado", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					getContentPane().add(setores[3]);
					alteraVisibilidade(4,1);
					setores[3].setSize(getContentPane().getMaximumSize());
				}
			}
		});
		mnSetorD.add(mntmVagasDisponiveis_3);
		
		JMenu mnSetorE = new JMenu("Setor E");
		menuBar.add(mnSetorE);
		
		JMenuItem mntmVagasDisponiveis_4 = new JMenuItem("Vagas disponiveis");
		mntmVagasDisponiveis_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(login.isVisible())
				{
					JOptionPane.showMessageDialog(getRootPane(), "Por favor realize o login antes de acessar as funções", "Login não localizado", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					getContentPane().add(setores[4]);
					alteraVisibilidade(5,1);
					setores[4].setSize(getContentPane().getMaximumSize());
				}
			}
		});
		mnSetorE.add(mntmVagasDisponiveis_4);
		
		JMenu mnSetorF = new JMenu("Setor F");
		menuBar.add(mnSetorF);
		
		JMenuItem mntmVagasDisponiveis_5 = new JMenuItem("Vagas disponiveis");
		mntmVagasDisponiveis_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(login.isVisible())
				{
					JOptionPane.showMessageDialog(getRootPane(), "Por favor realize o login antes de acessar as funções", "Login não localizado", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					getContentPane().add(setores[5]);
					alteraVisibilidade(6,1);
					setores[5].setSize(getContentPane().getMaximumSize());
				}
			}
		});
		mnSetorF.add(mntmVagasDisponiveis_5);
		
		//Criação da tela de login ao abrir o programa
		getContentPane().add(login);
		login.setVisible(true);
		login.setSize(getContentPane().getMaximumSize());
	}
}

