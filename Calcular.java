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
		
		System.out.println("A soma dos dois números é: " + soma.efetuarOperacao(x, y));
		System.out.println("A subtração dos dois números é: " + subtracao.efetuarOperacao(x, y));
		System.out.println("A multiplicação dos dois números é: " + multiplicacao.efetuarOperacao(x, y));
		System.out.println("A divisão dos dois números é: " + divisao.efetuarOperacao(x, y));
		
		
		
		
		scanner.close();
		
		
	}

}
