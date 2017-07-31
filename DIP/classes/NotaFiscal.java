package DIP.classes;

import java.util.List;


public class NotaFiscal {

	private List<AcaoAposGerarNota> acoes;
	
	public NotaFiscal(List<AcaoAposGerarNota> acoes) {
		this.acoes = acoes;
	}
	
	public void gerar() {
		
		for(AcaoAposGerarNota acao : acoes) {
			acao.Executa();
		}
	}

}
