package behabioral.strategy.ex2;

public class TesteDeInvestimento {

	public static void main(String[] args) {
		Conta conta = new Conta(1000);
		
		Investimento conservador = new Conservador();
		Investimento moderado = new Moderado();
		Investimento arrojado = new Arrojado();
		
		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();
		realizadorDeInvestimentos.aplicarInvestimento(conta, conservador);
		realizadorDeInvestimentos.aplicarInvestimento(conta, moderado);
		realizadorDeInvestimentos.aplicarInvestimento(conta, arrojado);
		
	}
}
