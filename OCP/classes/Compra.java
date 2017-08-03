package OCP.classes;

public class Compra {
	
	double _valor;
	String _cidade;
	
	public Compra(double valor, String cidade) {
		_valor = valor;
		_cidade = cidade;
	}
	
	public double getValor() {
		return _valor;
	}
	
	public String getCidade() {
		return _cidade;
	}
}
