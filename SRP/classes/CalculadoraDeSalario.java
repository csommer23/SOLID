package SRP.classes;

public class CalculadoraDeSalario {
	
	public double calcula(Funcionario funcionario) {

		return funcionario.getCargo().getRegra().calcula(funcionario);
	}
}