/*
 * Caso de Uso2: Criar, pesquisar, atualizar e remover Servi�os
 O hotel disponibiliza um conjunto de servi�os para seus h�spedes. Esses servi�os s�o inclu�dos nos
 contratos e englobam os quartos (servi�o b�sico) e servi�os adicionais como aluguel de carros, 
 babysitter e restaurante.

 Todo servi�o possui uma descri��o e pre�o por unidade, podendo ter ainda a descri��o por cada unidade
 do servi�o. Cada tipo de servi�o ter� suas especifidades. Por exemplo, os quartos podem ou n�o ter cama 
 adicional (o que influencia no pre�o do quarto) e ainda comportar quantidade de pessoas diferentes. Note 
 que existem diferentes categorias de quartos (PRESIDENCIAL, LUXO_SIMPLES, LUXO_DUPLO, LUXO_TRIPLO, 
 EXECUTIVO_SIMPLES, EXECUTIVO_SIMPLES, EXECUTIVO_DUPLO, EXECUTIVO_TRIPLO), os quartos presidenciais 
 comportam at� 4 pessoas e os demais at� 3 pessoas. 

 Um servi�o adicional � o aluguel de carros. Nesse caso, tem-se a identifica��o do carro e a quantidade 
 de di�rias. As di�rias dependem da categoria do aluguel (AUTOMOVEL_LUXO, AUTOMOVEL_EXECUTIVO) e as
 taxas extras referentes ao seguro e tanque cheio. Note que essas faixas s�o fixas.

 Deve ser poss�vel criar, pesquisar, atualizar e remover servi�os do hotel.
 */

package projetolp2.hotelriviera;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.crypto.Data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CasoDeUso3 {
	
	private Quarto quartoDeTestes;
	private Contrato contrato1;
	private Contrato contrato2;
	private Quarto quarto1;
	private Quarto quarto2;
	private final boolean NAO_TEM_CAMA_EXTRA = false;
	private final boolean TEM_CAMA_EXTRA = true;
	private static ListaQuartosHotel listaQuartos;
	Quarto luxoSimples, luxoDuplo, luxoTriplo, presidencial, executivoSimples, executivoDuplo, executivoTriplo;
	
	@Before
	public void CriarContratos() throws Exception{
		Hospede hospede1 = new Hospede ("Jorge Ferreira Amaral",
										"Av. Campinas, 567, Tambau, Joao Pessoa - PB",
										"234.674.897-45",
										"(83) 8546-5435",
										new GregorianCalendar(1990, 01, 22));
		
		Hospede hospede2 = new Hospede ("Caio Lima Albuqerque",
										"Rua Florencia, 134, Boa Viagem, Reife - PE",
										"675.976.453-76",
										"(82) 3546-5876",
										new GregorianCalendar(1990, 02, 28));
		
		listaQuartos = new ListaQuartosHotel();
		Quarto quarto1 = listaQuartos.getQuarto(11);
		Quarto quarto2 = listaQuartos.getQuarto(1);
		
		contrato1 = new Contrato(hospede1, "2314-4313-3123-1234", 7, quarto1);
		quarto1.setNumeroPessoas(2);
		contrato2 = new Contrato(hospede2, "2314-5455-3198-1094", 12, quarto2);
		quarto2.setNumeroPessoas(3);
		
		Babysitter babysitter1 = new Babysitter(false, 5);
		AluguelCarro aluguel1 = new AluguelCarro(new CarroExecutivo(false, true));
		contrato1.adicionaAdicionais(babysitter1);
		contrato2.adicionaAdicionais(aluguel1);
		
		luxoSimples = new LuxoSimples(0, NAO_TEM_CAMA_EXTRA, 0);
		presidencial = new Presidencial(0, 0);
		executivoSimples = new ExecutivoSimples(0, NAO_TEM_CAMA_EXTRA, 0);
		luxoDuplo = new LuxoDuplo(0, NAO_TEM_CAMA_EXTRA, 0);
		executivoDuplo = new ExecutivoDuplo(0, NAO_TEM_CAMA_EXTRA, 0);
		luxoTriplo = new LuxoTriplo(0, 0);
		executivoTriplo = new ExecutivoTriplo(0, 0);
	}
	
	@Test
	public void testaCriarContratos() throws Exception {
		try {
			quartoDeTestes = luxoSimples;
			new Contrato(null, "666-666-666-6666", 15, quartoDeTestes);
			Assert.fail("Deve falhar, o contrato não pode aceitar um hóspede nulo.");
		} catch (Exception e) {
			Assert.assertEquals("As informações sobre o quarto ou hóspede estão incorretas.", e.getMessage());
		}

		try {
			
		} catch (Exception e) {
			
		}
	}
	
	
}

