package projetolp2.hotelriviera;

public abstract class Quarto implements ServicosHotel {
	private int numeroPessoas;
	private double valorDiaria;
	private boolean quartoOcupado = false;
	private int codigoQuarto;
	protected String tipoQuarto;
	private int limitePessoasQuarto;
	
	public Quarto (int numeroDePessoas, int limitePessoasQuarto, double diaria, int codigoQuarto) throws Exception {
		checaExcecoes(numeroDePessoas, limitePessoasQuarto);
		this.limitePessoasQuarto = limitePessoasQuarto;
		this.codigoQuarto = codigoQuarto;
		this.numeroPessoas = numeroDePessoas;
		this.valorDiaria = diaria;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public int getNumeroPessoas() {
		return numeroPessoas;
	}
	
	public void setNumeroPessoas(int numeroPessoas) throws Exception {
		checaExcecoes(numeroPessoas, limitePessoasQuarto);
		this.numeroPessoas = numeroPessoas;
	}

	public boolean getQuartoOcupado() {
		return quartoOcupado;
	}

	public void setQuartoOcupado(boolean statusQuarto) {
		this.quartoOcupado = statusQuarto;
	}

	public int getCodigoQuarto() {
		return codigoQuarto;
	}
	
	public String getTipoQuarto () {
		return tipoQuarto;
	}

	private void checaExcecoes (int pessoas, int limitePessoasQuarto) throws Exception {
		if (!(pessoas >= 0 && pessoas <= limitePessoasQuarto)) {
			throw new Exception("A quantidade de pessoas no quarto não pode exceder o limite"
					+ " estabelecido de " + limitePessoasQuarto + " pessoas.");
		}
	}

	@Override
	public double getValorServico() {
		return getValorDiaria();
	}
	
	@Override
	public String toString () {
		return "O código do quarto é: " + getCodigoQuarto() + "\nO quarto se encontra " + getQuartoOcupado()
				+ " e o valor da diária é " + getValorDiaria();
	}

}
