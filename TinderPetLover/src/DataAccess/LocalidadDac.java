package DataAccess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Framework.APP;
import Framework.AppConfiguration;
import Framework.AppException;

public class LocalidadDac extends SQLiteDataHelper {

    public LocalidadDac() {
        super(AppConfiguration.getDBPathConnection());
    }


    public ResultSet getAllPais() throws AppException{
        try {
            String sql = "SELECT Idlocalidad, HId, Nombre, Estado, IdPertenece"
                        +"FROM LOCALIDAD "
                        +"WHERE IdPertenece = 1 ";
            return getResultSet(sql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllPais()");
        }
    }

    public ResultSet getAllZona() throws AppException{
        try {
            String sql = "SELECT Idlocalidad, HId, Nombre, Estado, IdPertenece"
                        +"FROM LOCALIDAD "
                        +"WHERE IdPertenece = 2 ";
            return getResultSet(sql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllPais()");
        }
    }

    public ResultSet getAllProvincia() throws AppException{
        try {
            String sql = "SELECT Idlocalidad, HId, Nombre, Estado, IdPertenece"
                        +"FROM LOCALIDAD "
                        +"WHERE IdPertenece = 3 ";
            return getResultSet(sql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllPais()");
        }
    }

    
    public ResultSet getAllCanton() throws AppException{
        try {
            String sql = "SELECT Idlocalidad, HId, Nombre, Estado, IdPertenece"
                        +"FROM LOCALIDAD "
                        +"WHERE IdPertenece = 4 ";
            return getResultSet(sql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllPais()");
        }
    }

    public ResultSet getAllCiudad() throws AppException{
        try {
            String sql = "SELECT Idlocalidad, HId, Nombre, Estado, IdPertenece"
                        +"FROM LOCALIDAD "
                        +"WHERE IdPertenece = 5 ";
            return getResultSet(sql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllPais()");
        }
    }

    public ResultSet getAllParroquia() throws AppException{
        try {
            String sql = "SELECT Idlocalidad, HId, Nombre, Estado, IdPertenece"
                        +"FROM LOCALIDAD "
                        +"WHERE IdPertenece = 6 ";
            return getResultSet(sql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllPais()");
        }
    }

    public ResultSet getPaisById(int Id) throws AppException  {
        try {
            String sql = "SELECT Idlocalidad, HId, Nombre, Estado, IdPertenece"
                        +"FROM LOCALIDAD "
                        +"WHERE IdPertenece = 1 "
                        +"AND IdLocalidad = ? ";

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

    public ResultSet getZonaById(int Id) throws AppException  {
        try {
            String sql = "SELECT Idlocalidad, HId, Nombre, Estado, IdPertenece"
                        +"FROM LOCALIDAD "
                        +"WHERE IdPertenece = 2 "
                        +"AND IdLocalidad = ? ";

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

    public ResultSet getProvinciaById(int Id) throws AppException  {
        try {
            String sql = "SELECT Idlocalidad, HId, Nombre, Estado, IdPertenece"
                        +"FROM LOCALIDAD "
                        +"WHERE IdPertenece = 3 "
                        +"AND IdLocalidad = ? ";

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

    public ResultSet getCantonById(int Id) throws AppException  {
        try {
            String sql = "SELECT Idlocalidad, HId, Nombre, Estado, IdPertenece"
                        +"FROM LOCALIDAD "
                        +"WHERE IdPertenece = 4 "
                        +"AND IdLocalidad = ? ";

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

    public ResultSet getCiudadById(int Id) throws AppException  {
        try {
            String sql = "SELECT Idlocalidad, HId, Nombre, Estado, IdPertenece"
                        +"FROM LOCALIDAD "
                        +"WHERE IdPertenece = 5 "
                        +"AND IdLocalidad = ? ";

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

    public ResultSet getParroquiaById(int Id) throws AppException  {
        try {
            String sql = "SELECT Idlocalidad, HId, Nombre, Estado, IdPertenece"
                        +"FROM LOCALIDAD "
                        +"WHERE IdPertenece = 6 "
                        +"AND IdLocalidad = ? ";

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

}
