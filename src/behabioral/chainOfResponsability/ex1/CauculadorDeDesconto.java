package behabioral.chainOfResponsability.ex1;

public class CauculadorDeDesconto {
	
	public double calcula(Orcamento orcamento) {
		//mais de 5 itens, desconto
		if(orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		}else if(orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		}
		
		return 0;
	}

}
