// import Scanner serve utiliza��o do teclado
import java.util.Scanner;

public class CondicionalEncadeada{
	
	public static void main(String args[]) {
		
		// Objeto do tipo Scanner. "entrada" � o nome do Objeto
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual sua idade: ");
		int idade = entrada.nextInt();
		
		
		if(idade <= 12) {
			System.out.println("� uma crian�a: ");
			
		}else if(idade > 12 && idade <= 17){
			System.out.println("� um adolescente: ");
			
		}else if(idade > 17 && idade <= 60) {
			System.out.println("� um adulto: ");
			
		}else{
			System.out.println("� um idoso: ");
		}
		
		
	}
}