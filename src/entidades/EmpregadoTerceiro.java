package entidades;

public class EmpregadoTerceiro extends Empregado {
	
	private Double custoAdicional;
	
	// construtores
	
	public EmpregadoTerceiro() {
		super();
	}

	public EmpregadoTerceiro(String nome, Integer horas, Double valorHora, Double custoAdicional) {
		super(nome, horas, valorHora);
		this.custoAdicional = custoAdicional;
	}

	// Getters e Setters
	
	public Double getCustoAdicional() {
		return custoAdicional;
	}

	public void setCustoAdicional(Double custoAdicional) {
		this.custoAdicional = custoAdicional;
	}
	
	// Método subreescrito de pagamento
	
	@Override
	public double pagamento() {
		return super.pagamento() + custoAdicional * 1.1;
	}

}
