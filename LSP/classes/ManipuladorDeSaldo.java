package LSP.classes;

public class ManipuladorDeSaldo {

	private double saldo;
	
	public void adiciona(double valor) {
		saldo += valor;
	}
	
	public void retira(double valor) {
		saldo -= valor;
	}
	
	public void juros(double taxa) {
		saldo += (saldo * taxa);
	}
	
	public double getSaldo() {
		return saldo;
	}
}
