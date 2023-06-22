import java.util.Scanner;
public class ExercicioVII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int num1, num2;
		
		System.out.print("Digite um número --> ");
		num1 = teclado.nextInt();
		System.out.print("Digite o segundo número, menor que o primeiro --> ");
		num2 = teclado.nextInt();
		
	    
		if (num1 > num2 && num1 % num2 == 0) {
			System.out.println("Os valores são múltiplos um do outro");
		} 
		else {
			System.out.println("Os valores não são múltiplos um do outro");		
		}
		
		
	}

}
