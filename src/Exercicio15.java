import java.util.Scanner;
public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		int idade;
		
		System.out.print("Idade --> ");
		idade = teclado.nextInt();
		
		if (idade<5) {
			System.out.print("Não é possível participar");
		}
		
		switch (idade) {
		
		case 5:
			System.out.println("Categoria Infantil A");
			break;
		case 6:
			System.out.println("Categoria Infantil A");
			break;
		case 7:
			System.out.println("Categoria Infantil A");
			break;
		case 8:
			System.out.println("Categoria Infantil B");
			break;
		case 9:
			System.out.println("Categoria Infantil B");
			break;
		case 10:
			System.out.println("Categoria Infantil B");
			break;
		case 11:
			System.out.println("Categoria Infantil A");
			break;
		case 12:
			System.out.println("Categoria Infantil A");
			break;
		case 13:
			System.out.println("Categoria Infantil A");
			break;
		case 14:
			System.out.println("Categoria Infantil B");
			break;
		case 15:
			System.out.println("Categoria Infantil B");
			break;
		case 16:
			System.out.println("Categoria Infantil B");
			break;
		case 17:
			System.out.println("Categoria Infantil B");
			break;
			
		default:
			System.out.println("Categoria Senior");
			
			
		
		}
		
		
		
	}

}
