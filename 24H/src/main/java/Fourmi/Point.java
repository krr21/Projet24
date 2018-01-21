package Fourmi;

public class Point {

	double lat;
	double lon;
	
	public Point() {
		// TODO Auto-generated constructor stub
	}

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

	public Point(double lat, double lon) {
		super();
		this.lat = lat;
		this.lon = lon;
	}
	
	

}
