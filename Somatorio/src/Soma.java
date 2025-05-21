import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Digite A: ");
			int numero1 = scanner.nextInt();
			
			System.out.print("Digite B: ");
			int numero2 = scanner.nextInt();
			
			int soma = numero1 + numero2;
			
			System.out.println("A soma de " + numero1 + " + " + numero2 + " é igual à: " + soma );
			
			scanner.close();
	}
	
}