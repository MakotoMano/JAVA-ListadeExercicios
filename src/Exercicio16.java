import java.util.Scanner;
public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		double lado1, lado2, lado3;
		
		System.out.print("Lado 1 --> ");
		lado1 = teclado.nextDouble();
		
		System.out.print("Lado 2 --> ");
		lado2 = teclado.nextDouble();
		
		System.out.print("Lado 3 --> ");
		lado3 = teclado.nextDouble();
	
		if (lado1 > lado2 + lado3 || lado2 > lado1 + lado3 || lado3 > lado1 + lado2 && lado1 < 0 && lado2 < 0 && lado3 < 0) {
			System.out.println("Não é possível formar um triângulo com esses valores");
		} else if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
			System.out.println("É um triângulo equilátero");
		} else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
			System.out.println("É um triângulo isósceles");
		} 
		else {
			System.out.println("É um triângulo escaleno");
		}
		
	}

}
