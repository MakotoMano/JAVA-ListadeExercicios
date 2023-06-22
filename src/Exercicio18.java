import java.util.Scanner;
public class Exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		double a, b, c, d, e, f;
		double delta, deltaX, deltaY;
		double x, y;
		
		System.out.print("Valor A --> ");
		a = teclado.nextDouble();
		
		System.out.print("Valor B --> ");
		b = teclado.nextDouble();
		
		System.out.print("Valor C --> ");
		c = teclado.nextDouble();
		
		System.out.print("Valor D --> ");
		d = teclado.nextDouble();
		
		System.out.print("Valor E --> ");
		e = teclado.nextDouble();
		
		System.out.print("Valor F --> ");
		f = teclado.nextDouble();
		
		delta = a*e - b*d;
		deltaX = c*e - b*d;
		deltaY = a*f - c*d;
		x = deltaX / delta;
		y = deltaY / delta;
		
		if (delta == 0 && deltaX != 0 && deltaY != 0) {
			System.out.println("Não existe solução");
			
		} else if (delta == 0 && deltaX == 0 && deltaY == 0) {
			System.out.println("Existem infinitas soluções");
			
		} else {
			System.out.println("Existem uma única solução");
					
		}
		
		System.out.println("X --> " + x);
		System.out.println("Y --> " + y);
		
	}

}
