package projFuncionario;

public class Funcionario {
	private String nome;
	private int horasTrabalhadas;
	private double valorPorHora;
	
	public Funcionario(String nome, int horasTrabalhadas, double valorPorHora) {
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
	}
	
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	
	public double getValorPorHora() {
		return valorPorHora;
	}
	
	public double calcularSalario() {
		return horasTrabalhadas * valorPorHora;
	}
	
	public String exibirDados() {
		return nome + " - " + valorPorHora + " - " + horasTrabalhadas;
	}
}
