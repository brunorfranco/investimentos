package investimentos;

public class InvestimentoArrojado implements Investimento {

	public double calculaValorInvestido(Investidor investidor){
		boolean escolhido1 = Math.random() > 0.20;
		boolean escolhido2 = Math.random() > 0.30;
		if(escolhido1 == true){
			return investidor.getValorInvestimento() * 0.05;
		} else if(escolhido2 == true){
			return investidor.getValorInvestimento() * 0.03;
		} else {
			return investidor.getValorInvestimento() * 0.06;
		}
	}

}
