package Main;
import java.util.Stack;

public class Calculatrice {
	
	/*
	public Stack push (Element element) {
		return new Stack (pile.push(element));
	}
	
	public Stack pop (Element element) {
		return new Stack (pile.pop(element));
	}
	
	public Stack drop (Element element) {
		return new Stack (pile.drop(element));
	}
	
	public Stack swap (Element element) {
		return new Stack (pile.swap(element));
	}
	
	public Stack clear (Element element) {
		return new Stack (pile.clear(element));
	}
	*/
	public Double opposite(Double element ) {
		return element*(-1);
	}
	
	
	public void add(Stack<Double> pile) {
		double resultat;
		resultat = pile.pop() + pile.pop();
		pile.push(resultat);
	}
	
	public void substract(Stack <Double>pile ) {
		double resultat;
		resultat = pile.pop() - pile.pop();
		pile.push(opposite(resultat));
	}
	
	public void multiply(Stack <Double> pile) {
		double resultat;
		resultat = pile.pop() * pile.pop();
		pile.push(resultat);
	}
	
	public void divide(Stack<Double> pile) {
		double a = pile.pop();
		double b = pile.pop();
		pile.push(b/a);
	}
	

}

