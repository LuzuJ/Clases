package BusinessLogic;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import BusinessLogic.Entities.User;
import DataAccess.UserDAC;
import Framework.AppException;

public class UserBL {
    public List<User> getUsers() throws AppException {
        try {
            List<User> lstUsers = new ArrayList<User>();
            UserDAC UserDac = new UserDAC();
            JSONArray json = UserDac.getUsers();
            for (Object obj : json) {
                User u = new User(
                        Integer.parseInt(((JSONObject) obj).get("id").toString()),
                        ((JSONObject) obj).get("name").toString(),
                        ((JSONObject) obj).get("email").toString(),
                        ((JSONObject) obj).get("phone").toString(),
                        ((JSONObject) obj).get("website").toString(),
                        new JSONObject(((JSONObject) obj).get("company").toString()).get("name").toString());
                lstUsers.add(u);
            }
            return lstUsers;
        } catch (Exception e) {
            throw new AppException(e, getClass(), "getUsers() :" + e.getMessage());
        }
    }
}
