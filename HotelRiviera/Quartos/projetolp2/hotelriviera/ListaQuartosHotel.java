package projetolp2.hotelriviera;

import java.util.ArrayList;

public class ListaQuartosHotel {
	private ArrayList<Quarto> quartosHotel;
	
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
	
	public ArrayList<Quarto> consultaQuartosDisponiveis () {
		ArrayList<Quarto> quartosDisponiveis = new ArrayList<Quarto>();
		for (Quarto a: quartosHotel) {
			if (a.getQuartoOcupado() == false) {
				quartosDisponiveis.add(a);
				System.out.println(a);
			}
		}
		return quartosDisponiveis;
	}
	
	//public boolean reservaQuarto () {
		
	//}
	
//	public ArrayList<Quarto> consultaQuarto (Quarto quarto) {
//		if (quarto instanceof Executivo) {
//			if (quarto instanceof ExecutivoSimples) {
//				ExecutivoSimples executivoSimples = (ExecutivoSimples) quarto;
//			}
//		}
//		else if (quarto instanceof Executivo)
//	}
	
}