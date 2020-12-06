package behabioral.chainOfResponsability.ex1;

public class CalculadorDeDesconto {
	
	public double calcula(Orcamento orcamento) {

		double desconto = new DescontoPorCincoItens().desconta(orcamento);
		if(desconto == 0) {
			desconto = new DescontoPorMaisDeQuinhentosReais().desconta(orcamento);
		}
		//ainda tem problema.... aclasse cresce pra sempre
		
		
		return 0;
	}

}
