import java.util.Scanner;

public class CalcularIdade {
	
	public static void main(String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		
		int anoNascimento;
		int anoAtual;
		int idade;
		
		System.out.print("Digite o ano de nascimento: ");
		anoNascimento = entrada.nextInt();	

		System.out.print("Digite o ano atual: ");
		anoAtual = entrada.nextInt();
		
		  idade = anoAtual - anoNascimento;
		
		System.out.println("Sua idade é: " + idade);
		
	
	}
}