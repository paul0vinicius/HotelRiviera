package projetolp2.hotelriviera;

import java.util.*;

public class Contrato {
	private Hospede hospede;
	private String numeroCartao;
	private int numeroDias;
	private Quarto quarto;
	private ArrayList<Adicional> adicionais;
	
	public Contrato (Hospede hospede, String numeroCartao, int numeroDias, Quarto quarto) throws Exception, NullPointerException, StringVaziaNullException {
		if (hospede == null || quarto == null || numeroCartao == null) {
			throw new ObjetoInvalidoException("O objeto passado eh nulo. ");
		}
		if (numeroCartao == "") {
			throw new StringVaziaException("O numero do cartao passado eh invalido");
		}
		if (numeroDias < 1) {
			throw new NumeroNegativoException("O número de dias não pode ser negativo.");
		}
		adicionais = new ArrayList<Adicional>();
		this.hospede = hospede;
		this.numeroCartao = numeroCartao;
		this.numeroDias = numeroDias;
		this.quarto = quarto;
	}
	
	public boolean adicionaAdicionais (Adicional adicional) throws NullPointerException {
		if (adicional == null) {
			throw new NullPointerException();
		}
		return adicionais.add(adicional);
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) throws NullPointerException {
		if (hospede == null) {
			throw new NullPointerException();
		}
		this.hospede = hospede;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) throws StringVaziaNullException {
		if (numeroCartao == "" || numeroCartao == null) {
			throw new StringVaziaNullException();
		}
		this.numeroCartao = numeroCartao;
	}

	public int getNumeroDias() {
		return numeroDias;
	}

	public void setNumeroDias(int numeroDias) throws Exception {
		if (numeroDias < 1) {
			throw new Exception("O número de dias não pode ser negativo.");
		}
		this.numeroDias = numeroDias;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) throws NullPointerException {
		if (quarto == null) {
			throw new NullPointerException();
		}
		this.quarto = quarto;
	}

	public ArrayList<Adicional> getAdicionais() {
		return adicionais;
	}
	
	private class StringVaziaNullException extends Exception {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
		public String getMessage () {
			return "A string não pode ser vazia ou nula.";
		}
	}
}
