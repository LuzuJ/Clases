package DataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Framework.AppConfiguration;
import Framework.AppException;

public class SexoDAC extends SQLiteDataHelper {
    public SexoDAC(){
        //      "jdbc://c: data7petda.db"
        super(AppConfiguration.getDBPathConnection());
    }

    public ResultSet getAllSexo() throws AppException{
        try {
            String sql ="SELECT  IdSexo, Nombre, Estado "+
                        "FROM    Sexo "+
                        "WHERE   Estado ='A' ";
            return getResultSet(sql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllSexo()");
        }
    }
    public ResultSet getSexoById(int IdSexo) throws AppException  {
        try {
            String sql ="SELECT  IdSexo, Nombre, Estado "+
                        "FROM    Sexo "+
                        "WHERE   IdSexo = ? ";

            Connection conn = getConnection();
            PreparedStatement pstmt  = conn.prepareStatement(sql);
            pstmt.setInt(1, IdSexo);
            //System.out.println(sql);
            return pstmt.executeQuery();
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getSexoById()");
        }
    }

}
