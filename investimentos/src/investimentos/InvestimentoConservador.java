package investimentos;

public class InvestimentoConservador implements Investimento{

	public double calculaValorInvestido(Investidor investidor){
		return investidor.getValorInvestimento() * 0.008;
	}
	
}
