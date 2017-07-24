package SRP;

import SRP.classes.*;

public class app {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("INICIO SRP");
		
		Funcionario func1 = new Funcionario(Cargo.DESENVOLVEDOR, 4000);
		
		CalculadoraDeSalario salario = new CalculadoraDeSalario();
		System.out.println(salario.calcula(func1));
	}

}
