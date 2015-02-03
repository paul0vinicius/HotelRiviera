package projetolp2.hotelriviera;

public class Presidencial extends Quarto {
	private final static int LIMITE_PESSOAS_QUARTO_PRESIDENCIAL = 4;
	private final static double VALOR_DIARIA = 1200;
	
	public Presidencial(int numeroDePessoas, int codigoQuarto) throws Exception {
		super(numeroDePessoas, LIMITE_PESSOAS_QUARTO_PRESIDENCIAL, VALOR_DIARIA, codigoQuarto);
		tipoQuarto = "PRESIDENCIAL";
	}
	
	@Override
	public String toString () {
		return super.toString() + "\nTipo de quarto: Presidencial";
	}
}
