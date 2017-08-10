package LSP.classes;

public class ContaComum {

	private ManipuladorDeSaldo minupulador;
	
	public ContaComum() {
		minupulador = new ManipuladorDeSaldo();
	}
	
	public ContaComum saca(double valor) {
		minupulador.adiciona(valor);
		return this;
	}
	
	public ContaComum rende() {
		minupulador.juros(0.005);
		return this;
	}
	
	public double getSaldo() {
		return minupulador.getSaldo();
	}

}
