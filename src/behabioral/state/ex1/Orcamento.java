package behabioral.state.ex1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	private BigDecimal valor;
	private int qtdItens;
	private String situacao;
	
	public Orcamento(BigDecimal valor, int qtdItens) {
		this.valor = valor;
		this.qtdItens = qtdItens;
	}
	
	public void aplicarDescontoExtra() {
		BigDecimal valorDescontoExtra = BigDecimal.ZERO;
		if(situacao.equals("EM_ANALISE")) {
			valorDescontoExtra = new BigDecimal("0.05");
		}else if(situacao.equals("APROVADO")){
			valorDescontoExtra = new BigDecimal("0.02");
		}
		this.valor = this.valor.subtract(valorDescontoExtra);
	}
	
	
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public int getQtdItens() {
		return qtdItens;
	}
	public void setQtdItens(int qtdItens) {
		this.qtdItens = qtdItens;
	}
}
