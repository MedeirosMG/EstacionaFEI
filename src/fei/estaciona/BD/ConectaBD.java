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
	private Statement stm;
	private ResultSet rs = null;
	private Connection conn = null;
	
	private static String driver = "org.apache.derby.jdbc.EmbeddedDriver";
    private static String protocol = "jdbc:derby:";
    
    public ConectaBD()
    {
    	conectar();
		try
		 {
			this.stm = conn.createStatement();
			this.stm.executeQuery("SELECT * FROM VAGA");
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
	
	 private static void loadDriver() {
	        try
	        {
	            Class.forName(driver).newInstance();
	            System.out.println("Loaded the appropriate driver");
	        } catch (ClassNotFoundException cnfe)
	        {
	            System.err.println("\nUnable to load the JDBC driver " + driver);
	            System.err.println("Please check your CLASSPATH.");
	            cnfe.printStackTrace(System.err);
	        } catch (InstantiationException ie)
	        {
	            System.err.println("\nUnable to instantiate the JDBC driver " + driver);
	            ie.printStackTrace(System.err);
	        } catch (IllegalAccessException iae)
	        {
	            System.err.println("\nNot allowed to access the JDBC driver " + driver);
	            iae.printStackTrace(System.err);
	        }
	    }
	
	public ResultSet Select(String select)
	{
		try
		 {
			this.stm = conn.createStatement();
			this.rs = this.stm.executeQuery(select);
		 }catch(SQLException sqle)
		 {
			 this.rs = null;
			 printSQLException(sqle);
		 }
		return this.rs;
	}
	
	public ResultSet SelectTipo(int tipo)
	{
		try
		 {
			PreparedStatement ps = conn.prepareStatement(
			"SELECT * FROM TIPO WHERE id_tipo = ?");
			ps.setInt(1, tipo);
			return ps.executeQuery();
		 }catch(SQLException sqle)
		 {
			 this.rs = null;
			 printSQLException(sqle);
		 }
		return this.rs;
	}
	
	public boolean Delete(int id)
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
			 this.rs = null;
			 printSQLException(sqle);
			 return false;
		 }
	}	
	
	public boolean Insert(int id, int tipo)
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
			 this.rs = null;
			 printSQLException(sqle);
			 return false;
		 }
	}
	
	public boolean Update(boolean disponibilidade, int id)
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
			 this.rs = null;
			 printSQLException(sqle);
			 return false;
		 }
	}
	 
	private boolean conectar() {
        loadDriver();
    	try
        {
            String dbName = "BD"; // Nome do DB
            // caso DB não exista, ele cria
            conn = DriverManager.getConnection(protocol + dbName + ";create=true");
            System.out.println("Connected to and created database " + dbName);
        }catch (SQLException sqle)
        {
            // Caso eu nao encontre o banco ou a tabela, eu os crio. Deve passar aqui somente na primeira execussao
            printSQLException(sqle);
        }finally
        {
            try
            {
                if (rs != null)
                {
                    rs.close();
                    rs = null;
                }
            }catch (SQLException sqle)
            {
                printSQLException(sqle);
            }
        }
        return true;
   }
	
    private void desconectar(){
        if(conn != null){
        	try
            {
                DriverManager.getConnection("jdbc:derby:;shutdown=true");
            } catch (SQLException se)
            {
                if (((se.getErrorCode() == 50000) && ("XJ015".equals(se.getSQLState()))))
                {
                    System.out.println("Derby shut down normally");
                } else
                {
                    System.err.println("Derby did not shut down normally");
                    printSQLException(se);
                }
            }
        }
    }
   
}
