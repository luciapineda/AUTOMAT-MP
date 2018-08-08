
public class Decider {
	
	public Decider() {
		
	}
	
//	public Decider(Lion l, Cow c, Grain g, Human h1, Human h2) {
//		this.lion = l;
//		this.cow = c;
//		this.grain = g;
//		this.human1 = h1;
//		this.human2 = h2;
//	}
	
	public boolean decide(Lion l, Cow c, Grain g, Human h1, Human h2) {
		if(c.getLocation().equals(l.getLocation()) ||       //cow is in same place as lion
		   h1.getLocation().equals(l.getLocation()) ||    //human1 is in same place as lion
		   h2.getLocation().equals(l.getLocation()) ||    //human2 is in same place as lion
		   h1.getLocation().equals(c.getLocation()) ||     //human1 is in same place as cow
		   h2.getLocation().equals(c.getLocation()) ||     //human2 is in same place as cow
		   c.getLocation().equals(g.getLocation()))        //cow is in same place as grain
		{
			return false;
		}
		else
		{			
			return true;
		}
	}
}
