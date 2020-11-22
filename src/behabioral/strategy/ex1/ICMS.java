package behabioral.strategy.ex1;

public class ICMS implements Imposto {

	public double calcular(Orcamento orcamento) {
		double icms = orcamento.getValor() * 0.1;
		System.out.println("ICMS: " + icms);
		return icms;
	}

}
