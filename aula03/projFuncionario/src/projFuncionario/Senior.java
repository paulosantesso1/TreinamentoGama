package projFuncionario;

public class Senior extends Funcionario {
	private double bonus;
	
	public Senior(String nome, int horasTrabalhadas, double valorPorHora, double bonus) {
		super(nome, horasTrabalhadas, valorPorHora);
		this.bonus = bonus;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public double calcularSalario() {
		return super.calcularSalario() + bonus * (getHorasTrabalhadas() / 10);
	}
	
	@Override
	public String exibirDados() {
		return super.exibirDados() + " - " + bonus;
	}
}
