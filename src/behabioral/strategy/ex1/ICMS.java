package behabioral.strategy.ex1;

public class ICMS {
	
	public double calcularIcms(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

}
