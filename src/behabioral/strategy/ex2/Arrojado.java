package behabioral.strategy.ex2;

public class Arrojado implements Investimento{

	@Override
	public double calcularLucro(Conta conta) {
		if(new java.util.Random().nextDouble() <= 0.20) {
			return conta.getSaldo() * 0.05;
		}else if(new java.util.Random().nextDouble() <= 0.50) {
			return conta.getSaldo() * 0.03;
		}else {
			return conta.getSaldo() * 0.006;
		}
	}

}
