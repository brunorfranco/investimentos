package investimentos;


public class InvestimentoModerado implements Investimento{

	public double calculaValorInvestido(Investidor investidor){
		boolean escolhido = Math.random() > 0.50;
		if(escolhido == true){
			return investidor.getValorInvestimento() * 0.025;
		}
		else {
			return investidor.getValorInvestimento() * 0.007;
		}
	}
	
}
