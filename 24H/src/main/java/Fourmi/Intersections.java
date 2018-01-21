package Fourmi;

public class Intersections {

	 private String[] location;

	    private String[] bearings;

	    private String[] entry;

	    private String in;

	    private String out;

	    public String[] getLocation ()
	    {
	        return location;
	    }

	    public void setLocation (String[] location)
	    {
	        this.location = location;
	    }

	    public String[] getBearings ()
	    {
	        return bearings;
	    }

	    public void setBearings (String[] bearings)
	    {
	        this.bearings = bearings;
	    }

	    public String[] getEntry ()
	    {
	        return entry;
	    }

	    public void setEntry (String[] entry)
	    {
	        this.entry = entry;
	    }

	    public String getIn ()
	    {
	        return in;
	    }

	    public void setIn (String in)
	    {
	        this.in = in;
	    }

	    public String getOut ()
	    {
	        return out;
	    }

	    public void setOut (String out)
	    {
	        this.out = out;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [location = "+location+", bearings = "+bearings+", entry = "+entry+", in = "+in+", out = "+out+"]";
	    }
}
