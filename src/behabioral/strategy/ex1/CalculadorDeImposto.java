package behabioral.strategy.ex1;

public class CalculadorDeImposto {
	
	public void realizaCalculo(Orcamento orcamento, String imposto) {
		
		if(imposto.equals("ICMS")){
			double icms = orcamento.getValor() * 0.1;
			System.out.println(icms);
		}else {
			double iss = orcamento.getValor() * 0.06;
			System.out.println(iss);
		}
	}
}
