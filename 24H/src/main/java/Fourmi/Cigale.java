package Fourmi;

public class Cigale {
	
	Fourmis f = new Fourmis();
	
	public boolean trajetValide() {
		
		if (f.enDehors() == true)
		{
			return false;
		}
		if (f.routeInterdite() == true)
		{
			return false;
		}
		if (f.verifRalentPrioDroite() == false)
		{
			return false;
		}
		if (f.verifStopFeu() == false)
		{
			return false;
		}
		
		return true;
		
	}
}
