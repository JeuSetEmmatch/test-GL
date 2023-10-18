package Main;
import java.util.Stack;

public class CalculatorModel implements CalculatorModelInterface {
	private double accu;
	private Stack<Double> pile;
	
	public CalculatorModel (double accu, Stack<Double> pile) {
		accu=0;
		pile= new Stack<Double>();
	}

	
	
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
		if (pile.isEmpty()){return false}; //on verifie si la pile est vide, si oui on retourne un erreur
		else return pile.pop();// sinon on utilise pop()
	
	}

	@Override
	public void drop() {
		pile.removeElementAt(pile[-1]); // on enlève le dernier élément de la pile
	}
	

	@Override
	public void swap() {
		// TODO Auto-generated method stub
		a=pile[-1];
		b=pile[-2];
		pile[-1]=b;
		pile[-2]=a;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		pile.clear();
	}
	

}

