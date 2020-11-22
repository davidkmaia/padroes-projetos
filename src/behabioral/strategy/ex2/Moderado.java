package behabioral.strategy.ex2;

public class Moderado implements Investimento{

	@Override
	public double calcularLucro(Conta conta) {
		if(new java.util.Random().nextDouble() > 0.50) {
			return conta.getSaldo() * 0.025;
		}else {
			return conta.getSaldo() * 0.007;
		}
	}

}
