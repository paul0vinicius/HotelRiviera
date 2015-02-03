package projetolp2.hotelriviera;

public class ExecutivoSimples extends Executivo {
	private final static double VALOR_DIARIA_EXSIMPLES= 360;
	
	public ExecutivoSimples(int numeroDePessoas, boolean camaExtra, int codigoQuarto) throws Exception {
		super(numeroDePessoas, camaExtra, VALOR_DIARIA_EXSIMPLES, codigoQuarto);
		tipoQuarto = "EXECUTIVO_SIMPLES";
	}
	
	@Override
	public String toString () {
		return super.toString() + "\nTipo de quarto: Executivo Simples";
	}
}
