package DataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Framework.AppConfiguration;
import Framework.AppException;

public class DataAccessComponent extends SQLiteDataHelper {

    public DataAccessComponent() {
        super(AppConfiguration.getDBPathConnection());
    }

    public void getPersona() {
        String sql = "SELECT ID, NOMBRE, APELLIDO FROM PERSONA";
        try (   ResultSet rs = getResultSet(sql)){
            while(rs.next()){
                System.out.println(rs.getInt("ID"));
                System.out.println(rs.getString("NOMBRE"));
                System.out.println(rs.getString("APELLIDO"));
                System.out.println("------------------------");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
  

    // public void getPersona(){
    //     String sql = "SELECT ID, NOMBRE, APELLIDO FROM PERSONA";
    //     try (   Connection conn = connSQLITE();
    //             Statement stmt  = conn.createStatement();
    //             ResultSet rs    = stmt.executeQuery(sql)){
            
    //         while(rs.next()){
    //             System.out.println(rs.getInt("ID"));
    //             System.out.println(rs.getString("NOMBRE"));
    //             System.out.println(rs.getString("APELLIDO"));
    //             System.out.println("------------------------");
    //         }
    //     } catch (SQLException e) {
    //         System.out.println(e.getMessage());
    //     }
    // }

    public void getPersonaID(int Id) throws AppException  {
        String sql = "SELECT ID, NOMBRE, APELLIDO "
                    +"FROM PERSONA "
                    +"WHERE ID = ? ";
        
        try (   Connection conn = getConnection();
                PreparedStatement pstmt  = conn.prepareStatement(sql)){
            pstmt.setInt(1,Id);
            ResultSet rs    = pstmt.executeQuery();
 
            while(rs.next()){
                System.out.println(rs.getInt("ID"));
                System.out.println(rs.getString("NOMBRE"));
                System.out.println(rs.getString("APELLIDO"));
                System.out.println("------------------------");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void getPersonaIDParm(int Id) throws AppException{
        String sql = "SELECT ID, NOMBRE, APELLIDO "
                    +"FROM PERSONA "
                    +"WHERE ID = ? ";
        try{
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,Id);
            ResultSet rs    = pstmt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt("ID"));
                System.out.println(rs.getString("NOMBRE"));
                System.out.println(rs.getString("APELLIDO"));
                System.out.println("------------------------");
            }
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void getPersonaNombre(String Nombre){
        String sql = "SELECT ID, NOMBRE, APELLIDO "
                    +"FROM PERSONA "
                    +"WHERE NOMBRE LIKE ? ";
        
        try (   Connection conn = getConnection();
                PreparedStatement pstmt  = conn.prepareStatement(sql)){
            pstmt.setString(1, "%" + Nombre.trim() + "%");
            System.out.println(sql);
            ResultSet rs    = pstmt.executeQuery();
 
            while(rs.next()){
                System.out.println(rs.getInt("ID"));
                System.out.println(rs.getString("NOMBRE"));
                System.out.println(rs.getString("APELLIDO"));
                System.out.println("------------------------");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public boolean ejemploNivelesException(String strConnDB) throws Exception {

        if(strConnDB.isEmpty())
            throw new Exception("No se ha especificado la coneccion a la base de datos");
        
        if(strConnDB.equalsIgnoreCase("SQLServer")){
            
            try {
                System.out.println("Conectandose a la base de datos..." + strConnDB);
                int a =2/2;
                int b ;
                //int c= a +b;
                //Integer.parseInt( "TiempoConeccion"  ) ;
                //System.err.println(""+null);
                return true;
            }   
            catch(ArithmeticException     e){
                throw new Exception("Acabas de dividir por cero sdjdfur...!");
            }
            catch(NumberFormatException e){
                throw new Exception("NumberFormatException");
            }
            catch (Exception e) {
                throw new Exception("Se genero un error");
            } finally {
                System.out.println("Cerando coneccion a la base de datos" + strConnDB);
            }
        }
        return false;
    }
}
