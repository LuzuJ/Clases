package BusinessLogic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BusinessLogic.Entities.Sexo;
import DataAccess.SexoDAC;
import Framework.AppException;

public class SexoBL {
    
    public List<Sexo> GetAllSexo() throws AppException{
        try {
            SexoDAC sexoDAC = new SexoDAC(); 
            List<Sexo> lstSexo = new ArrayList<Sexo>();

            ResultSet rs =  sexoDAC.getAllSexo();
            while(rs.next())    {
                Sexo s = new Sexo(  rs.getInt(   "IdSexo"),
                                    rs.getString("Nombre"),
                                    rs.getString("Estado")); 
                lstSexo.add(s);
            }
            return lstSexo; 
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(),"GetAllSexo");
        }
    } 

}
