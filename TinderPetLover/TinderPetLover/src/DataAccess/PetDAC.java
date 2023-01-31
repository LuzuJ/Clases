package DataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Framework.APP;
import Framework.AppConfiguration;
import Framework.AppException;

public class PetDAC extends SQLiteDataHelper {

    public PetDAC() {
        super(AppConfiguration.getDBPathConnection());
    }
    public ResultSet getAllPet() throws AppException{
        try {
            String sql = "SELECT ID, NOMBRE, APELLIDO FROM PERSONA";
            return getResultSet(sql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllPet()");
        }
    }
    public ResultSet getPetById(int Id) throws AppException  {
        try {
            String sql = "SELECT ID, NOMBRE, APELLIDO "
                        +"FROM PERSONA "
                        +"WHERE ID = ? ";

            Connection conn = getConnection();
            PreparedStatement pstmt  = conn.prepareStatement(sql);
            pstmt.setInt(1, Id);
            //System.out.println(sql);
            return pstmt.executeQuery();
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass());
        }
    }
    public ResultSet getPetByNombre(String Nombre) throws AppException { 
        try {
            String sql = "SELECT ID, NOMBRE, APELLIDO "
                        +"FROM PERSONA "
                        +"WHERE NOMBRE LIKE ? ";

            Connection conn = getConnection();
            PreparedStatement pstmt  = conn.prepareStatement(sql);
            pstmt.setString(1, "%" + Nombre.trim() + "%");
            //System.out.println(sql);
            return pstmt.executeQuery();
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass());
        }
    }
}
