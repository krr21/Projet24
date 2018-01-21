package Fourmi;

public class Waypoints {

	 private String[] location;

	    private String name;

	    private String hint;

	    public String[] getLocation ()
	    {
	        return location;
	    }

	    public void setLocation (String[] location)
	    {
	        this.location = location;
	    }

	    public String getName ()
	    {
	        return name;
	    }

	    public void setName (String name)
	    {
	        this.name = name;
	    }

	    public String getHint ()
	    {
	        return hint;
	    }

	    public void setHint (String hint)
	    {
	        this.hint = hint;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [location = "+location+", name = "+name+", hint = "+hint+"]";
	    }
}
