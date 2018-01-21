import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.logging.Logger;

import Fourmi.Graine;

public class SeedAround {
	//private static final Logger LOG = Logger.getLogger(SeedAround.class);
	
	public static String seedAround(String token) throws IOException{
		
		 URL url = new URL("https://f24h2018.herokuapp.com/api/seeds/search");
         HttpURLConnection httpConnection  = (HttpURLConnection) url.openConnection();
         httpConnection.setDoOutput(true);
         httpConnection.setRequestMethod("GET");
         httpConnection.setRequestProperty("Content-Type", "application/json");
         httpConnection.setRequestProperty("Accept", "application/json");
         httpConnection.setRequestProperty("Authorization", "Bearer " + token); 
         
         BufferedReader rd = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
	      String line;
	      StringBuilder result = new StringBuilder();
	      while ((line = rd.readLine()) != null) {
	         result.append(line);
	      }
	      rd.close();
	      return result.toString();
		
	}
	 public static String getHTML(String urlToRead) throws Exception {
	      StringBuilder result = new StringBuilder();
	      URL url = new URL(urlToRead);
	      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	      conn.setRequestMethod("GET");
	      BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	      String line;
	      while ((line = rd.readLine()) != null) {
	         result.append(line);
	      }
	      rd.close();
	      return result.toString();
	   }
	 public static void main(String[] args) throws Exception
	   {
	     System.out.println(seedAround("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI1YTYyNjI0MjczNGQxZDc4MTc0MzZiNjEiLCJyb2xlIjoiYW50IiwiaWF0IjoxNTE2NTA3NTQ0LCJleHAiOjE1MTY1MjU1NDR9.lzzGYE_uagVpCqtU5qL-zwHUBadygafrvNV2oUbGyvk"));
	   }

	
}
