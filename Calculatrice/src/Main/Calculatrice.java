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
	public Float ajouter (Float nb1,Float nb2) {	
		resultat =  nb1 + nb2;
		return  resultat;
	}
	
	public Float soustraire (Float nb1, Float nb2 ) {
		resultat = nb1 - nb2;
		return resultat;
	}
	
	public Float multiplier (Float nb1, Float nb2 ) {
		resultat =  nb1*nb2;
		return resultat;
	}
	
	public Float diviser (Float nb1, Float nb2 ) {
		resultat = nb1/nb2;
		return resultat;
	}

}
