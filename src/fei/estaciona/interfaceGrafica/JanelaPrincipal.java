package fei.estaciona.interfaceGrafica;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fei.estaciona.interfaceGrafica.Login.Login;
import fei.estaciona.interfaceGrafica.Setor.GraficoSetorA;
import fei.estaciona.interfaceGrafica.Setor.GraficoSetorB;
import fei.estaciona.interfaceGrafica.Setor.GraficoSetorC;
import fei.estaciona.interfaceGrafica.Setor.GraficoSetorD;
import fei.estaciona.interfaceGrafica.Setor.GraficoSetorE;
import fei.estaciona.interfaceGrafica.Setor.GraficoSetorF;

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
	private GraficoSetorA setorA = new GraficoSetorA();
	private GraficoSetorB setorB = new GraficoSetorB();
	private GraficoSetorC setorC = new GraficoSetorC();
	private GraficoSetorD setorD = new GraficoSetorD();
	private GraficoSetorE setorE = new GraficoSetorE();
	private GraficoSetorF setorF = new GraficoSetorF();

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
	public void alteraVisibilidade(char setor)
	{
		this.setorA.setVisible(false);
		this.setorB.setVisible(false);
		this.setorC.setVisible(false);
		this.setorD.setVisible(false);
		this.setorE.setVisible(false);
		this.setorF.setVisible(false);
		
		if(setor == 'A')
		{
			this.setorA.setVisible(true);
			this.setorA.preencheVagas();
		}
		else if(setor == 'B')
		{
			this.setorB.setVisible(true);
			this.setorB.preencheVagas();
		}
		else if(setor == 'C')
		{
			this.setorC.setVisible(true);
			this.setorC.preencheVagas();
		}
		else if(setor == 'D')
		{
			this.setorD.setVisible(true);
			this.setorD.preencheVagas();
		}
		else if(setor == 'E')
		{
			this.setorE.setVisible(true);
			this.setorE.preencheVagas();
		}
		else if(setor == 'F')
		{
			this.setorF.setVisible(true);
			this.setorF.preencheVagas();
		}
	}
	public JanelaPrincipal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 459);
		setLayout(null);
		
		Login login = new Login();
		
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
					getContentPane().add(setorA);
					alteraVisibilidade('A');
					setorA.setSize(getContentPane().getMaximumSize());
				}
			}
		});
		mnSetorA.add(mntmVagasDisponiveis);
		
		JMenuItem mntmAdicionarVaga = new JMenuItem("Adicionar vaga");
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
					getContentPane().add(setorB);
					alteraVisibilidade('B');
					setorB.setSize(getContentPane().getMaximumSize());
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
					getContentPane().add(setorC);
					alteraVisibilidade('C');
					setorC.setSize(getContentPane().getMaximumSize());
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
					getContentPane().add(setorD);
					alteraVisibilidade('D');
					setorD.setSize(getContentPane().getMaximumSize());
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
					getContentPane().add(setorE);
					alteraVisibilidade('E');
					setorE.setSize(getContentPane().getMaximumSize());
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
					getContentPane().add(setorF);
					alteraVisibilidade('F');
					setorF.setSize(getContentPane().getMaximumSize());
				}
			}
		});
		mnSetorF.add(mntmVagasDisponiveis_5);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Criação da tela de login ao abrir o programa
		getContentPane().add(login);
		login.setVisible(true);
		login.setSize(getContentPane().getMaximumSize());
		
	}
}

