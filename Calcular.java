package testetecnico;

import java.util.Scanner;

public class Calcular {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Soma soma = new Soma();
		Subtracao subtracao = new Subtracao();
		Multiplicacao multiplicacao = new Multiplicacao();
		Divisao divisao = new Divisao();
		
		
		float x = scanner.nextFloat();
		float y = scanner.nextFloat();
		
		System.out.println("A soma dos dois n�meros �: " + soma.efetuarOperacao(x, y));
		System.out.println("A subtra��o dos dois n�meros �: " + subtracao.efetuarOperacao(x, y));
		System.out.println("A multiplica��o dos dois n�meros �: " + multiplicacao.efetuarOperacao(x, y));
		System.out.println("A divis�o dos dois n�meros �: " + divisao.efetuarOperacao(x, y));
		
		
		
		
		scanner.close();
		
		
	}

}
