package testetecnico;

import java.util.Scanner;

public class maiorEMenor {
	public static void main(String[] args) {
		// Declarando o array para ler os n�meros introduzidos
		int[] numeros = new int[3];
				
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = scanner.nextInt();
		}
		
		// varrendo o array para encontra o maior e o menor n�mero
		
		int oMaior = numeros[0];
		int oMenor = numeros[0];
		
		for (int j = 0; j < numeros.length; j++) {
			// Se o n�mero do indice j for menor que o que est� armazenado em oMenor, oMenor recebe este n�mero
			if (numeros[j] < oMenor) {
				oMenor = numeros[j];
			}
			// Se o n�mero do indice j for maior que o que est� armazenado em oMaior, oMaior recebe este n�mero
			if (numeros[j] > oMaior) {
				oMaior = numeros[j];
			}			
		}
		
		
		// mostrando os resultados
		
		
		if (oMenor == oMaior) {
			System.out.println("Os n�meros inseridos s�o iguais");
		} else {
		
		System.out.println("O maior n�mero �: " + oMaior);
		System.out.println("O menor n�mero �: " + oMenor);
		
		}
		
		
		scanner.close();
	}
}
