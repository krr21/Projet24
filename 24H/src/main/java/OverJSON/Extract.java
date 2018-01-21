package OverJSON;

import java.util.List;

public class Extract {

	//declarations des variables
	private String type;
	private Long id;
	private double lat;
	private double lon;
	private List<Long>nodes;
	
	
	//getters and setters
	public List<Long> getNodes() {
		return nodes;
	}
	public void setNodes(List<Long> nodes) {
		this.nodes = nodes;
	} String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
}
