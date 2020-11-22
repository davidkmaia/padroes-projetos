package behabioral.strategy.ex1;

public class ISS implements Imposto{
	
	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
