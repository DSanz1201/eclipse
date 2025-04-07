import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class NumerosLoteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> numeros = new HashSet<>();
		
		Random random = new Random();
		
		while(numeros.size() < 6) {
			numeros.add(random.nextInt(50) + 1);
		}
		
		System.out.println(numeros);
		
	}

}
