import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.kohsuke.rngom.parse.Parseable;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import Fourmi.Course;
import Fourmi.Point;
import Fourmi.Seed;
import OverJSON.TestMain;

public class Main {
	
	static List<Seed> seeds = new ArrayList();
	static String token = null;
	static SeedAround seedAround;
	static Point departPoint;

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
	
		Course course;
		for(int i=0; i<seeds.size(); i++) {
			int num_graine=i;
			if(i!=seeds.size()-1) {
				num_graine = i+1;
			}
			System.out.println("Recherche de la graine " + num_graine);
			System.out.println("id = " + seeds.get(i).get_id());
			String resultSeed = seedAround.getSeed(token, seeds.get(i).get_id());
			Point arrivalPoint = getCoordinates(seedAround.getSeed(token, seeds.get(num_graine).get_id()));
			if(i==0) {
				departPoint = getCoordinates(resultSeed);
			}
			//appel de orsm pour avoir les parcours possible
			course = formatCourse(departPoint, arrivalPoint);
			
		}
		
	}
	
	private static Point getCoordinates(String text) {
		Point point = new Point();
		JSONObject jsonObject = new JSONObject(text);
		JSONObject jsonObject2 = jsonObject.getJSONObject("location");
		point.setLat((jsonObject2.getJSONArray("coordinates")).getDouble(0));
		point.setLon((jsonObject2.getJSONArray("coordinates")).getDouble(1));
		return point;
	}
	
	private static Course formatCourse(Point p1, Point p2) throws IOException {
		Course course = new Course();
		
		TestMain testMain = new TestMain();
		String textToParse = testMain.getCourse(p1, p2);
		JSONObject jsonObject = new JSONObject(textToParse);
		Gson gson = new Gson();
		course = gson.fromJson(textToParse, Course.class);
		System.out.println("Course" + course.toString());
		
		return course;
	}

}
