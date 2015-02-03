package projetolp2.hotelriviera;

public class Excecao extends Exception{
	private String message;
	
	public Excecao(String message) {
		super(message);
        this.message = message;
	}
	public String getMessage(){
		return message;
	}
}