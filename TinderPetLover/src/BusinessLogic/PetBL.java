package BusinessLogic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import DataAccess.PetDAC;
import Framework.AppException;
import BusinessLogic.Entities.Pet;

public class PetBL {
    public List<Pet> GetAllPets( ) throws AppException{
        try {
            PetDAC petDAC = new PetDAC();  
            List<Pet> pets = new ArrayList<Pet>();
            ResultSet rs = petDAC.getAllPet();
            while(rs.next())    {
                Pet p = new Pet(rs.getString("NOMBRE"), rs.getString("APELLIDO")); ;
                pets.add(p);
            }
            return pets;
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass());
        }
    } 
    public Stream<Pet> GetAllPet( ) throws AppException{
        try {
            PetDAC petDAC = new PetDAC();  
            Stream.Builder<Pet> builder = Stream.builder();
            ResultSet rs = petDAC.getAllPet();
            while(rs.next())    {
                Pet p = new Pet(rs.getString("NOMBRE"), rs.getString("APELLIDO")); ;
                builder.add(p);
            }
            return builder.build();
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass());
        }
    }
}
