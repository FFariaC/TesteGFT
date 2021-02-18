package testetecnico;

public abstract class Transporte {
	
	Carga carga = new Carga();
	
		
	public Transporte(Carga carga) {
		this.setCarga(carga);
	}

	public Carga getCarga() {
		return carga;
	}

	public void setCarga(Carga carga) {
		this.carga = carga;
	}

	public abstract float calculaFrete(Carga carga);
	}


