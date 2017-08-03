package OCP.classes;

public class CalculadorDePrecos {

	private TabelaDePreco _tabelaDePreco;
	private ServicoDeEntrega _entrega;
	
	public CalculadorDePrecos(TabelaDePreco tabelaDePreco, ServicoDeEntrega entrega) {
		_tabelaDePreco = tabelaDePreco;
		_entrega = entrega;
	}
	
	public double calcula(Compra produto) {
		
		double desconto = _tabelaDePreco.descontoPara(produto.getValor());
		
		double frete = _entrega.para(produto.getCidade());
		
		return produto.getValor() * (1 - desconto) + frete;
	}
}
