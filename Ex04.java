package testetecnico;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		// Lendo os valores da carga
		
		Scanner scanner = new Scanner(System.in);
		
		Carga cargagft = new Carga();
		
		cargagft.setPeso(scanner.nextFloat());
		
		cargagft.setValor(scanner.nextFloat());
		
		// Declarando objetos para os valores do frete
		
		Vagao freteVagao = new Vagao(cargagft);
		Caminhao freteCaminhao = new Caminhao(cargagft);
		
		// Saída com o cálculo dos valores
		
		System.out.println("Frete de vagão: R$" + freteVagao.calculaFrete(cargagft));
		System.out.println("Frete de caminhão: R$" + freteCaminhao.calculaFrete(cargagft));
		
		
		scanner.close();	
		
	}
}
