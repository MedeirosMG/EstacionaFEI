package fei.estaciona.interfaceGrafica.Login;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fei.estaciona.Log.GeraLog;
import fei.estaciona.login.LoginAdmin;

import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JPasswordField passwordField;
	private LoginAdmin credencial = new LoginAdmin();
	private static GeraLog log = new GeraLog();

	/**
	 * Create the panel.
	 */
	public Login() {
		setAlignmentY(Component.TOP_ALIGNMENT);
		setAlignmentX(Component.LEFT_ALIGNMENT);
		setBorder(new EmptyBorder(0, 0, 0, 0));
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(163, 145, 221, 20);
		add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(163, 189, 221, 20);
		add(passwordField);
		
		JLabel lblLogin = new JLabel("Login :");
		lblLogin.setBounds(83, 148, 46, 14);
		add(lblLogin);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setBounds(83, 192, 70, 14);
		add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{	
				String password = new String(passwordField.getPassword());
				if(credencial.verificaLogin(textField.getText(), password))
				{
					setVisible(false);
					log.escreveLog("Login realizado com sucesso !! ");
					JOptionPane.showMessageDialog(getRootPane(), "Login realizado com sucesso, bem vindo", "Login", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					textField.setText("");
					passwordField.setText("");
					log.escreveLog("Erro ao realizar login, possivelmente usuario ou senha errado");
					JOptionPane.showMessageDialog(getRootPane(), "Por favor verifique o usuario informado", "Usuario errado", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnLogin.setBounds(227, 241, 89, 23);
		add(btnLogin);

	}
}
