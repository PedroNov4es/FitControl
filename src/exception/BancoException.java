package exception;

/**
 * Exceção personalizada para erros de banco.
 */
public class BancoException extends RuntimeException {

    public BancoException(String mensagem) {

        super(mensagem);
    }
}