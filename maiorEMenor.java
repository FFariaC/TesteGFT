package testetecnico;

import java.util.Scanner;

public class maiorEMenor {
	public static void main(String[] args) {
		// Declarando o array para ler os números introduzidos
		int[] numeros = new int[3];
				
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = scanner.nextInt();
		}
		
		// varrendo o array para encontra o maior e o menor número
		
		int oMaior = numeros[0];
		int oMenor = numeros[0];
		
		for (int j = 0; j < numeros.length; j++) {
			// Se o número do indice j for menor que o que está armazenado em oMenor, oMenor recebe este número
			if (numeros[j] < oMenor) {
				oMenor = numeros[j];
			}
			// Se o número do indice j for maior que o que está armazenado em oMaior, oMaior recebe este número
			if (numeros[j] > oMaior) {
				oMaior = numeros[j];
			}			
		}
		
		
		// mostrando os resultados
		
		
		if (oMenor == oMaior) {
			System.out.println("Os números inseridos são iguais");
		} else {
		
		System.out.println("O maior número é: " + oMaior);
		System.out.println("O menor número é: " + oMenor);
		
		}
		
		
		scanner.close();
	}
}
