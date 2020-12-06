package behabioral.chainOfResponsability.ex1;

public interface Desconto {
	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo);
}
