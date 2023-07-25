public class Logicos{
	
	public static void main (String arg []) {
		
		int num1 = 5 * 3;
		int num2 = 5 + 5;
		// && AND, utilizado para que duas expressões sejam verdadeiras
		// || OR,utilizado quando pelo menos uma das expressões sejam verdadeiras
		boolean res = num1 < num2 && num1 == 7;
		
		System.out.println(res);
	}
}