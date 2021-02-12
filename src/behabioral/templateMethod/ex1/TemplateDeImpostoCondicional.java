package behabioral.templateMethod.ex1;

public abstract class TemplateDeImpostoCondicional implements Imposto{

	@Override
	public double calcular(Orcamento orcamento) {
		if (deveUsarAMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		}else {
			return minimaTaxacao(orcamento);
		}
	}

	protected abstract boolean deveUsarAMaximaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract double minimaTaxacao(Orcamento orcamento);

	
}
