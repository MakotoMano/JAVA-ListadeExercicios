import java.util.Scanner;
public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		double vendas, salario;
		
		System.out.print("Vendas neste mês --> ");
		vendas = teclado.nextDouble();
		
		if (vendas > 25000) {
			salario = 1.175 * vendas;
			System.out.println("Salário deste mês --> " + salario);
		}
		else {
			salario = 1.0885 * vendas;
			System.out.println("Salário deste mês --> " + salario);
		}
		
	}

}
