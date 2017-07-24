package SRP.classes;

public enum Cargo {
	DESENVOLVEDOR(new DezOuVintePorcento()),
	DBA(new QuinzeOuVinteCincoPorcento()),
	TESTER(new QuinzeOuVinteCincoPorcento()),;
	
	private RegradeCalculo regra;
	
	Cargo(RegradeCalculo regra) {
		this.regra = regra;
	}
	
	public RegradeCalculo getRegra() {
		return regra;
	}
 }
