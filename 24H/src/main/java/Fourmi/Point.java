package Fourmi;

public class Point {

	//variable des points
	double lat;
	double lon;
	
	//constructeur
	public Point() {
	}
	public Point(double lat, double lon) {
		super();
		this.lat = lat;
		this.lon = lon;
	}
	
	//getters and setters

	public double getLat() {
		return lat;
	}
	

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	
	
	

}
