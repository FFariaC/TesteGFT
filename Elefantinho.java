package testetecnico;

import java.util.Scanner;

public class Elefantinho {
	public static void main(String[] args) {
		
		// Lendo o número de elefantinhos desejado pelo usuário
		
		Scanner scanner = new Scanner(System.in);
		
		int incomoda = scanner.nextInt();
		
		System.out.println("Um elefante incomoda muita gente!");
		System.out.print(incomoda + " elefantes ");
		
		// Laço de repetição para repetir a palavra desejada
		
		for (int i = 0; i < incomoda; i ++) {
			System.out.print("incomoda ");
		}
		
		System.out.println("muito mais!");
		
		
		
		scanner.close();
	}

}
