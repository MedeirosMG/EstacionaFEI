package fei.estaciona.interfaceGrafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceLogin extends JInternalFrame {
	private JTextField Login;
	private JTextField Senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceLogin frame = new InterfaceLogin();
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
	public InterfaceLogin() {
		setClosable(true);
		setMaximizable(true);
		setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setBounds(100, 100, 228, 301);
		getContentPane().setLayout(null);
		
		Login = new JTextField();
		Login.setBounds(45, 63, 141, 20);
		getContentPane().add(Login);
		Login.setColumns(10);
		
		Senha = new JTextField();
		Senha.setBounds(44, 94, 142, 28);
		getContentPane().add(Senha);
		Senha.setColumns(10);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(Login.getText().equals("Gabriel") && Senha.getText().equals("123"))
					{
						System.out.println("OK");
					}
			}
		});
		btnOk.setBounds(75, 150, 89, 23);
		getContentPane().add(btnOk);

	}

}
