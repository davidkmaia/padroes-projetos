package behabioral.chainOfResponsability.ex1;

public class TesteDeDescontos {

	public static void main(String[] args) {

		CalculadorDeDesconto calculadorDeDesconto = new CalculadorDeDesconto();
		Orcamento orcamento = new Orcamento(600);
		orcamento.adicionaItem(new Item("Caneta", 250));
		orcamento.adicionaItem(new Item("Lapis", 250));
		
		double descontoFinal = calculadorDeDesconto.calcula(orcamento);
		
		System.out.println(descontoFinal);
	}

}
