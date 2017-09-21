/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumni.api;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HttpsURLConnection;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Guinness
 */
public class API {

    private final String USER_AGENT = "Mozilla/5.0";

    public static void main2(String[] args) throws Exception {

//        API http = new API();
//
//        System.out.println("Testing 1 - Send Http GET request");
//        String jsonString = http.sendGet();
//        System.out.println(jsonString);
        API http = new API();
        String url = "http://spudaa.com/api/users";
        String json_content = http.sendGet(url).toString();
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(json_content);

        JSONArray results = (JSONArray) json.get("users");
        for (int i = 0; i < results.size(); i++) {
            // obtaining the i-th result
            JSONObject result = (JSONObject) results.get(i);
            System.out.println(result);
            String id = result.get("id").toString();
            String first_name = ifNull(result.get("first_name"));
            System.out.println("id: " + id);

            String imageUrl = "http://spudaa.com/src/images/users/" + id + ".jpg";
            String destinationFile = "C:\\Users\\Guinness\\Desktop\\" + id + ".jpg";
            saveImage(imageUrl, destinationFile);
        }

    }

    public static void saveImage(String imageUrl, String destinationFile) {
        try {
            URL url = new URL(imageUrl);
            InputStream is = url.openStream();
            OutputStream os = new FileOutputStream(destinationFile);
            
            byte[] b = new byte[2048];
            int length;
            
            while ((length = is.read(b)) != -1) {
                os.write(b, 0, length);
            }
            
            is.close();
            os.close();
        } catch (MalformedURLException ex) {
            Logger.getLogger(API.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(API.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String ifNull(Object stmt) {
        if (stmt == null) {
            return "";
        } else {
            return stmt.toString();
        }
    }

    // HTTP GET request
    public Object sendGet(String url) throws Exception {

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
//        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        return response;

    }

    // HTTP POST request
    public void sendPost() throws Exception {

        String url = "https://selfsolve.apple.com/wcResults.do";
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        //add reuqest header
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

        String urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";

        // Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + urlParameters);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

    }
}
