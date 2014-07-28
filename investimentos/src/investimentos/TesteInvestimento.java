package investimentos;

public class TesteInvestimento {

	public static void main(String[] args) {
		
		Investimento investimento1 = new InvestimentoConservador();
		Investimento investimento2 = new InvestimentoArrojado();
		Investimento investimento3 = new InvestimentoModerado();
		
		Investidor investidor = new Investidor(10000);
		
		RealizadorDeInvestimentos realizador = new RealizadorDeInvestimentos();
		realizador.realizaInvestimento(investidor, investimento1);
		realizador.realizaInvestimento(investidor, investimento2);
		realizador.realizaInvestimento(investidor, investimento3);
	}
}
