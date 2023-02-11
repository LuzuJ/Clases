package DataAccess;

import javax.net.ssl.HttpsURLConnection;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public abstract class APIDataHelper {
    protected static HttpURLConnection getConection(URL url) throws IOException {
        HttpURLConnection conn;
        conn = (HttpsURLConnection) url.openConnection();
        return conn;
    }
}
