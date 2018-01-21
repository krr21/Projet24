import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.kohsuke.rngom.parse.Parseable;

import com.google.gson.JsonObject;

import Fourmi.Seed;

public class Main {
	
	static List<Seed> seeds = new ArrayList();
	static String token = null;
	static SeedAround seedAround;

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws IOException {
		
		Connexion connexion = new Connexion();
		token = connexion.connect();
		seedAround = new SeedAround();
		String value = seedAround.seedAround(connexion.connect());
		System.out.println(value.toString());
		//JSONObject jsonObject = new JSONObject(value.toString());
		
		JSONArray jsonArray = new JSONArray(value.toString());
		
		seeds = new ArrayList<Seed>();
		
		for(int i=0; i<jsonArray.length(); i++) {
			Seed seed = new Seed();
			
			seed.set_id(jsonArray.getJSONObject(i).getString("_id"));
			seed.setActive(String.valueOf(jsonArray.getJSONObject(i).getBoolean("active")));
			seed.setInfo(jsonArray.getJSONObject(i).getString("info"));
			seed.setName(jsonArray.getJSONObject(i).getString("name"));
			seed.setType(jsonArray.getJSONObject(i).getString("type"));
			
			System.out.println(seed.toString());
			seeds.add(seed);	
		}
	
		for(int i=0; i<seeds.size(); i++) {
			int num_graine = i+1;
			System.out.println("Recherche de la graine " + num_graine);
			System.out.println("id = " + seeds.get(2).get_id());
			String resultSeed = seedAround.getSeed(token, seeds.get(2).get_id());
			System.out.println(resultSeed);
		}
		
	}

}
