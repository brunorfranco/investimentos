package investimentos;


public class RealizadorDeInvestimentos {

	public void realizaInvestimento(Investidor investidor, Investimento investimento){
		double valor = investimento.calculaValorInvestido(investidor);
		System.out.println(valor);
	}
	
}
