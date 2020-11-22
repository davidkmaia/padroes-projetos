package behabioral.strategy.ex2;

public class RealizadorDeInvestimentos {
	
	public void aplicarInvestimento(Conta conta, Investimento investimento) {
		double lucroLiquido = (investimento.calcularLucro(conta) * 0.75);
		double imposto = (investimento.calcularLucro(conta) * 0.25);
		conta.depositar(lucroLiquido);
		System.out.println("Lucro " + lucroLiquido);
		System.out.println("Imposto " + imposto);
		System.out.println("Saldo atual " + conta.getSaldo());
	}
}

