package behabioral.chainOfResponsability.ex1;

public class DescontoPorMaisDeQuinhentosReais {

	public double desconta(Orcamento orcamento) {
		if(orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		}else {
			return 0;
		}
	}
}
