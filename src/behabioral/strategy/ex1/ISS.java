package behabioral.strategy.ex1;

public class ISS {
	
	public double calcularIss(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
