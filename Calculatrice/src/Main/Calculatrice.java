package Main;
import java.util.Stack;

public abstract Calculatrice {
	
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
	
	
	
	public abstract void add() {
		pop()
		
	}
	
}



//

