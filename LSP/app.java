package LSP;
import LSP.classes.*;

public class app {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("INICIO LSP");
		
		ContaComum contaComum = new ContaComum();
		contaComum.saca(3000);
		
		System.out.println(contaComum.rende().getSaldo());
		
	}

}
