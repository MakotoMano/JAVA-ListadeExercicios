import java.util.Scanner;
public class Exercicio11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int num1, num2, num3;
		
		System.out.println("Valor 1 --> ");
		num1 = teclado.nextInt();
		System.out.println("Valor 2 --> ");
		num2 = teclado.nextInt();
		System.out.println("Valor 3 --> ");
		num3 = teclado.nextInt();
		

			
		
		if (num1 == num2 && num2 == num3 && num1 == num3) {
			System.out.println("Os três números são iguais");
		} else if (num1 > num2 && num2>num3 && num1>num3 ) {// maior = 1 menor = 3
			System.out.println("Número maior: " + num1);
			System.out.println("Número menor: " + num3);
		} else if (num1 > num2 && num3>num2 && num1>num3 ) { // maior = 1 menor = 2
			System.out.println("Número maior: " + num1);
			System.out.println("Número menor: " + num2);
		} else if (num2 > num1 && num1>num3 && num2>num3 ) {// maior = 2 menor = 3
			System.out.println("Número maior: " + num2);
			System.out.println("Número menor: " + num3);
		} else if (num2 > num1 && num2>num3 && num3>num1 ) { // maior = 2 menor = 1
			System.out.println("Número maior: " + num2);
			System.out.println("Número menor: " + num1);
		} else if (num3 > num1 && num1>num2 && num3>num2 ) {// maior = 3 menor = 2
			System.out.println("Número maior: " + num3);
			System.out.println("Número menor: " + num2);
		} 
		else {// maior  = 3 menor = 1
			System.out.println("Número maior: " + num3);
			System.out.println("Número menor: " + num1);
		}
	
	}

}
