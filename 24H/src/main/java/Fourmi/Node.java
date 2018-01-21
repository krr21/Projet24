package Fourmi;

import java.io.Serializable;

public class Node implements Serializable { 
	 
	  private static final long serialVersionUID = 1l; 
	  private double lat; 
	  private double lon; 
	  private double id;
	 
	  public Node() { 
	  } 
	 
	  public Node(double latitude, double longitude) { 
	    lat = latitude; 
	    lon= longitude; 
	  } 
	  
	  public double getLatitude() { 
	    return lat; 
	  } 
	 
	  public void setLatitude(double latitude) { 
	    latitude = lat; 
	  } 
	 
	  public double getLongitude() { 
	    return lon; 
	  } 
	 
	  public void setLongitude(double longitude) { 
	    longitude = lon; 
	  } 
	 
	  public double getY() { 
	    return getLatitude(); 
	  } 
	 
	  public void setY(double latitude) { 
	    setLatitude(latitude); 
	  } 
	 
	  public double getX() { 
	    return getLongitude(); 
	  } 
	 
	  public void setX(double longitude) { 
	    setLongitude(longitude); 
	  } 
	 
	 
	  public String toString() { 
	    return "Node{" + 
	        "Id" + id + 
	        "latitude=" + lat + 
	        ", longitude=" + lon + 
	        + '}'; 
	  } 
	}