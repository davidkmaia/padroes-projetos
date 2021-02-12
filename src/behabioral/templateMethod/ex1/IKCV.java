package behabioral.templateMethod.ex1;

public class IKCV extends TemplateDeImpostoCondicional{

	private boolean temItemMaiorQue100Reais(Orcamento orcamento) {
		for(Item item : orcamento.getItens()) {
			if(item.getValor() > 100) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deveUsarAMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100Reais(orcamento);
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
