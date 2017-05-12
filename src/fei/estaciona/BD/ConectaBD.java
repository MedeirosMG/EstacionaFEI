package fei.estaciona.BD;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.derby.tools.ij;


public class ConectaBD {
    private static String protocol = "jdbc:derby:";
    
    public ConectaBD()
    {
    	criarBanco();
    }
    
    private void criarBanco()
    {
    	Statement stm;
    	Connection conn = conectar();
    	try
		 {
			stm = conn.createStatement();
			stm.executeQuery("SELECT * FROM VAGA");
		 }catch(SQLException sqle)
		 {
			 printSQLException(sqle);
		     if  ( sqle.getErrorCode() == 30000)
		     {
		         System.out.println("Ill create the database.");
				 if (createDB(conn))
				 {
					 System.out.println("Banco Criado");
				     System.out.println("Populando Banco");
				     if (populateDB(conn))
					{
						System.out.println("Banco populado");
					}else
					{
						System.out.println("Banco nao pode ser populado");
					}
				 }else
				 {
					 System.out.println("Banco não pode ser criado");
				 }
				
		     }
		 }
    	desconectar(conn);
    }
    
	public static void printSQLException(SQLException e) {
        while (e != null)
        {
            System.err.println("\n----- SQLException -----");
            System.err.println("  SQL State:  " + e.getSQLState());
            System.err.println("  Error Code: " + e.getErrorCode());
            System.err.println("  Message:    " + e.getMessage());
            e = e.getNextException();
        }
    }
	
	private static boolean createDB(Connection conn) {
		FileInputStream fileStream = null;
		try
		{
		    fileStream = new FileInputStream("./scripts/create.sql");
		    int result = ij.runScript(conn, fileStream, "UTF-8", System.out, "UTF-8");
		    System.out.println("Result code is: " + result);
		    if (result == 0)
		    {
		    	return true;
		    }else
		    {
		    	return false;
		    }
		}catch(FileNotFoundException e)
		{
			return false;
		} catch (UnsupportedEncodingException e)
		{
			return false;
		}finally
		{
			if (fileStream != null)
			{
				try
				{
					fileStream.close();
				}catch (IOException e)
				{
					System.err.println("Error :   " + e.getMessage() );
				}
			}
		}
    }
	
	 private static boolean populateDB(Connection conn) {
	        FileInputStream fileStream = null;
	        try
	        {
	            fileStream = new FileInputStream("./scripts/populate.sql");
	            int result = ij.runScript(conn, fileStream, "UTF-8", System.out, "UTF-8");
	            System.out.println("Result code is: " + result);
	            if (result == 0)
	            {
	                return true;
	            } else
	            {
	                return false;
	            }
	        } catch (FileNotFoundException e)
	        {
	            return false;
	        } catch (UnsupportedEncodingException e)
	        {
	            return false;
	        } finally
	        {
	            if (fileStream != null)
	            {
	                try
	                {
	                    fileStream.close();
	                } catch (IOException e)
	                {
	                	System.err.println("Error :   " + e.getMessage() );
	                }
	            }
	        }
	    }
	
	public ResultSet Select(String select, Connection conn)
	{
		Statement stm;
		ResultSet rs;
		
		try
		 {
			stm = conn.createStatement();
			rs = stm.executeQuery(select);
			return rs;
		 }catch(SQLException sqle)
		 {
			 printSQLException(sqle);
		 }
		
		return null;
	}
	
	public ResultSet SelectTipo(int tipo, Connection conn)
	{
		try
		 {
			PreparedStatement ps = conn.prepareStatement(
			"SELECT * FROM TIPO WHERE id_tipo = ?");
			ps.setInt(1, tipo);
			return ps.executeQuery();
			
		 }catch(SQLException sqle)
		 {
			 printSQLException(sqle);
		 }
		return null;
	}
	
	public boolean Delete(int id, Connection conn)
	{
		try
		 {
			PreparedStatement ps = conn.prepareStatement(
			"DELETE FROM VAGA WHERE id_vaga = ?");
			ps.setInt(1, id);
			ps.executeUpdate();
			ps.close();
			return true;
		 }catch(SQLException sqle)
		 {
			 printSQLException(sqle);
			 return false;
		 }
	}	
	
	public boolean Insert(int id, int tipo, Connection conn)
	{
		try
		 {
			PreparedStatement ps = conn.prepareStatement(
			"INSERT INTO VAGA VALUES(?,true,?)");
			ps.setInt(1, id);
			ps.setInt(2, tipo);
			ps.executeUpdate();
			ps.close();
			return true;
		 }catch(SQLException sqle)
		 {
			 printSQLException(sqle);
			 return false;
		 }
	}
	
	public boolean Update(boolean disponibilidade, int id, Connection conn)
	{
		try
		 {
			PreparedStatement ps = conn.prepareStatement(
			"UPDATE VAGA SET disponibilidade = ? WHERE id_vaga = ?");
			ps.setBoolean(1, disponibilidade);
			ps.setInt(2, id);
			ps.executeUpdate();
			ps.close();
			return true;
		 }catch(SQLException sqle)
		 {
			 printSQLException(sqle);
			 return false;
		 }
	}
	 
	public Connection conectar() {
    	try
        {
            String dbName = "BD"; // Nome do DB
            // caso DB não exista, ele cria
            Connection conn = DriverManager.getConnection(protocol + dbName + ";create=true");
            System.out.println("Connected to and created database " + dbName);
            return conn;
        }catch (SQLException sqle)
        {
            // Caso eu nao encontre o banco ou a tabela, eu os crio. Deve passar aqui somente na primeira execussao
            printSQLException(sqle);
        }
        return null;
   }
	
    public void desconectar(Connection conn){
        if(conn != null){
        	try
            {
        		conn.close();
        		if(conn.isClosed())
        			System.out.println("Derby shut down normally");
            } catch (SQLException se)
            {
                try {
					if (conn.isClosed())
					{
					    System.out.println("Derby shut down normally");
					} else
					{
					    System.err.println("Derby did not shut down normally");
					    printSQLException(se);
					}
				} catch (SQLException sqle) {
					// TODO Auto-generated catch block
					printSQLException(sqle);
				}
            }
        }
    }
   
}