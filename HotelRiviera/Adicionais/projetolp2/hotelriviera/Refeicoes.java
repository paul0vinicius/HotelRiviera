package projetolp2.hotelriviera;

public class Refeicoes implements Adicional {
	private double valorTotalConsumido;

	@Override
	public double getValorServico() {
		return getValorTotalConsumido();
	}
	
	public double getValorTotalConsumido() {
		return valorTotalConsumido;
	}
	
	public double acrescentaRefeicao (double valorRefeicao) {
		valorTotalConsumido += valorRefeicao;
		
		return valorTotalConsumido;
	}
	
	@Override
	public String toString(){
		return " - Refeicoes - \nValor total consumido: " + getValorTotalConsumido();
	}

}
