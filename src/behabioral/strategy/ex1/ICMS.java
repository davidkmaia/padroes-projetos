package behabioral.strategy.ex1;

public class ICMS implements Imposto{
	
	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

}
