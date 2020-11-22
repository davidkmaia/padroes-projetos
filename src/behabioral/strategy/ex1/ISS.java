package behabioral.strategy.ex1;

public class ISS implements Imposto{
	
	public double calcular(Orcamento orcamento) {
		double iss = orcamento.getValor() * 0.06;
		System.out.println("ISS: " + iss);
		return iss;
	}

}
