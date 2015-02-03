package projetolp2.hotelriviera;

public abstract class Executivo extends Quarto {
	private final static int LIMITE_PESSOAS_QUARTO_EXECUTIVO = 3;
	private final static double VALOR_DIARIA = 0;
	private boolean camaExtra;
	
	public Executivo(int numeroDePessoas, boolean camaExtra, double diaria, int codigoQuarto) throws Exception {
		super(numeroDePessoas, LIMITE_PESSOAS_QUARTO_EXECUTIVO, VALOR_DIARIA, codigoQuarto);
		setValorDiaria(diaria);
	}
	
	public void setCamaExtra (boolean camaExtra) {
		this.camaExtra = camaExtra;
	}

	public boolean temCamaExtra() {
		return camaExtra;
	}

}
