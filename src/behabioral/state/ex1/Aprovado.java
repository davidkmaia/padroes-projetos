package behabioral.state.ex1;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento {

	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		// TODO Auto-generated method stub
		orcamento.setSituacao(new Finalizado());
	}

}
