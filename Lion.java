
public class Lion {
	private String location = "Earth";
	private boolean withScientist = false; //false if not with scientist
	

	public Lion() {
		
	}
	
	public void toMars() {
		location = "Mars";
	}
	
	public void toEarth() {
		location = "Earth";
	}
	
	public String getLocation()
	{
		return location;
	}
}
