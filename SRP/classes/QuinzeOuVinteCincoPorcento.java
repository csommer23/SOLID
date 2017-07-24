package SRP.classes;

public class QuinzeOuVinteCincoPorcento implements RegradeCalculo{

	@Override
	public double calcula(Funcionario f) {
		if(f.getSalarioBase() > 3000.0) {
			return f.getSalarioBase() * 0.9;
		}

		else {
			return f.getSalarioBase() * 0.10;
		}
	}

}
