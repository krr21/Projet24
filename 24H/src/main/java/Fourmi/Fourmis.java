package Fourmi;

public class Fourmis {
	
	private double vitesse;
	private boolean sens;
	private boolean support;
	private Node position;
	private boolean prioDroite;
	public double getVitesse() {
		return vitesse;
	}


	public void setVitesse(double vitesse) {
		this.vitesse = vitesse;
	}


	public Node getPosition() {
		return position;
	}


	public void setPosition(Node position) {
		this.position = position;
	}


	public boolean isPrioDroite() {
		return prioDroite;
	}


	public void setPrioDroite(boolean prioDroite) {
		this.prioDroite = prioDroite;
	}


	Feu feu = new Feu();
	
	public boolean isSens() {
		return sens;
	}


	public void setSens(boolean sens) {
		this.sens = sens;
	}


	public boolean isSupport() {
		return support;
	}


	public void setSupport(boolean support) {
		this.support = support;
	}


	public Feu getFeu() {
		return feu;
	}


	public void setFeu(Feu feu) {
		this.feu = feu;
	}
	
	
	public boolean verifStopFeu(){
		
		if(feu.isFeu() == true)
		{
			if (vitesse == 0)
			{
				return true;
			}
		}
		
		return false;
			
	};
	
	public boolean verifRalentPrioDroite() {
		
		if(prioDroite == true)
		{
			if (vitesse<=25 && vitesse>=10)
			{
				return true;
			}
				
		}
		return false;
	}
		
		
	

	
	
	
	
}
