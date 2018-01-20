package OverJSON;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.json.JSONWriter;

public class Test {

	public static void main(String[] args) {
		/*try {
			String url = "";
			JSONReader reader = new JsonReader(new InputStreamReader(
					new FileInputStream(url)));
			JSONParser jsonParser = new JSONParser();
			JSONObject userArray = jsonParser.parse(reader).getAsJsonObject();
			System.out.println(userArray);
			JsonArray objets = userArray.getAsJsonArray("Objets ");
			System.out.println(objets);
			List<Player> Player = new ArrayList<Player>();
			Gson myGson = new Gson();
			for (JsonElement aUser : objets) {
				System.out.println(aUser);
				Player aPlayer = myGson.fromJson(aUser, Player.class);
				Player.add(aPlayer);
				
			}
			for (Player object : Player) {
				System.out.println(object.getClass().getName());
				System.out.println(object.getA());
				System.out.println(object.getB());
				System.out.println(object.getC());
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}*/

	}

}
