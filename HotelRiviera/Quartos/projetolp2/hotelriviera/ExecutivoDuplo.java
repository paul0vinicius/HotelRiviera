package projetolp2.hotelriviera;

public class ExecutivoDuplo extends Executivo {
	private final static double VALOR_DIARIA_EXDUPLO= 385;
	
	public ExecutivoDuplo(int numeroDePessoas, boolean camaExtra, int codigoQuarto) throws Exception {
		super(numeroDePessoas, camaExtra, VALOR_DIARIA_EXDUPLO, codigoQuarto);
		tipoQuarto = "EXECUTIVO_DUPLO";
	}
	
	@Override
	public String toString () {
		return super.toString() + "\nTipo de quarto: Executivo Duplo";
	}
}
