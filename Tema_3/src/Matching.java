import java.util.LinkedList;

public class Matching {
	public static boolean validarExpresion(String exp) {
		LinkedList<Character> pila = new LinkedList<>();
		for(int i = 0; i < exp.length(); i++) {
			if(exp.charAt(i) == '(' || exp.charAt(i) == '[' || exp.charAt(i) == '{') {
				pila.push(exp.charAt(i));
			} else if (exp.charAt(i) == ')' || exp.charAt(i) == ']' || exp.charAt(i) == '}') {
				if(pila.isEmpty()) {
					return false;
				}
				if(exp.charAt(i) == ')' && pila.pop() != '(') {
					return false;
				} else if (exp.charAt(i) == ']' && pila.pop() != '[') {
					return false;
				} else if (exp.charAt(i) == '}' && pila.pop() != '{') {
					return false;
				}
			}
		}
		return pila.isEmpty();
	}
	
	
	public static void main(String[] args) {
		System.out.println(validarExpresion("()(){}{}[}[][]"));
	}

}
