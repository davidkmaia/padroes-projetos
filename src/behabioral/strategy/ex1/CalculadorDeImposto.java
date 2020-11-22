package behabioral.strategy.ex1;

public class CalculadorDeImposto {

	public void realizarCalculo(Orcamento orcamento, Imposto imposto) {
		double resultado = imposto.calcular(orcamento);
		System.out.println(resultado);
	}

}
