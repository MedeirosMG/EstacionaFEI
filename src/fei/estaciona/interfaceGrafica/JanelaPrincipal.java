package fei.estaciona.interfaceGrafica;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fei.estaciona.interfaceGrafica.GerenciadorDeVagas.AdicionarVaga;
import fei.estaciona.interfaceGrafica.GerenciadorDeVagas.DeletarVaga;
import fei.estaciona.interfaceGrafica.Login.Login;
import fei.estaciona.interfaceGrafica.Setor.GraficoSetor;
import fei.estaciona.setor.SetorFull;

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
	
	private SetorFull[] setor = new SetorFull[6];
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private GraficoSetor[] setores = new GraficoSetor[6];
	private AdicionarVaga[] adicionar = new AdicionarVaga[6];
	private DeletarVaga[] deletar = new DeletarVaga[6];
	
	private JMenuItem []VagasDisponiveis = new JMenuItem[6];
	private JMenuItem []AdicionarVaga = new JMenuItem[6];
	private JMenuItem []DeletarVaga = new JMenuItem[6];
	
	private JMenu[] MenuSetores = new JMenu[6];
	JMenuBar menuBar = new JMenuBar();
	
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
	
	// ------------------------- Botões -------------------------------
	
	public class BotaoSetor implements ActionListener 
	{
		private int i;
    	private BotaoSetor(int i)
    	{
    		this.i = i;
    	}
    	
        public void actionPerformed(ActionEvent ev) {
        	if(login.isVisible())
			{
				JOptionPane.showMessageDialog(getRootPane(), "Por favor realize o login antes de acessar as funções ", "Login não localizado", JOptionPane.INFORMATION_MESSAGE);
			}
        	else
        	{
        		getContentPane().add(setores[i]);
        		setores[i].preencheVagas();
    			alteraVisibilidade(i+1,1);
    			setores[i].setSize(getContentPane().getMaximumSize());
        	}
        }  
	}
	
	public class BotaoAdicionar implements ActionListener
	{
		private int i;
    	private BotaoAdicionar(int i)
    	{
    		this.i = i;
    	}
    	
    	public void actionPerformed(ActionEvent ev) 
    	{
    		if(login.isVisible())
			{
				JOptionPane.showMessageDialog(getRootPane(), "Por favor realize o login antes de acessar as funções", "Login não localizado", JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				getContentPane().add(adicionar[i]);
				adicionar[i].preencheVagas();
				alteraVisibilidade(i+1,2);
				adicionar[i].setSize(getContentPane().getMaximumSize());
			}
    	}
    	
	}
	
	public class BotaoDeletar implements ActionListener
	{
		private int i;
    	private BotaoDeletar(int i)
    	{
    		this.i = i;
    	}
    	
    	public void actionPerformed(ActionEvent ev) 
    	{
    		if(login.isVisible())
			{
				JOptionPane.showMessageDialog(getRootPane(), "Por favor realize o login antes de acessar as funções", "Login não localizado", JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				getContentPane().add(deletar[i]);
				deletar[i].preencheVagas();
				alteraVisibilidade(i+1,3);
				deletar[i].setSize(getContentPane().getMaximumSize());
			}
    	}
    	
	}
	
	// ----------------------------------------------------------------------------
	
	public void alteraVisibilidade(int setor, int tipo)
	{
		for(int i = 0 ; i < 6 ; ++i)
		{
			if(tipo == 1)
			{
				adicionar[i].setVisible(false);
				deletar[i].setVisible(false);
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
				deletar[i].setVisible(false);
				if(setor == i+1)
				{
					adicionar[i].setVisible(true);
					adicionar[i].updateUI();
				}
				else
					adicionar[i].setVisible(false);
			}
			else if(tipo == 3)
			{
				setores[i].setVisible(false);
				adicionar[i].setVisible(false);
				if(setor == i+1)
				{
					deletar[i].setVisible(true);
					deletar[i].updateUI();
				}
				else
					deletar[i].setVisible(false);
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
		
		
		setJMenuBar(menuBar);
		
		for(int i = 0 ; i <6 ; ++i)
		{
			String[] nomes = {"Setor A", "Setor B", "Setor C", "Setor D", "Setor E", "Setor F"};
			
			setor[i] = new SetorFull(i);
			// Criação janelas setores
			setores[i] = new GraficoSetor(nomes[i], setor[i]);
			
			//Criação janelas editar setor
			adicionar[i] = new AdicionarVaga(nomes[i], setor[i], i);
			deletar[i] = new DeletarVaga(nomes[i], setor[i], i);
			
			//criação da menuBar
			MenuSetores[i] = new JMenu(nomes[i]);			
			menuBar.add(MenuSetores[i]);
			
			// Criação dos botoes "Vagas disponiveis"
			VagasDisponiveis[i] = new JMenuItem("Vagas disponiveis");
			VagasDisponiveis[i].addActionListener(new BotaoSetor(i));
			
			//Criação dos botoes "Adicionar vagas"
			AdicionarVaga[i] = new JMenuItem("Adicionar vaga");
			AdicionarVaga[i].addActionListener(new BotaoAdicionar(i));
			
			//Criação dos botoes "Deletar vagas"
			DeletarVaga[i] = new JMenuItem("Deletar vaga");
			DeletarVaga[i].addActionListener(new BotaoDeletar(i));
			
			// Preenchimento da menubar
			MenuSetores[i].add(VagasDisponiveis[i]);
			MenuSetores[i].add(AdicionarVaga[i]);
			MenuSetores[i].add(DeletarVaga[i]);
		}
		
		//Criação da tela de login ao abrir o programa
		getContentPane().add(login);
		login.setVisible(true);
		login.setSize(getContentPane().getMaximumSize());
	}
}

