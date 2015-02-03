package projetolp2.hotelriviera;

import java.sql.Time;
import java.util.GregorianCalendar;

public class Babysitter implements Adicional {
	private double precoServico;
	private int horasServico;
	private final static double SERVICO_HORA_NORMAL = 25;
	private final static double SERVICO_HORA_DOBRADA = SERVICO_HORA_NORMAL * 2;
	private GregorianCalendar diaServico;
	private Time horaInicio;
	
	public Babysitter (boolean horaDobrada, int horasServico, Time horaInicio, GregorianCalendar diaServico) throws Exception {
		if (horasServico < 0 || horasServico > 12) throw new Exception("O número de horas não pode ser negativo ou acima de 12.");
		this.diaServico = diaServico;
		this.horaInicio = horaInicio;
		this.horasServico = horasServico;
		if (horaDobrada) precoServico = SERVICO_HORA_DOBRADA;
		else precoServico = SERVICO_HORA_NORMAL;
	}

	public double getPrecoServico() {
		return precoServico * horasServico;
	}

	@Override
	public double getValorServico() {
		return getPrecoServico();
	}
	
	@Override
	public String toString() {
		return " - Babysitter - \nValor por hora: " + precoServico + "\nValor total de serviço: " + getValorServico();
	}
}
