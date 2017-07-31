package DIP;
import java.util.ArrayList;
import java.util.List;
import DIP.classes.*;

public class app {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("INICIO DIP");
				
		List<AcaoAposGerarNota> acoes = new ArrayList<AcaoAposGerarNota>();			
		acoes.add(new NFDao());
		acoes.add(new QualquerOutraAcao());		
		NotaFiscal nf = new NotaFiscal(acoes);
		nf.gerar();
	}

}
