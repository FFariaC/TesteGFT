package testetecnico;

public class Caminhao extends Transporte {
	
	
	

	public Caminhao(Carga carga) {
		super(carga);
	}

	@Override
	public float calculaFrete(Carga carga) {
		float frete = (this.carga.getPeso() * 12 / 100) + (this.carga.getValor() * 30 / 100);
		if (this.carga.getValor() > 40000) {
			frete = frete - (frete * 25/100);
		}
		return frete;
	}

}
