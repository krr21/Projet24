package Fourmi;

public class Legs {
	 private String summary;

	    private String distance;

	    private String duration;

	    private String weight;

	    private Steps[] steps;

	    public String getSummary ()
	    {
	        return summary;
	    }

	    public void setSummary (String summary)
	    {
	        this.summary = summary;
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

	    public Steps[] getSteps ()
	    {
	        return steps;
	    }

	    public void setSteps (Steps[] steps)
	    {
	        this.steps = steps;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [summary = "+summary+", distance = "+distance+", duration = "+duration+", weight = "+weight+", steps = "+steps+"]";
	    }
}
