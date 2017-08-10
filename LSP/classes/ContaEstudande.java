package LSP.classes;

public class ContaEstudande {

	private ManipuladorDeSaldo manipulador;
	public ContaEstudande() {		
		manipulador = new ManipuladorDeSaldo();	
	}
	
	public ContaEstudande saca(double valor) {
		manipulador.adiciona(valor);
		return this;
	}

}
