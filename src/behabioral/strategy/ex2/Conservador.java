package behabioral.strategy.ex2;

public class Conservador implements Investimento{

	@Override
	public double calcularLucro(Conta conta) {
		return conta.getSaldo() * 0.008;
	}
	
}
