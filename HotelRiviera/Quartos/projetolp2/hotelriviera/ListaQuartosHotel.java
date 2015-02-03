package projetolp2.hotelriviera;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaQuartosHotel {
	private ArrayList<Quarto> quartosHotel;
	private final boolean QUARTO_OCUPADO = true;
	private ArrayList<Quarto> quartosDisponiveis;
	
	public ListaQuartosHotel() throws Exception {
		quartosHotel = new ArrayList<Quarto>();
		int codPresidencial = 1; 
		int codLuxoSimples = 11;
		int codLuxoDuplo = 21;
		int codLuxoTriplo = 101;
		int codExecutivoSimples = 201;
		int codExecutivoDuplo = 301;
		int codExecutivoTriplo = 401;
		
		
		for (int i = 0; i < 20; i++) {
			if (i < 5) {
				quartosHotel.add(new Presidencial(0, codPresidencial));
				quartosHotel.add(new LuxoSimples(0, false, codLuxoSimples));
				quartosHotel.add(new ExecutivoSimples(0, false, codExecutivoSimples));
			}
			
			codPresidencial++;
			codLuxoSimples++;
			codExecutivoSimples++;
			
			if (i < 15) {
				quartosHotel.add(new LuxoDuplo(0, false, codLuxoDuplo));
				quartosHotel.add(new ExecutivoDuplo(0, false, codExecutivoDuplo));
			}
			
			codLuxoDuplo++;
			codExecutivoDuplo++;
			
			if (i < 20) {
				quartosHotel.add(new LuxoTriplo(0, codLuxoTriplo));
				quartosHotel.add(new ExecutivoTriplo(0, codExecutivoTriplo));
			}
			codLuxoTriplo++;
			codExecutivoTriplo++;
		}
		
		
	}
	
	public ArrayList<Quarto> getQuartosDisponiveis () {
		atualizaQuartosDisponiveis();
		return quartosDisponiveis;
	}
	
	public ArrayList<Quarto> getQuartosDisponiveis (Quarto quarto) throws Exception {
		if (quarto == null) throw new ObjetoInvalidoException("Parametro de entrada incorreto.");
		String tipoQuarto = checaTipoQuarto(quarto);
		atualizaQuartosDisponiveis();
		
		for (Iterator<Quarto> i = quartosDisponiveis.iterator(); i.hasNext();) {
			Quarto a = i.next();
			if (!(a.getTipoQuarto().equals(tipoQuarto) && a.getQuartoOcupado() == false)) {
				i.remove();
			}
		}
		return quartosDisponiveis;
	}

	public boolean setQuarto (boolean statusQuarto, int codigoQuarto) {
		Quarto quarto = getQuarto(codigoQuarto);
		if (quarto == null) return false;
		quarto.setQuartoOcupado(statusQuarto);
		return true;
	}
	
	public Quarto getQuarto (int codigoQuarto) {
		for (Quarto a: quartosHotel) {
			if (a.getCodigoQuarto() == codigoQuarto) return a;
		}
		return null;
	}
	
	public boolean reservaQuarto (int numeroPessoas, int codigoQuarto) throws Exception {
		for (Quarto a: quartosHotel) {
			if (codigoQuarto == a.getCodigoQuarto() && a.getQuartoOcupado() == false) {
				a.setNumeroPessoas(numeroPessoas);
				a.setQuartoOcupado(QUARTO_OCUPADO);
				return true;
			}
		}
		return false;
	}

	private void atualizaQuartosDisponiveis () {
		quartosDisponiveis = new ArrayList<Quarto>();
		for (Quarto a: quartosHotel) {
			if (a.getQuartoOcupado() == false) {
				quartosDisponiveis.add(a);
			}
		}
	}
	
	private String checaTipoQuarto (Quarto quarto) {
		return quarto.getTipoQuarto();
	}
	
}
