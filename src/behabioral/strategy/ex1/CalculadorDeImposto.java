package behabioral.strategy.ex1;

public class CalculadorDeImposto {

	public void realizarCalculoIcms(Orcamento orcamento) {
		double icms = new ICMS().calcularIcms(orcamento);
		System.out.println(icms);
	}

	public void realizarCalculoIss(Orcamento orcamento) {
		double iss = new ISS().calcularIss(orcamento);
		System.out.println(iss);
	}
}
