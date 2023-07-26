// import Scanner serve utilização do teclado
import java.util.Scanner;

public class CondicionalEncadeada{
	
	public static void main(String args[]) {
		
		// Objeto do tipo Scanner. "entrada" é o nome do Objeto
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual sua idade: ");
		int idade = entrada.nextInt();
		
		
		if(idade <= 12) {
			System.out.println("É uma criança: ");
			
		}else if(idade > 12 && idade <= 17){
			System.out.println("É um adolescente: ");
			
		}else if(idade > 17 && idade <= 60) {
			System.out.println("É um adulto: ");
			
		}else{
			System.out.println("É um idoso: ");
		}
		
		
	}
}