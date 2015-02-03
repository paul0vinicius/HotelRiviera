package projetolp2.hotelriviera;

public abstract class Luxo extends Quarto {
	private final static int LIMITE_PESSOAS_QUARTO_LUXO = 3;
	private final static double VALOR_DIARIA = 0;
	private boolean camaExtra;

	public Luxo(int numeroDePessoas, boolean camaExtra, double diaria, int codigoQuarto) throws Exception {
		super(numeroDePessoas, LIMITE_PESSOAS_QUARTO_LUXO, VALOR_DIARIA, codigoQuarto);
		this.camaExtra = camaExtra;
		setValorDiaria(diaria);
	}
	
	public void setCamaExtra (boolean camaExtra) {
		this.camaExtra = camaExtra;
	}
	
	public boolean temCamaExtra() {
		return camaExtra;
	}
	
}
