import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner (System.in);
		double salario, taxa, imposto = 0;
		
		System.out.println("Seu salário --> ");
		salario = teclado.nextDouble();
		
		if (salario < 10000) {
			System.out.println("Isento");
		}
			else if (salario > 10000 && salario <= 25000 ){
				taxa = 0.1035;
				imposto = salario * taxa; 
				
			} 
				else if (salario > 25000 && salario <=50000) {
					taxa = 0.2542;
					imposto = salario * taxa;
					
				} 
					else {
						taxa = 0.2975;
						imposto = salario * taxa;
						
					}
		
		System.out.println("Valor imposto de renda -->" + imposto);
		
	}

}
