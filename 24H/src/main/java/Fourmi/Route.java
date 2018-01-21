package Fourmi;

public class Route {

	private String sens;
	private double maxSpeed;
	private String type;

	private String distance;

	private String duration;

	private String weight;

	private String weight_name;

	private Legs[] legs;

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

	public String getWeight_name ()
	{
		return weight_name;
	}

	public void setWeight_name (String weight_name)
	{
		this.weight_name = weight_name;
	}

	public Legs[] getLegs ()
	{
		return legs;
	}

	public void setLegs (Legs[] legs)
	{
		this.legs = legs;
	}

	public String getSens() {
		return sens;
	}
	public void setSens(String sens) {
		this.sens = sens;
	}
	public double getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString()
	{
		return "ClassPojo [distance = "+distance+", duration = "+duration+", weight = "+weight+", weight_name = "+weight_name+", legs = "+legs+"]";
	}



}
