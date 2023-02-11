package DataAccess;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;

import Framework.APP;
import Framework.AppException;

public class UserDAC extends APIDataHelper {

    public JSONArray getUsers() throws AppException  {
        String contentJson = "";
        //HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        try {
            HttpURLConnection conn = getConection(new URL(APP.GLOBAL.API_GET_USER));
            conn.setRequestMethod("GET");
            //    conn.connect();
            //Getting the response code
            //if (conn.getResponseCode() != APP.GLOBAL.METHOD_OK){ // 200) {
            //    throw new RuntimeException("HttpResponseCode: error" + conn.getResponseCode());
            InputStream strm = conn.getInputStream();
            byte[] arrStream = strm.readAllBytes();
            for (byte b : arrStream) 
                contentJson += (char) b;
            // System.out.println(contentJson);}
            JSONArray json = new JSONArray(contentJson);
            return json;
        } catch (Exception e) {
            // ProtocolException  || MalformedURLException || IOException
            // e.printStackTrace();
            throw new AppException(e, getClass(), "getUsers() :" + e.getMessage());
        }
    }

}
