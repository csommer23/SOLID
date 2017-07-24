package SRP.classes;

public class Funcionario {

	private Cargo cargo;
	private double salario;
	public Funcionario(Cargo cargo, double salario) {
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public Cargo getCargo() {		
		return cargo;
	}

	public double getSalarioBase() {
		return this.salario;
	}

}
