package OverJSON;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;



public class Test {

	public static void main(String[] args) {
		try {
			String url = "C:/Users/HP/Desktop/24h code/Projet24/24H/src/main/java/OverJSON/map.json";
			
			JsonReader reader = new JsonReader(new InputStreamReader(
					new FileInputStream(url)));
			JsonParser jsonParser = new JsonParser();
			JsonObject userArray = jsonParser.parse(reader).getAsJsonObject();
			System.out.println(userArray);
			JsonArray objets = userArray.getAsJsonArray("Objets ");
			System.out.println(objets);
			List<Extract> Extract = new ArrayList<Extract>();
			Gson myGson = new Gson();
			for (JsonElement JE : objets) {
				System.out.println(JE);
				Extract ex = myGson.fromJson(JE, Extract.class);
				Extract.add(ex);
				
			}
			for (Extract object : Extract) {
				System.out.println(object.getClass().getName());
				System.out.println(object.getType());
				System.out.println(object.getId());
				System.out.println(object.getLat());
				System.out.println(object.getLon());
				System.out.println(object.getNodes());
			}
		} 
		
		catch (Exception e) {
			
			System.err.println(e.getMessage());
		}
		
		try {
			Extract e = new Extract();
			Test.get("https://router.project-osrm.org/route/v1/driving/0.153669,47.923112;0.199556,48.006110?steps=true&continue_straight=true&overview=false");
			System.out.println(e.getId());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	    public static String get(String url) throws IOException{

		String source ="";
		URL oracle = new URL(url);
		URLConnection yc = oracle.openConnection();
		BufferedReader in = new BufferedReader(
		new InputStreamReader(
		yc.getInputStream()));
		String inputLine;

		while ((inputLine = in.readLine()) != null)
		source +=inputLine;
		in.close();
		System.out.println(source);
		return source;
		}

}


