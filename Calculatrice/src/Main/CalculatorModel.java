package Main;
import java.util.Stack;

public class CalculatorModel implements CalculatorModelInterface {
	private double accu;
	private Stack<Double> pile;
	
	public CalculatorModel (double accu, Stack<Double> pile) {
		accu=0;
		pile= new Stack<Double>();
	}
	/*
	public Stack push (Element element) {
		return Stack (pile.push(element));
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
	
	verifier qu'on peut faire un pop
	en la mettant dans le code et faisant tourner une boucle
	
	creer pile et accu
	*/
	
	// teste si la pile contient suffisamment d'elements pour réaliser une opération
	public Boolean test (Stack<Double> pile) {
		if (pile.size()>=2) 
			{return true;}
		else 
			{return false;}
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
		//verification conformité pile
		if (test(pile))
			{
		double resultat;
		resultat = pile.pop() + pile.pop();
		pile.push(resultat);
			}
	}

	@Override
	public void opposite() {
		// TODO Auto-generated method stub
		pile.push(pile.pop()*(-1));
		// on calcule l'opposé du dernier element de la pile et on le remet dans la pile
	}

	@Override
	public void substract() {
		// TODO Auto-generated method stub
		
		//verification conformité pile
		if (test(pile))
			{
		double resultat;
		resultat = pile.pop() - pile.pop();
		pile.push(resultat);
		opposite(); // ?????????????
			}
	}


	@Override
	public void multiply() {
		// TODO Auto-generated method stub
		
		//verification conformité pile
		if (test(pile))
			{
		double resultat;
		resultat = pile.pop() * pile.pop();
		pile.push(resultat);
			}
		
	}


	@Override
	public void divide() {
		// TODO Auto-generated method stub
		
		//verification conformité pile
		if (test(pile))
			{
		double a = pile.pop();
		double b = pile.pop();
		pile.push(b/a);
			}
	}



	@Override
	public void push(double nombre) {
		// TODO Auto-generated method stub
		pile.push(nombre);
	}


	@Override
	public double pop() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void drop() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void swap() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	

}

