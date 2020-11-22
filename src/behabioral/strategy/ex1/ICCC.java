package behabioral.strategy.ex1;

public class ICCC implements Imposto{

	@Override
	public double calcular(Orcamento orcamento) {
		double percentualDeImposto = 0;
		if(orcamento.getValor() < 1000) {
			percentualDeImposto = 0.05;
		}else if (orcamento.getValor() >= 1000 && orcamento.getValor() <= 3000) {
			percentualDeImposto = 0.07;
		}else {
			percentualDeImposto = 0.08;
		}
		double iccc = orcamento.getValor() * percentualDeImposto;
		System.out.println("ICCC de : " + percentualDeImposto  + " com total de " + iccc);
		return iccc;
	}

}
