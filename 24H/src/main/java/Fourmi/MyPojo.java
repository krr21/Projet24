package Fourmi;

public class MyPojo {

	 private Route[] routes;

	    private String code;

	    private Waypoints[] waypoints;

	    public Route[] getRoutes ()
	    {
	        return routes;
	    }

	    public void setRoutes (Route[] routes)
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
	        return "ClassPojo [routes = "+routes+", code = "+code+", waypoints = "+waypoints+"]";
	    }
}
