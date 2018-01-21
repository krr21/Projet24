package Fourmi;

public class Steps {


	private Intersections[] intersections;


	    private String distance;

	    private String duration;

	    private String weight;

	    private String name;


    private String driving_side;

    private Maneuver maneuver;

    private String mode;

    private String geometry;

    public Intersections[] getIntersections ()
    {
        return intersections;
    }

    public void setIntersections (Intersections[] intersections)
    {
        this.intersections = intersections;
    }

    public String getDistance ()
    {
        return distance;
    }

    public void setDistance (String distance)
    {
        this.distance = distance;
    }

    public String getDuration ()
    {
        return duration;
    }

    public void setDuration (String duration)
    {
        this.duration = duration;
    }

    public String getWeight ()
    {
        return weight;
    }

    public void setWeight (String weight)
    {
        this.weight = weight;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getDriving_side ()
    {
        return driving_side;
    }

    public void setDriving_side (String driving_side)
    {
        this.driving_side = driving_side;
    }

    public Maneuver getManeuver ()
    {
        return maneuver;
    }

    public void setManeuver (Maneuver maneuver)
    {
        this.maneuver = maneuver;
    }

    public String getMode ()
    {
        return mode;
    }

    public void setMode (String mode)
    {
        this.mode = mode;
    }

    public String getGeometry ()
    {
        return geometry;
    }

    public void setGeometry (String geometry)
    {
        this.geometry = geometry;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [intersections = "+intersections+", distance = "+distance+", duration = "+duration+", weight = "+weight+", name = "+name+", driving_side = "+driving_side+", maneuver = "+maneuver+", mode = "+mode+", geometry = "+geometry+"]";
    }

}
