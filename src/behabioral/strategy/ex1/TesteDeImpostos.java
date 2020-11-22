package behabioral.strategy.ex1;

public class TesteDeImpostos {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(500);
		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		
		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
		calculadorDeImposto.realizarCalculo(orcamento, icms);
		calculadorDeImposto.realizarCalculo(orcamento, iss);
		
	}

}
