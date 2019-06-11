package entidades;

public class Empregado {
	
	private String nome;
	private Integer horas;
	private Double valorHora;
	
	//Construtores
	
	public Empregado() {
	}

	public Empregado(String nome, Integer horas, Double valorHora) {
		this.nome = nome;
		this.horas = horas;
		this.valorHora = valorHora;
	}
	
	//Getters e Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorHora() {
		return valorHora;
	}
	
	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}
	
	//Método pagamento
	
	public double pagamento() {
		return horas * valorHora;
	}
	
}
