
//Importação de classe externa 
import java.util.Scanner;

// Classe principal
public class EntradaDados{
	
    // Metodo main
	public static void main(String args[]) {
		
		Scanner entrada = new Scanner (System.in);
		
		// Capturar números do teclado
		//System.out.print("Digite um ano: ");
		//int ano = entrada.nextInt();
		//System.out.println("Este e o ano " + ano);
		
		//Capturar Números Reais
		//System.out.print("Digite um valor: ");
		//float valor = entrada.nextFloat();
		//System.out.println(valor);
		
		//Capturar String (Texto) no prompt de comando CMD
		System.out.print("Digie seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Este e o seu nome? " + nome);
		
	}

}