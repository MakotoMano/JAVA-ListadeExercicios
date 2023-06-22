import java.util.Scanner;
public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner (System.in);
		double compra, desconto;
		
		System.out.print("Valor da compra --> ");
		compra = teclado.nextDouble();
		
		if (compra >= 350) {
			desconto = 0.78;
			compra = compra * desconto;
			System.out.println("Valor da compra --> " + compra);
		}
		else {
			desconto = 0.85;
			compra = compra * desconto;
			System.out.println("Valor da compra --> " + compra);
			
		}
		
		
		
	}

}
