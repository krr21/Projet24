package Fourmi;

public class Course {

	//declaration des variables
	private Route2[] routes;

	private String code;

	private Waypoints[] waypoints;

	//getters and setters 

	public Route2[] getRoutes ()
	{
		return routes;
	}

	public void setRoutes (Route2[] routes)
	{
		this.routes = routes;
	}

	public String getCode ()
	{
		return code;
	}

	public void setCode (String code)
	{
		this.code = code;
	}

	public Waypoints[] getWaypoints ()
	{
		return waypoints;
	}

	public void setWaypoints (Waypoints[] waypoints)
	{
		this.waypoints = waypoints;
	}

	@Override
	public String toString()
	{
		return "ClassCourse [routes = "+routes+", code = "+code+", waypoints = "+waypoints+"]";
	}
}
