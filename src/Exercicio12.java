import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		double valorCompra, valorVenda, lucro;
		String produto;

		System.out.print("Nome do produto --> ");
		produto = teclado.next();

		System.out.print("Valor de compra --> ");
		valorCompra = teclado.nextDouble();

		if (valorCompra < 20) {
			lucro = 1.4;
			valorVenda = valorCompra * lucro;
			System.out.println("Terei que vender o " + produto + " por R$" + valorVenda);
		} else if (valorCompra >= 20 && valorCompra < 100) {
			lucro = 1.3;
			valorVenda = valorCompra * lucro;
			System.out.println("Terei que vender o " + produto + " por R$" + valorVenda);
		} else {
			lucro = 1.2;
			valorVenda = valorCompra * lucro;
			System.out.println("Terei que vender o " + produto + " por R$" + valorVenda);
		}

	}

}
