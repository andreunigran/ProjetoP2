package br.unigran.persistencia.padrao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andre
 */
public class DaoJDBC {
    private  Connection conn;
    private static DaoJDBC entidade;
    private DaoJDBC() throws SQLException{
     if(conn==null ||conn.isClosed()){
            conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
          }
    }
    public static DaoJDBC getInstace(){
       
        try {
            if(entidade==null)
                entidade= new DaoJDBC() ;
            return entidade;
        } catch (SQLException ex) {
            Logger.getLogger(DaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public  Statement getstatStatement() throws SQLException{
        return conn.createStatement();
    }
    public  Connection getConnection() throws SQLException{
        return conn;
    }
    public  PreparedStatement getPreStatement(String sql) throws SQLException{
        return conn.prepareStatement(sql);
    }
    
    public  void close() throws SQLException{
          conn.close();
    }   
}
