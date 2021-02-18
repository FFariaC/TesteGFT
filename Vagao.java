package testetecnico;

public class Vagao extends Transporte {

	
	
	
	public Vagao(Carga carga) {
		super(carga);
	}

	@Override
	public float calculaFrete(Carga carga) {
		float frete = (this.carga.getPeso() * 20 / 100) + (this.carga.getValor() * 10 / 100);
		
		if(this.carga.getPeso() < 15000) {
			frete = frete + 5000;
		}
		
		return frete;
	}



}
