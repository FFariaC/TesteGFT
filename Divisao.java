package testetecnico;

public class Divisao extends Operacao {

	@Override
	public float efetuarOperacao(float x, float y) {
		if (y == 0) {
			System.out.println("� imposs�vel dividir por 0!");
			return 0;
		}
		return x / y;
	}

}
