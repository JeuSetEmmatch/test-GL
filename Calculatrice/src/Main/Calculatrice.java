package Main;

public class Calculatrice {
	
	private Float nb1;
	private Float nb2;
	private Float resultat;
			
	public Calculatrice (Float nb1, Float nb2) {
		Float[] pile = null;
		nb1=pile[-1];
		nb2=pile[-2];
		
		
	}
	public Float add (Float nb1,Float nb2) {	
		resultat =  nb1 + nb2;
		return  resultat;
	}
	
	public Float substract (Float nb1, Float nb2 ) {
		resultat = nb1 - nb2;
		return resultat;
	}
	
	public Float multiply (Float nb1, Float nb2 ) {
		resultat =  nb1*nb2;
		return resultat;
	}
	
	public Float divide (Float nb1, Float nb2 ) {
		resultat = nb1/nb2;
		return resultat;
	}

}
