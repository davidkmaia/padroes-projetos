package behabioral.strategy.ex1;

public class TesteDeImpostos {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(5000);
		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		Imposto iccc = new ICCC();
		
		icms.calcular(orcamento);
		iss.calcular(orcamento);
		iccc.calcular(orcamento);
		
	}

}
