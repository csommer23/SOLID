package OCP;

import OCP.classes.*;

public class app {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("INICIO OCP");
		
		TabelaDePreco tabelaPreco = new TabelaPrecoPadrao();
		ServicoDeEntrega entrega = new Frete();
		
		CalculadorDePrecos calc = new CalculadorDePrecos(tabelaPreco, entrega);
		
		double valor = calc.calcula(new Compra(3000,"SAO PAULO"));
		
		System.out.println("Valor Produto:"+valor);
	}

}
