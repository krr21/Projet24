package Fourmi;

public class Seed {


	//declaration des variables
            
    private String _id;

    private Location location;

    private String name;

    private String active;

    private String type;

    private String info;

    public String get_id ()
    {
        return _id;
    }
    
    //getters and setters

    public void set_id (String _id)
    {
        this._id = _id;
    }

    public Location getLocation ()
    {
        return location;
    }

    public void setLocation (Location location)
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

    public String getActive ()
    {
        return active;
    }

    public void setActive (String active)
    {
        this.active = active;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getInfo ()
    {
        return info;
    }

    public void setInfo (String info)
    {
        this.info = info;
    }

    @Override
    public String toString()
    {
        return "ClassSeed [_id = "+_id+", location = "+location+", name = "+name+", active = "+active+", type = "+type+", info = "+info+"]";
    }
}
			
			
