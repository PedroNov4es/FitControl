package exception;

/**
 * Exceção para plano vencido.
 */
public class PlanoVencidoException extends Exception {

    public PlanoVencidoException(
            String mensagem
    ) {

        super(mensagem);
    }
}