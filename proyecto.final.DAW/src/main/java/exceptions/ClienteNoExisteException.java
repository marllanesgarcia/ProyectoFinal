package exceptions;

public class ClienteNoExisteException extends Exception{

	public ClienteNoExisteException(String mensaje) {
		super(mensaje);
	}
}
