package fei.estaciona.login;

public class LoginAdmin 
{
	private String login;
	private String Password;
	
	public LoginAdmin()
	{
		this.login = "admin";
		this.Password = "estacionafei";
	}
	
	public boolean verificaLogin(String login, String password)
	{
		return (this.login.equals(login) && this.Password.equals(password));
	}
	
	public boolean alteraSenha(String password)
	{
		if(this.Password.equals(password))
		{
			this.Password = password;
			return true;
		}
		
		return false;
	}
}
