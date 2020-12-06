package behabioral.chainOfResponsability.ex1;

public class DescontoPorCincoItens {

	public double desconta(Orcamento orcamento) {
		if(orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		}else {
			return 0;
		}
	}
}
