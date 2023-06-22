import java.util.Scanner;
public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner (System.in);
		double preco, distancia, desconto;
		int dias;
		
		System.out.print("Dias de estadia --> ");
		dias = teclado.nextInt();
		
		System.out.print("Distância percorrrida --> ");
		distancia = teclado.nextDouble();
		desconto = 0.7;
		
		if (dias >= 7 && distancia > 800) {
			preco = (2.5 * distancia) * desconto;
			System.out.println("Total a pagar --> " + preco);
		} else {
			preco = 2.5 * distancia;
			System.out.println("Total a pagar --> " + preco);
		}
		
	}

}
